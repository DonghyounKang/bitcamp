// Controller 규칙에 따라 메서드 작성
package bitcamp.java106.pms.controller.classroom;

import java.io.PrintWriter;

import bitcamp.java106.pms.annotation.Component;
import bitcamp.java106.pms.controller.Controller;
import bitcamp.java106.pms.dao.ClassroomDao;
import bitcamp.java106.pms.domain.Classroom;
import bitcamp.java106.pms.server.ServerRequest;
import bitcamp.java106.pms.server.ServerResponse;
import bitcamp.java106.pms.util.Console;

@Component("/classroom/delete")
public class ClassroomDeleteController implements Controller {
    ClassroomDao classroomDao;

    public ClassroomDeleteController( ClassroomDao classroomDao) {
        this.classroomDao = classroomDao;
    }

    public void service(ServerRequest request, ServerResponse response) {
        PrintWriter out = response.getWriter();
        int no = Integer.parseInt(request.getParameter("no"));

        try {
            int count = classroomDao.delete(no);
            if (count == 0) {
                out.println("유효하지 않은 교실 번호입니다.");
            } else {
                out.println("삭제완료");
            }
            
        } catch (Exception e) {
            out.println("삭제 실패");
            e.printStackTrace(out);
        }
    }
}

//ver 26 - ClassroomController에서 delete() 메서드를 추출하여 클래스로 정의.
