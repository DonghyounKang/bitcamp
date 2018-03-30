// 제네릭 문법 정리
package step13.ex01;

import java.util.ArrayList;
import java.util.HashSet;

public class Exam01_3 {
    public static void main(String[] args) {
        //문법 - 클래스명 옆에 다루고자 하는 타입의 이름 지정
        // => 클래스명<타입명>
        ArrayList<Member> list = new ArrayList<Member>();

        //레퍼런스 선언에 제네릭 정보가 잇다면 new 연산자에서 생략가능
        ArrayList<Member> list2 = new ArrayList</*Member*/>();
        
        ArrayList<Member> list3;
        list3 = new ArrayList</*Member*/>();
        
        //제네릭 문법으로 레퍼런스 변수 선언시 제네릭 문법에서 타입명 생략불가
        //list4 = new ArrayList</*Member*/>();
        
    }

}
