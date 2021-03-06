//java.util.Hashset 클래스 사용 - 값을 추출하는 방범
//HashSet에서 Iterator 적용시
package step12.ex05;

import java.util.HashSet;
import java.util.Iterator;

public class Exam02_1 {
    public static void main(String[] args) {
    String v1 = new String("aaa");
    String v2 = new String("bbb");
    String v3 = new String("ccc");
    String v4 = new String("ddd");
    String v5 = new String("ccc");
    
    
    HashSet set = new HashSet();
    set.add(v1);
    set.add(v2);
    set.add(v3);
    set.add(v4);
    set.add(v5); 
    
    // 저장한 순서대로 값 추출 불가 -> index를 이용한 값 추출이 불가하다.
    // set.get() 메서드가 존재하지 않는다.
    
    // 추출 방법
    //1) HashSet에 들어있는 값을 배열로 받아 사용한다.
    Object[] values = set.toArray();
        for(Object value : values) {
            System.out.print(value + ", ");
        }
        System.out.println();
        
    //2) 창고에서 값을 꺼내주는 객체의 도움을 받는다.
    // => HashSet에서 값을 꺼내주는 객체를 얻는다.
    Iterator 컬렉션에서값을꺼내주는객체 = set.iterator();
    //=> 값을 꺼내주는 객체를 통해 값을 추출
    while (컬렉션에서값을꺼내주는객체.hasNext()) {
        //=>추출 데이터가 존재하는 경우 값을 추출하는 명령을 내린다.
        System.out.print(컬렉션에서값을꺼내주는객체.next() + ", ");
    }
    System.out.println();

    }
}


















