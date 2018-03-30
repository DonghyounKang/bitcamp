// 제네릭 사용 후
package step13.ex01;

import java.util.ArrayList;
import java.util.HashSet;

public class Exam02 {
    public static void main(String[] args) {
        //Generic 사용
        //특징 1. 다루는 타입 제한 가능
        // => 방법
        // => 클래스명<타입명>
        ArrayList<Member> list = new ArrayList<Member>();

        list.add(new Member("홍길동", 20));
        
//      list.add(new String("hello"));//컴파일 오류
//      list.add(new Integer(100));//컴파일 오류
//      list.add(new HashSet());//컴파일 오류
        
    }

}
