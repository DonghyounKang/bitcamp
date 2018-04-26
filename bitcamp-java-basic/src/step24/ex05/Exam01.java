//동기화 처리 전  => 비동기 방식으로 인한 문제 및 해결 책
package step24.ex05;

public class Exam01 {

    public static void main(String[] args) {
        Account account = new Account("111-11-1111-111", 100_0000);
        
        ATM 강남 = new ATM("강남", account);
        ATM 서초 = new ATM("서초", account);
        ATM 부산 = new ATM("부산", account);
        ATM 대전 = new ATM("대전", account);
        ATM 광주 = new ATM("광주", account);
        
        강남.start();
        서초.start();
        부산.start();
        대전.start();
        광주.start();
        
        // 강남, 서초 등 여러개의 thread가 같은 객체의 같은 메서드를 동시에 호출하여
        //값을 변경하려 하는 경우,
        //서로 그 메모리의 값을 덮어쓰는 문제가 발생한다.
        // 이처럼 여러 thread가 동시에 실행할 때 문제가 되는 코드를
        //임계구역(Critical Section, critical Region) 이라 부른다.
        // 이 예제에서는 여러 thread가 동시에 호출하고
        //같은 인스턴스의 변수 값을 변경하는 메서드인 withdraw()가 
        //critical section이다.
        
        // 해결책?
        // => 한번에 한 thread만이 변수의 값을 변경하도록 접근을 제한하면 된다.
        // 주의!
        // => 동시에 여러 thread가 같은 메모리에 대해 값을 조회할 때는 문제가 발생하지 않는다.
    }
}

//용어정리

//임계구역[Critical Section]
// - 여러 스레드가 동시에 실행할 때 문제가 발생하는 코드 블록을 말한다.
// - Critical region이라고도 부른다.
// - 같은 메모리에 여러 thread가 동시에 접근하여 값을 변경하려 할 때 문제가 발생
//   즉 다른 thread가 사용하는 변수의 값을 임의로 변경하면 원래의 의도대로
//   동작하지 않게 되는 것이다.
// - Thread Unsafety라고 말한다.
//
//스레드 안전 [Thread Safety]
// - 여러 thread가 동시에 실행 하더라도 아무 문제가 되지 않는 코드
// - 여러 thread가 같은 메모리에 접근하더라도 읽기(조회)만 한다면 아무 문제가 되지 않는다.
//
//세마포어(Semaphore)
// - Critical Section에 접근하는 thread의 수를 제어하는 기법
// - 다음의 형식으로 표시
//   semaphore(n) => n : thread의 수
//   ex) semaphore(3) : 동시에 3개의 thread가 접근할 수 있다는 것
// - 자바의 경우, 2개 이상의 접근을 허용하지 않는다. 오직 한개만 가능하다.
//
//뮤텍스(MUTual EXclusion - MUTEX)
// - Critical Section의 오직 한 개의 thread만 접근하는 것
// - semaphore(1) 과 같다.
// - 자바에서 synchronized는 해당 블록을 MUTEX로 선언하는 것이다.







