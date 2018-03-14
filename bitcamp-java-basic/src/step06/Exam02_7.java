//메서드 : 가변 파라미터의 단점
package step06;

import java.util.Scanner;

public class Exam02_7 {

    //가변 파라미터는 여러 개 선언할 수 없다.
    //=> 아규먼트의 시작과 끝을 구분할 수 없기 때문이다.
    //예) m1("aaaa", "bbbb","ccc","ddd");
    //어느 값이 names 배열에 들어가고 어느값이 names2 배열에 들어가는지 구분할 수 없음
    //static void m1(String... names, String... names2) { }
    
    //static void m1(String... names, int a, String... names2) { } //컴파일 오류
    //위의 메서드는 구분가능? 사람은 구분가능 but 컴파일러는 복잡해진다.
    //그래서 가변파라미텉 문법의 이점은 사용하되 너무 복잡한 사용법은 지양하기 위해서
    //사용방법을 간단히 한것
    //m1("aaaa", "bbbb","ccc","ddd");
    
    //가변 파라미터는 반드시 맨끝에 와야한다..
    //=> 아규먼트의 시작과 끝을 구분할 수 없다.
    //예) m2("aaaa");
    //static void m2(String... names, String a) { }//컴파일 오류
    //static void m2(String... names, int a) { }//컴파일 오류
    static void m2(int a, String... names) { }//컴파일 오류

     //배열 파라미터는 여러개 선언할 수 있다.
     static void x1(String[] names, String... names2) { }
    //배열 파라미터는 순서에 상관없다.
    static void x2(String[] names, int a) { }

    public static void main(String[] args){
        //컴파일 확인
    }
}

//>결론!
// 메서드의 가변파라미터는 한 개만 사용가능
// 가변 파라미터는 반드시 맨뒤에 와야한다.
// 그 이유는? => 복잡한 사용을 막기위해서 