//클래스
package step07;

    //사용자 정의 데이터 타입
    // => 학생 데이터를 담을 새로운 구조의 메모리를 설계
    class Student{
        String name;
        int age;
        String eamil;
        float weight;
        float height;
        String tel;
    }

    // 메서드 분류(관련된 기능을 묶을 때)
    // => 관련 기능을 수행하는 메서드를 하나로 묶는다.
    class Calculator{
        public static int plus(int a, int b){
            return a + b;
        }
        public static int minus(int a, int b){
            return a - b;
        }
        public static int multiple(int a, int b){
            return a * b;
        }        
        public static int divide(int a, int b){
            return a / b;
        }
    }
public class Exam01_1 {

    public static void main (String[] args) {
        //사용자 정의 데이터 타입 사용방법
        // new 명령을 사용하여 설계도에 기술된대로 메모리를 준비
        // 메모리는 Heap영역에 생성
        // 메모리 주소를 레퍼런스(주소변수)에 저장한다.
        Student ref = new Student();
        
        // 클래스로 만든 메모리는 레퍼런스를 통해 접근한다.
        ref.name = "홍길동";
        ref.tel = "111 - 1111";
        ref.age = 20;

        //클래스로 묶은 메서드 사용하는 방법
        // 클래스 이름을 붙여 메서드를 호출한다.
        int result = Calculator.plus(100, 200);
        int result2  = Calculator.minus(100,200)
        

    }
}

//## 클래스 문법의 용도
//1. 사용자 정의 데이터 타입 생성
//    - 즉 새로운 구조의 메모리를 설계할 때 사용한다.
//2. 관련 메서드를 묶을 때
//    - 서로 관련된 기능을 관리하기 쉽게 묶고 싶을 때 사용한다.