//클라이언트가 보낸 key와 value를 한꺼번에 꺼내기
package step03;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;
import java.util.Set;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/step03/exam08")
public class Exam08 extends GenericServlet {
    private static final long serialVersionUID = 1L;

    @Override
    public void service(
            ServletRequest request, 
            ServletResponse response) throws ServletException, IOException {
        
        //GET 요청의 데이터를 꺼낼 경우에는 다음 코드는 의미가 없다.
        // 그러나 POST 요청의 데이터를 꺼낼 경우를 대비하여 놔둔다.
        request.setCharacterEncoding("UTF-8"); 
                
        Map<String,String[]> paramMap = request.getParameterMap();
        
        response.setContentType("text/plan; charset=UTF-8");
        PrintWriter out = response.getWriter();
        Set<String> nameSet = paramMap.keySet();
        for (String name : nameSet) {
            out.printf("%s = ", name); //key 출력
            String[] values = paramMap.get(name); // value 배열 추출
            for(String value : values) { //반복문을 통한 value 값 추출
                out.printf("%s,", value); // value 출력
            }
            out.println();
        }
    }
}
