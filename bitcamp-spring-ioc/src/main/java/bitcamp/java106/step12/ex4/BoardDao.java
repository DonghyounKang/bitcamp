package bitcamp.java106.step12.ex4;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

import bitcamp.java106.step12.Board;

@Component
public interface BoardDao {
    // 이 인터페이스의 구현체를 mybatis가 자동으로 생성하여 spring ioc 컨테이너에 등록할 것이다.
    // 그럴려면 메서드를 만들때 몇가지 규칙을 따라야한다.
    // 1) 맵퍼 파일의 namespace는 인터페이스의 패키지 및 인터페이스명과 같아야한다..
    //  예) <mapper namespace="bitcamp.java106.step12.ex4.BoardDao">
    // 2) 메서드의 이름과 SQL의 아이디가 같아야한다.
    // 3) 메섣의 리턴타입과 SQL의 맵퍼파일의 resultType 또는 resultMap이 같아야한다.
    //    insert, update, delete일경우 리턴값이 void 또는 int가 될수 있다.
    // 4) SQL 맵퍼는 파라미터 값을 한 개만 받기 때문에 DAO 인터페이스에서도 SQL 맵퍼의 파라미터와 일치하는 같은 타입의 
    //    값을 한 개만 선언해야한다. 
    List<Board> selectList(Map<String,Object> map);
    int insert(Board board);
    int delete(int no);


}
