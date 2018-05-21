package bitcamp.java106.pms.servlet.classroom;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bitcamp.java106.pms.dao.ClassroomDao;
import bitcamp.java106.pms.domain.Classroom;
import bitcamp.java106.pms.servlet.InitServlet;

@SuppressWarnings("serial")
@WebServlet("/classroom/add")
public class ClassroomAddServlet extends HttpServlet {
    
    ClassroomDao classroomDao;
    
    @Override
    public void init() throws ServletException {
        classroomDao = InitServlet.getApplicationContext().getBean(ClassroomDao.class);
    }
    
    @Override
    protected void doPost(
            HttpServletRequest request, 
            HttpServletResponse response) throws ServletException, IOException {
        
        request.setCharacterEncoding("UTF-8");
        
        try {
            Classroom classroom = new Classroom();
            classroom.setTitle(request.getParameter("title"));
            classroom.setStartDate(Date.valueOf(request.getParameter("startDate")));
            classroom.setEndDate(Date.valueOf(request.getParameter("endDate")));
            classroom.setRoom(request.getParameter("room"));
            
            classroomDao.insert(classroom);
            response.sendRedirect("list");
            
        } catch (Exception e) {
            RequestDispatcher requestDispatcher = request.getRequestDispatcher("/error");
            request.setAttribute("error", e);
            request.setAttribute("title", "수업 등록 실패!");
            requestDispatcher.forward(request, response);
        }
    }
}

//ver 38 - redirect 적용
//ver 37 - 컨트롤러를 서블릿으로 변경
//ver 31 - JDBC API가 적용된 DAO 사용
//ver 28 - 네트워크 버전으로 변경
//ver 26 - ClassroomController에서 add() 메서드를 추출하여 클래스로 정의.
