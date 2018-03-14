//메서드 : stack memory
package step06;

import java.util.Scanner;

public class Exam04_1 {

    static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        System.out.printf("swap(): a = %d, b = %d\n", a, b);
    }

    public static void main(String[] args){
        int a = 100;
        int b = 200;
        swap(a, b);
        System.out.printf("main(): a = %d, b = %d\n", a, b);
    }
}
/*
실행순서와 메모리
1) java -classpath.\bin step06.Exam04_1 실행
    => JVM은 클래스 정보를 method area에 로드한다.
2) main()호출
    => JVM stack 영역에 main() 메서드가 사용할 로컬 변수를 준비
3) swap()호출
    => JVM stack 영역에 swap()메서드가 사용할 로컬 변수 준비
4) swap() 실행완료
    => JVM stack 영역에 있던 swap()이 사용한 메모리 제거
5) main() 실행완료
    => JVM stack 영역에 있던 main()이 사용한 메모리 제거
6) JVM 실행 종료
    => JVM이 사용한 모든 메모리를 os에 반납


/*
자바에서 데이터 저장을 위해 메모리를 사용한다.

JVM은 메모리를 크게 3부분으로 관리

>**JVM의 메모리**
Method Area: 클래스의 바이트 코드 
            static 변수를 둔다

Heap: 클래스의 인스턴스
        new 명령으로 만든 메모리(인스턴스 = 객체)를 둔다
        Garbage Collector(GC)가 관리하는 영역

JVM stacks : 메서드의 로컬 변수
        스레드별로 jvm stack 메모리를 따로 관리한다. 
        각 메서드마다 프레임(Frame) 단위로 관리
        메서드 호출이 끝나면 그 메서드가 사용한 프레임 메모리 제거

JVM 종료시 사용한 모든 메모리 반납
*/