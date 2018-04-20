//멀티 스레드 적용전

package step24.ex01;

public class Exam01 {
    public static void main(String[] args) {
        // 순차적 코드 실행
        for (int i = 0; i < 1000; i++) {
            System.out.println("==> " + i);
        }
        
        for (int i = 0; i < 1000; i++) {
            System.out.println(">>>" + i);
        }
    }
}

// 자바는 main()메서드를 실행하는 한개의 "실행 흐름"이 있다.
// 그 "실행 흐름"에 따라 순서대로 코드가 실행된다.
// 
//
//