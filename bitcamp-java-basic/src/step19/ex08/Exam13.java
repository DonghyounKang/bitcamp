//IOC Container 의존객체 주입
package step19.ex08;

public class Exam13 {
    public Exam13() {
        System.out.println("=>Exam13");
    }
    
    public static void main(String[] args) {
        //새 Engine 준비
        UltraEngine engine = new UltraEngine();
        
        //Car클래스는 엔진을 자체적으로 생성하여 사용하기 때문에 
        // 새로만든 엔진을 꼽을 수가 없다.
        Car car = new Car();// 기존의 엔진객체 사용
        car.move();
        
        System.out.println("------------------");
        
        //Car2클래스는 외부에서 Engine객체를 주입받도록 설계했기 때문에
        // 새 UltraEngine을 장착할 수 있다.
        Car2 car2 = new Car2(engine);
        car2.move();
        
    }
}

//DI는 IOC의 한 예이다.
// IOC(Inversion of Control)
// => 제어의 역행
// => 일반적인 흐름에 벗어난 동작을 말한다.
// => ex:
//    1) Dependency Injection(DI)
//       => 자신이 사용할 의존객체를 자신이 만들지 않고 외부에서 주입 받는것
//    2) Event
//       => 실행 순서에 상관없이 특정 사건이 발생하면 지정된 코드가 실행되는 것
