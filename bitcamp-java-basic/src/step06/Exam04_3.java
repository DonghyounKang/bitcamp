//메서드 : 인스턴스와 Heap메모리 영역
package step06;

import java.util.Scanner;

class MyObject{
    public int a;
    public int b;
}

public class Exam04_3 {

    static MyObject getMyObject() {
        //Exam03_3.java에 정의된 MyObject 클래스 사용
        MyObject ref = new MyObject();
        ref.a = 100;
        ref.b = 200;

        return ref;

    }

    public static void main(String[] args){
       MyObject ref;
       ref = getMyObject();
       System.out.println(ref.a);
       System.out.println(ref.b);
    }
}
/*
1) main() 호출
    - JVM Stack : args, arr 변수 생성
2) getMyObject() 호출;
    - JVM Stack: ref변수 생성
    - Method Area: MyObject 클래스 로딩
    - Heap: MyObject배열 생성
3) getMyObject() 호출 끝
    - JVM Stack: arr변수 제거
    - MyObject 리턴
4) main() 호출 끝
    - JVM Stack: main() 관련 메모리 제거
5) JVM 종료
    - JVM이 사용한 모든 메모리Method Area, JVM Stack, Heap) os에 반납
*/