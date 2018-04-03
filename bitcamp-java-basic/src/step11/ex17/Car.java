package step11.ex17;

//추상클래스
// => sub클래스에게 공통기능을 상속해주는 목적으로 만든 클래스
// => 직접사용하지 않는 클래스
// => 즉 개발자가 이 클래스를 상속받아 새 클래스를 만들어 쓰라는 의미
public abstract class Car {

    public Car() {
        super();
    }

    public void start() {
        System.out.println("시동");
    }

    public void shutdown() {
        System.out.println("정지");
    }

    public void run() {
        System.out.println("달려라 달렷");
    }

}