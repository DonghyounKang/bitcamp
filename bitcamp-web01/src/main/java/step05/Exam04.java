//파일 업로드 - 다른 클라이언트가 올린 파일을 덮어 쓰지 않게 하기
package step05;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
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


@WebServlet("/step05/exam04")
public class Exam04 extends HttpServlet{
    private static final long serialVersionUID = 1L;
    
    @Override
    protected void doPost(
            HttpServletRequest request, 
            HttpServletResponse response) throws ServletException, IOException {
        //test 방법 
        //http://localhost:8888/bitcamp-web01/step05/exam02_test.html실행
        
        response.setContentType("text/plain;charset=UTF-8");
        PrintWriter out = response.getWriter();
        
        DiskFileItemFactory factory = new DiskFileItemFactory();
        ServletFileUpload upload = new ServletFileUpload(factory);
        
        try {
            Map<String, List<FileItem>> paramMap = upload.parseParameterMap(request);
            //파라미터 이름이 동일한 여러 값을 보낼 경우를 대비하여 List<FileItem>으로 선언, 보관 한다.
            
            out.printf("name = %s\n", paramMap.get("name").get(0).getString("UTF-8")); //리턴 타입 : file item 객체가 들어있는 리스트
            out.printf("age = %s\n", paramMap.get("age").get(0).getString());
            FileItem photo = paramMap.get("photo").get(0);
            String filename = newFilename(photo.getName());
            out.printf("photo = %s\n", filename);
            
            //업로드 파일을 저장한다.
            ServletContext appEnvInfo = request.getServletContext();
            String savedPath= appEnvInfo.getRealPath("/");
            out.println(savedPath);
            photo.write(new File(savedPath + "/" + newFilename(photo.getName())));
            
        } catch (Exception e) {
            out.println("멀티파트 데이터 분석중 오류발생");
        }
    }
    
    int count = 0;
    private String newFilename(String originFilename) {
        //파일확장자 추출하기
        //ex : XXX.png
        int lastIndex = originFilename.lastIndexOf(".");
        String extName = "";
        if(lastIndex>=0) {
            extName = originFilename.substring(lastIndex);
        } 
        //파일명 형식 : [업로드시각(milisc)]-[카운트].[확장자]
        return String.format("%d-%d%s",
                System.currentTimeMillis(),
                ++count,
                extName
                );
    }
}
