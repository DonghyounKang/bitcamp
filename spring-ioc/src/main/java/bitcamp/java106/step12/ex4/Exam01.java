// Spring과 mybatis 연동 : Mybatis가 구현한 DAO 객체 사용하기
package bitcamp.java106.step12.ex4;

import java.util.HashMap;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import bitcamp.java106.BeanUtils;
import bitcamp.java106.step12.Board;

public class Exam01 {

    public static void main(String[] args) {
        //개발자가 직접 Spring IOC Container에서 사용할 SqlSessionFatoryBuiler 클래스를 만들 필요가 없다.
        //mybatis팀에서 제공해주는 FactoryBean을 사용하자
        //1) mvnrepository에서 mybatis-spring 라이브러리 검색
        //2) build.gradle 실행
        //3) "gradle eclipse"
        //4) project refresh
        //5) 라이브러리에서 제공하는 FactoryBean사용
        //
        ApplicationContext iocContainer = new ClassPathXmlApplicationContext(
                "bitcamp/java106/step12/ex4/application-context.xml");

        BeanUtils.printBeanNames(iocContainer);
        //error 출력
        //Caused by: org.springframework.beans.factory.NoSuchBeanDefinitionException: No qualifying bean of type 
        //'org.apache.ibatis.session.SqlSessionFactory' available: expected at least 1 bean which qualifies as autowire candidate.
        //Dependency annotations: {}
        // => application-context.xml 가져오기
        
        BoardDao boardDao = iocContainer.getBean(BoardDao.class);
        
        //1) 게시물 입력
        Board board = new Board();
        board.setTitle("제목ex3");
        board.setContent("내용ex3");
        boardDao.insert(board);
        
        //2) 게시물 목록 조회
        // => selectList의 파라미터 값을 한개만 넘겨야하기 때문에 
        //    여러개의 값을 담고 싶은경우 Map 에 담아 넘긴다.
        HashMap<String,Object> params = new HashMap<>();
        params.put("startIndex", 0);
        params.put("pageSize", 5);
        
        List<Board> list = boardDao.selectList(params);
        for(Board b : list) {
            System.out.printf("%d, %s, %s\n", 
                    b.getNo(),
                    b.getTitle(),
                    b.getRegisteredDate());
        }
    }

}
