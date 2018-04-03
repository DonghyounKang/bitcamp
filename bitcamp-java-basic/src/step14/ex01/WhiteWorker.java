// Worker인터페이스를 이행하는 클래스 - Worker구현체라 부른다.
package step14.ex01;

public class WhiteWorker implements Worker {
    
    public void execute() {
        System.out.println("정신노동자가 일을 합니다.");
    }

}
