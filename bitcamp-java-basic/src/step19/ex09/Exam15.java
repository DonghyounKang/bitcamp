// IoC 컨테이너 만들기 - 에노테이션을 사용하여 객체의 이름 지정하기
package step19.ex09;

public class Exam15 {
    public Exam15() {
        System.out.println("===> Exam15()");
    }
    
    public static void main(String[] args) throws Exception {
        ApplicationContext10 iocContainer = new ApplicationContext10("step19.ex09");
        Car car = (Car) iocContainer.getBean("car");
        car.move();
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
