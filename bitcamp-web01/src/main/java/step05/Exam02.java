//파일 업로드 - 멀티파트 파라미터 값 추출하기 I
package step05;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;


@WebServlet("/step05/exam02")
public class Exam02 extends HttpServlet{
    private static final long serialVersionUID = 1L;
    
    @Override
    protected void doPost(
            HttpServletRequest request, 
            HttpServletResponse response) throws ServletException, IOException {
        //test 방법 
        //http://localhost:8888/bitcamp-web01/step05/exam02_test.html실행
        
        response.setContentType("text/plain;charset=UTF-8");
        PrintWriter out = response.getWriter();

        //멀티 파트로 전송된 POST 요청 데이터를 추출하려면 일반적인 방법으로는 안된다.
        //apache 라이브러리 사용
        //1) 의존라이브러리 정보 알아내기
        //      mavenrepository.com 검색
        //2) build.gradle에 의존라이브러리 정보 추가
        //3) > gradle eclipse 실행하여 이클립스 설정파일 갱신
        //4) 해당 프로젝트 갱신
        
        //apache-fileupload 라이브러리를 사용하여 클라이언트가 보낸 멀티파트 데이터를 추출
        //1) 클라이언트가 보낸 데이터가 멀티파트 형식인지 확인
     // Check that we have a file upload request
        boolean isMultipart = ServletFileUpload.isMultipartContent(request);
        if(!isMultipart) {
            out.println("멀티파트 형식이 아닙니다.");
        }
        
        //2) 멀티파트 데이터를 추출하여 저장소(디렉토리; HDD)에 저장할 공장 준비 
     // Create a factory for disk-based file items
        DiskFileItemFactory factory = new DiskFileItemFactory();

        //3) 멀티파트 데이터 분석기에 공장객체를 장착한다.
        //=> 멀티파트 데이터 분석기가 멀티파트데이터를 추출하며
        //   공장객체가 파일로 만들어 HDD에 저장한다.
     // Create a new file upload handler
        ServletFileUpload upload = new ServletFileUpload(factory);
        
        //4) 멀티파트로 전송된 요청 데이터 분석하기
     // Parse the request
        Map<String,String> paramMap = new HashMap<>(); //순서를 보장 X
        
        try {
            List<FileItem> items = upload.parseRequest(request);
            
            for(FileItem item : items) {
                if(item.isFormField()) { //일반적인 텍스트 항목
                    //파라미터의 한글이 깨질경우 ,
                    // => request.setCharacterEncoding("UTF-8")은 소용없다.
                    //    멀티파트가 아닌 application/x-www-form-urlencoded로 전송된 데이터에 대해서만 동작
                    // => 해결책?
                    //    getString(문자표)를 호출
                    out.printf("%s = %s\n", 
                            item.getFieldName(), //파라미터 명
                            item.getString("UTF-8")); //파라미터 값
                } else { //파일일 경우
                    out.printf("%s = %s\n", 
                            item.getFieldName(), //파라미터 명 
                            item.getName()); // 파일명
                    //클라이언트가 보낸 파일을 저장하자
                    // - 임의의 폴더(웹브라우저에서 접근할 수 없는 폴더)에 저장하면 웹브라우저에서 업로드한 파일을 다시 다운로드 받기 어렵다.
                    // - 임의의 폴더에 저장할 경우 다운로드를 처리해주는 서블릿을 별도로 만들어야한다. 
                    //좀더 쉬운방법은?
                    // - 웹 브라우저가 접근할 수 있는 폴더에 저장하자
                    //   단, 이 방법은 웹 브라우저에서 너무 쉽게 특정 파일을 접근할 수 있기 때문에 보안에 취약하다.
                    // 실무에서는?
                    // => 웹브라우저가 접근할 수 없는 곳에 저장한다.
                    //    오직 다운로드 서블릿을 통해서만 허가된 사용자가 다운로드 받을 수 있도록 한다. 
                    //
                    // 여기서는 파일 업로드 다운로드를 테스트하는 데 집중하기 위
                    //임의의 폴더가 아닌 웹브라우저가 접근 가능한 폴더에 저장하겠다.
                    // 즉 배치폴더에 저장하겠다.
                    // 배치폴더에 저장하기 위해서는 배치폴더의 전체경로를 알아야한다.
                    // => 웹 어플리케이션 환경 정보를 다루는 객체를 얻는다.
                    ServletContext appEnvInfo = request.getServletContext();
                    // => ServletContext객체를 통해 웹 어플리케이션의 루트 디렉토리의 실제경로 알아내기
                    String savedPath= appEnvInfo.getRealPath("/");
                    out.println(savedPath);
                    
                    //=>FileItem.write(저장할 경로) 호출하여 클라이언트가 보낼 파일을 저장한다.
                    // 업로드한 파일은 임시 폴더에 저장되어있다.
                    // 이 파일을 우리가 원하는 경로에 옮기는 것이다.
                    
                    item.write(new File(savedPath + "/" + item.getName()));
                    
                }
            }
        } catch (Exception e) {
            out.println("멀티파트 데이터 분석중 오류발생");
        }
    }
}
