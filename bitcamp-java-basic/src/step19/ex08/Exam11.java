//IOC Container 의존객체 스스로 만들기
package step19.ex08;


//의존객체(Dependency object)
// => 작업을 수행하기 위해 사용해야만하는 객체
// Car의 경우 Engine 이 Car의 의존객체
// Car의 move()를 실행하려면 Engine 객체가 있어야한다.


//의존객체 준비
// => 일반적으로 의존객체는 그 객체를 사용하는 측에서 생성
// => 즉 Car클래스에서 Engine클래스를 사용하기 때문에
//    Car의 생성자에서 Engine 객체 생성
public class Exam11 {
    public Exam11() {
        System.out.println("=>Exam11");
    }
    public static void main(String[] args) {
        Car car = new Car();
        car.move();
        
    }
}
