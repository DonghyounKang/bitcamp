package bitcamp.java106.pms.web;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;

import bitcamp.java106.pms.dao.BoardDao;
import bitcamp.java106.pms.domain.Board;

@Component("/board")
public class BoardController {

    BoardDao boardDao;

    public BoardController(BoardDao boardDao) {
        this.boardDao = boardDao;
    }

    
    @RequestMapping("/add")
    public String add (
            HttpServletRequest request, 
            HttpServletResponse response) throws Exception {

        Board board = new Board();
        board.setTitle(request.getParameter("title"));
        board.setContent(request.getParameter("content"));

        boardDao.insert(board);
        return "redirect:list.do";
    }

    @RequestMapping("/delete")
    public String delete (
            HttpServletRequest request, 
            HttpServletResponse response) throws Exception {

        int no = Integer.parseInt(request.getParameter("no"));
        int count = boardDao.delete(no);
        if (count == 0) {
            throw new Exception("해당 게시물이 없습니다.");
        }
        return "redirect:list.do";
    }

    @RequestMapping("/list")
    public String list (
            HttpServletRequest request, 
            HttpServletResponse response) throws Exception {        

        List<Board> list = boardDao.selectList();
        request.setAttribute("list", list);
        return "/board/list.jsp";
    }

    @RequestMapping("/update")
    public String update (
            HttpServletRequest request, 
            HttpServletResponse response) throws Exception {

        Board board = new Board();
        board.setNo(Integer.parseInt(request.getParameter("no")));
        board.setTitle(request.getParameter("title"));
        board.setContent(request.getParameter("content"));

        int count = boardDao.update(board);
        if (count == 0) {
            throw new Exception("해당 게시물이 존재하지 않습니다.");
        } 

        return "redirect:list.do";
    }

    @RequestMapping("/view")
    public String view (
            HttpServletRequest request, 
            HttpServletResponse response) throws Exception {

        int no = Integer.parseInt(request.getParameter("no"));
        Board board = boardDao.selectOne(no);
        if (board == null) {
            throw new Exception("유효하지 않은 게시물 번호입니다.");
        }
        request.setAttribute("board", board);
        return "/board/view.jsp";
    }

}







