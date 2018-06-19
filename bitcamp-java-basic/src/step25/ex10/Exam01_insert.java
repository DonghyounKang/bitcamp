// spring -myBatis : @Transactional 애노테이션을 사용하여 트랜젝션 적용
package step25.ex10;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Exam01_insert {

    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext iocContainer = 
                new ClassPathXmlApplicationContext("step25/ex10/application-context.xml");

        //트랜젝션 적용
        //1) @Transactional 애노테이션을 처리할 객체를 등록한다.
        //      =>application-context.xml에 객체 추가
        //2) 트랜젝션을 적용할 대상 메서드에 애노테이션을 붙인다.
        //      =>  BoardService 의 메서드에 @Transactional 애노테이션을 붙인다.
       
        BoardService boardService = iocContainer.getBean(BoardService.class);

        Board b1 = new Board();
        b1.setNo(171);
        b1.setTitle("1111");
        b1.setContent("XXXX");
        
        Board b2 = new Board();
        b2.setNo(172);
        b2.setTitle("2222");
        b2.setContent("XXXX");
        
        Board b3 = new Board();
        b3.setNo(161);
        b3.setTitle("3333");
        b3.setContent("XXXX");
        
        //test1()메서드는 트랜젝션 매니저가 관리하기 때문에
        //실행중 오류 발생시 이전 작업결과를 모둔 취소(rollback)한다.
        //오류가 없어야만 commit한다
        //boardService.test1(b1, b2, b3);

        
        //그러나 test2()메서드는 트랜젝션 매니저의 관리대상이 아니기 때문에
        //실행중 오류가 발생하더라도 그 전까지 실행한 작업결과를 모두 반영한다.
        boardService.test2(b1, b2, b3);
        
    }
}







