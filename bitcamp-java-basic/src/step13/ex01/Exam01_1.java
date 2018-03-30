//제네릭(Generic) 사용전
package step13.ex01;

import java.util.ArrayList;
import java.util.HashSet;

public class Exam01_1 {
    //ArrayList에 어떤 종류(타입, 클래스)의 객체를 저장할지 지정하지 않으면
    //기본으로 Object타입의 객체를 다루는 것으로 간주
    //즉 Object 타입이라면 어떤 클래스던지 저장하고 꺼낼 수 있다.
    public static void main(String[] args) {
        
        ArrayList list = new ArrayList();
        
        list.add(new Member("홍길동", 20));
        list.add(new String("hello"));
        list.add(new Integer(100));
        list.add(new HashSet());
        
        //값 꺼내기
        //객체에 값을 꺼내려면 해당 클래스로 형변환 한 다음에 사용할 수 있다.
        // get()메서드의 리턴 타입: Object이기 때문
        
        Member member = (Member)list.get(0);
        System.out.println(member.name);
        System.out.println(member.age);
        // => 이렇게 값을 꺼낼 때마다 그 객체의 원래 클래스로 형변환하기에는 매우 번거롭다.
    }
    
}
