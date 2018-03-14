//흐름 제어문 - for 반복문과 컬렉션
package step05;

import java.util.Scanner;
import java.util.ArrayList;

public class Exam04_4 {
    public static void main(String[] args) {
        /*
        배열은 같은 타입의 값을 보관 가능
        컬렉션은 다른 타입의 값을 보관 가능
        배열은 크기 고정
        컬렉션은 크기가 가변적이다
        */
        ArrayList list = new ArrayList();
        list.add("홍길동");
        list.add(3.14f);
        list.add(true);
        list.add(365);

        for(int i = 0; i < list.size(); i++)
            System.out.println(list.get(i));
        
        System.out.println("---------------------");

        //for문에 컬렉션 적용 가능
        //for(변수 선언: 컬렉션 객체) 문장
        for(Object value : list)
            System.out.println(value);
    }   
}
