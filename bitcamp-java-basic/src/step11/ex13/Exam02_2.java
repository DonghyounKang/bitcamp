// 캡슐화(encapsulation) - 응용
package step11.ex13;

import step11.ex13.sub.B;
import step11.ex13.sub.C;

public class Exam02_2 extends C{
    
    public static void main(String[] args) {
        
        //Car c1 = new Car();// 생성자가 private이기 때문에 다른 클래스에서 호출 불가
        // 따라서 인스턴스 생성불가
        // private로 생성자를 만든 이유
        // 개발자가 직접 인스턴스를 생성하면 너무 복잡해져서
        // 다른 메서드를 통해 인스턴스를 생성하라는 의미
        
        Car c2 = Car.create("티코");
        System.out.printf("%s, %s, %d, %d \n", c2.model, c2.maker, c2.cc, c2.valve);
    }
}
