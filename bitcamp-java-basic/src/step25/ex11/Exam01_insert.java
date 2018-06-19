// spring -myBatis : 트랜젝션 전파 정책
package step25.ex11;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Exam01_insert {

    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext iocContainer = 
                new ClassPathXmlApplicationContext("step25/ex11/application-context.xml");

        BoardService boardService = iocContainer.getBean(BoardService.class);

        Board b1 = new Board().setNo(201).setTitle("1111").setContent("XXXX");
        Board b2 = new Board().setNo(202).setTitle("1111").setContent("XXXX");
        Board b3 = new Board().setNo(203).setTitle("1111").setContent("XXXX");
        Board b4 = new Board().setNo(201).setTitle("1111").setContent("XXXX");
        Board b5 = new Board().setNo(205).setTitle("1111").setContent("XXXX");
        
        boardService.test1(b1, b2, b3, b4, b5);
    }
}









