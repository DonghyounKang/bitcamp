// 제네릭 사용 후
package step13.ex01;

import java.util.ArrayList;
import java.util.HashSet;

public class Exam01_2 {
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
        
        //특징2. Generic을 지정하면 그와 관련된 메서드의 타입 정보가 자동으로 바뀐다.
        // => 형변환 해야하는 번거로움이 없다.
        Member member = list.get(0);
        System.out.println(member.name);
        System.out.println(member.age);
        
        //만약 제네릭이라는 문법이 없다면?
        // 1)값을 꺼낼 때마다 형변환 진행
        // 2) 형변환 하기 싶다면 값의 종류별로 ArrayList를 만들어야한다.
        
        //제네릭 문법이 존재 하므로
        //1) 한개의 클래스로 여러 타입의 객체를 형변환없이 다룰수 있다.
        
    }

}
