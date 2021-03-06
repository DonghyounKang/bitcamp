//IOC Container 의존객체 주입
package step19.ex08;


//의존객체주입(Dependencies Injection; DI)
// 작업하는 데 필요한 의존객체를 자체적으로 만들지 않고 외부에서 주입해주는 것을 의미한다.
// 이점
// 다양한 객체 주입 가능
// => Engine의 새로운 서브 클래스 등장시 그 객체도 주입할 수 있
// => Car 클래스는 생성자에서 Engine객체를 생성하기 때문에
//    새로운 Engine의 서브클래스가 만들어지더라도 사용할 수 없다.

public class Exam12 {
    public Exam12() {
        System.out.println("=>Exam12");
    }
    public static void main(String[] args) {
        Engine engine = new Engine();
        Car2 car = new Car2(engine);
        car.move();
        
    }
}
