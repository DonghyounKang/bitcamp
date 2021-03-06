// spring -myBatis : 트랜젝션 적용 후
package step25.ex9;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Exam01_insert {

    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext iocContainer = 
                new ClassPathXmlApplicationContext("step25/ex9/application-context.xml");

        //트랜젝션 적용
        //1) 트랜젝션 관리자를 등록  -> application-context.xml 파일에 객체 추가
        //2) 트랜젝션 관리자가 동작하려면 DAO를 사용하는객체도 트랜젝션관리자와 같은 컨테이너의 객체가 있어야 한다.
        //      즉, DAO의 메서드를 사용하는객체 또한 Spring IOC Container 에 있어야한다.
        //      => DAO메서드를 호출하는 Service 객체를 만든다
        //      => BoardService 추가
        //3) AOP를 사용하여 트랜젝션관리자를 적용한다.
        //      application-context.xml에 AOP advice와 pointcut을 설정한다.
        BoardService boardService = iocContainer.getBean(BoardService.class);

        Board b1 = new Board();
        b1.setNo(161);
        b1.setTitle("1111");
        b1.setContent("XXXX");
        
        Board b2 = new Board();
        b2.setNo(162);
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
        //실행중 오류가 발생하면 그 전까지 실행한 작업결과를 모두 반영한다.
        boardService.test2(b1, b2, b3);
        
    }
}







