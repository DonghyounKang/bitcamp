//LinkedList에서 Iterator 적용시
package step12.ex05;

import java.util.Iterator;
import java.util.LinkedList;

public class Exam02_2 {

    public static void main(String[] args) {
        String s1 = new String("aaa");
        String s2 = new String("bbb");
        String s3 = new String("ccc");
        String s4 = new String("ddd");
        String s5 = new String("eee");
        
        LinkedList list = new LinkedList();
        
        list.add(s1);
        list.add(s2);
        list.add(s3);
        
        list.add(s4);
        list.add(s5);
        
        Iterator 컬렉션에서값을꺼내주는객체 = list.iterator();
        //=> 값을 꺼내주는 객체를 통해 값을 추출
        while (컬렉션에서값을꺼내주는객체.hasNext()) {
            //=>추출 데이터가 존재하는 경우 값을 추출하는 명령을 내린다.
            System.out.print(컬렉션에서값을꺼내주는객체.next() + ", ");
        }
        System.out.println();

        
        }

}
