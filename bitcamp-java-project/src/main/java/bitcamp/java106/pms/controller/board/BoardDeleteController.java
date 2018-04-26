package bitcamp.java106.pms.controller.board;

import java.io.PrintWriter;
import java.util.Scanner;

import bitcamp.java106.pms.annotation.Component;
import bitcamp.java106.pms.controller.Controller;
import bitcamp.java106.pms.dao.BoardDao;
import bitcamp.java106.pms.domain.Board;
import bitcamp.java106.pms.server.ServerRequest;
import bitcamp.java106.pms.server.ServerResponse;
import bitcamp.java106.pms.util.Console;

@Component("/board/delete")
public class BoardDeleteController implements Controller {
    BoardDao boardDao;

    public BoardDeleteController(BoardDao boardDao) {
        this.boardDao = boardDao;
    }

    @Override
    public void service(ServerRequest request, ServerResponse response) {
        PrintWriter out = response.getWriter();
        int no = Integer.parseInt(request.getParameter("no"));
        
        try {
            int count = boardDao.delete(no);
            if (count == 0) {
                out.println("유효하지 않은 게시물 번호");
            } else {
                out.println("삭제 완료");
            }
        } catch (Exception e) {
            out.println("삭제 실패");
            e.printStackTrace(out);
        }
    }
}



//ver 26 - BoardController에서 delete() 메서드를 추출하여 클래스로 정의. 
