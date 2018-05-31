// Spring과 mybatis 연동 : 설정이 아닌 객체를 통해 sqlSessionFactory 만들기
package bitcamp.java106.step12.ex2;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import bitcamp.java106.BeanUtils;
import bitcamp.java106.step12.Board;

public class Exam01 {

    public static void main(String[] args) {
        ApplicationContext iocContainer = new ClassPathXmlApplicationContext(
                "bitcamp/java106/step12/ex2/application-context.xml");

        BeanUtils.printBeanNames(iocContainer);
        //error 출력
        //Caused by: org.springframework.beans.factory.NoSuchBeanDefinitionException: No qualifying bean of type 
        //'org.apache.ibatis.session.SqlSessionFactory' available: expected at least 1 bean which qualifies as autowire candidate.
        //Dependency annotations: {}
        // => application-context.xml 가져오기
        
        BoardDao boardDao = iocContainer.getBean(BoardDao.class);
        
        //1) 게시물 입력
        Board board = new Board();
        board.setTitle("제목");
        board.setContent("내용");
        boardDao.insert(board);
        
        //2) 게시물 목록 조회
        List<Board> list = boardDao.selectList(1, 5);
        for(Board b : list) {
            System.out.printf("%d, %s, %s\n", 
                    b.getNo(),
                    b.getTitle(),
                    b.getRegisteredDate());
        }
    }

}
