package bitcamp.java106.pms.servlet.board;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bitcamp.java106.pms.dao.BoardDao;
import bitcamp.java106.pms.domain.Board;
import bitcamp.java106.pms.server.ServerRequest;
import bitcamp.java106.pms.server.ServerResponse;
import bitcamp.java106.pms.servlet.InitServlet;

@WebServlet("/board/add")
public class BoardAddServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    
    BoardDao boardDao;

    @Override
    public void init() throws ServletException {
        //Spring IOC Container에서 servlet 객체를 관리하는것이 아니기 때문에 
        //Spring IOC Container에 들어있는 DAO 객체를 자동으로 주입받을 수 없다.
        //servlet을 생성할 때 Spring IOC Container에서 직접 DAO를 꺼내와야한다.
        boardDao = InitServlet.getApplicationContext().getBean(BoardDao.class);
    }
    
    @Override
    protected void doPost(
            HttpServletRequest request,
            HttpServletResponse response) throws ServletException, IOException {
        
        //클라이언트가 보낸 데이터의 charset을 알려준다.
        // 이것을 확인하고 String(UTF-16)객체로 값을 꺼낼 수 있다.
        request.setCharacterEncoding("UTF-8");
        
        Board board = new Board();
        board.setTitle(request.getParameter("title"));
        board.setContent(request.getParameter("content"));
        board.setCreatedDate(new Date(System.currentTimeMillis()));
        
        response.setContentType("text/plain;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            boardDao.insert(board);
            out.println("등록 성공!");
        } catch (Exception e) {
            out.println("등록 실패!");
            e.printStackTrace(out);
        }
    }

}

//ver 31 - JDBC API가 적용된 DAO 사용
//ver 28 - 네트워크 버전으로 변경
//ver 26 - BoardController에서 add() 메서드를 추출하여 클래스로 정의. 
