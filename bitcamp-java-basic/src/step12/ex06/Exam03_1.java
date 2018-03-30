//HashMap vs HashTable
package step12.ex06;

import java.util.HashMap;
import java.util.Hashtable;

public class Exam03_1 {

    public static void main(String[] args) {
      HashMap map = new HashMap();
      map.put(null, "홍길동"); //HashMap은 null을 키로 사용할 수 있다.
      map.put("s01",null); //value로  null사용가능
      //특징
      //1) null을 key와 value로 사용할 수 있다.
      //2) 동기화를 지원하지 않는다.(멀티스레드가 동시에 사용할 때 문제발생 가능성 있음)
      //장점
      // 속도가 빠르다
      
      Hashtable table = new Hashtable();
      //table.put(null, "홍길동"); // 실행오류
      //Hashtable은 null을 키로 사용할 수 없다.
      //table.put("s01", null); // 실행오류
      //value가 null이 될 수 없다.
      
      //특징
      //1) null 이 key와 value로 사용불가능
      //2) 동기화 지원
    }

}
