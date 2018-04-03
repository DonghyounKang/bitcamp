//Worker 구현체
package step14.ex01;

public class JubuWorker implements Worker {
    //인터페이스 구현체는 인터페이스에 선언된 모든 메서드를 구현해야한다.

    
    public void execute() {
        System.out.println("재택근무 노동자가 일을 합니다.");
    }
}
