package step11.ex18_abstractMethod;

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
    
    //추상메서드
    // => sub클래스에서 재정의할 메서드라면 굳이 super클래스에서 구현하지 마라
    // => 또는 sub클래스가 구현하도로 강제하고 싶다면
    //    그때 해당 메서드를 추상메서드로 선언
    // => 추상메서드를 상속받는 sub클래스는 반드시 구현해야한다.
    //    만약 구현하지 않으면 sub클래스도 추상클래스가 되어야한다.
    // => 왜? 추상 메서드가 있다는 것은 해당 메서드를 실행할수 없다는 것이고
    //    실행할 수 없는 메서드를 갖는 클래스는 인스턴스를 생성해서는 안되기 때문에
    //    추상메서드를 갖는 클래스는 반드시 추상 클래스여야한다.
    // => 일반 클래스는 추상 메서드를 가질 수 없다.
    public abstract void run();

}