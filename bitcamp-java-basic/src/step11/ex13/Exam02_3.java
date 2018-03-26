// 캡슐화(encapsulation) - 응용
package step11.ex13;

import java.util.Calendar;

import step11.ex13.sub.C;

public class Exam02_3 extends C{
    
    public static void main(String[] args) {
        
        // java.util.Calendar 객체 만들기
        // 생성자 : protected
        // 의미?
        // - 보통 개발자가 클래스를 만들 때 자신만의 패키지에 넣어서 만든다.
        // - java.util 패키지를  자신의 클래스를 두기 위해 사용하지는 않을 것이다.
        //   따라서 Calendar 생성자가 protected로 되어있다는 것은
        // - 개발자가 직접 생성자를 호출하지 말라는 의미이다.
        //   물론 Calendar를 만든 자신들은 나중에 Calendar의 서브 클래스를 만들 때
        //   이 생성자를 직접 사용하겠다는 의도롤 생성자를 protected했음을 알 수 있다.
        // - 그렇다면 Calendar클래스를 개발자가 사용하지 말라는 것인가?
        //   개발자들이 이 클래스의 인스턴스를 만들 수 있도록 스태틱 메서드를 제공한다.
        // - 당연히 메서드를 외부에서 호출 가능하도록 public으로 공개되었다.
        // 
        
        Calendar cal1 = Calendar.getInstance();
        Calendar cal2 = Calendar.getInstance();
        
        System.out.println(cal1 == cal2); // false
        // getInstance()의 리턴값을 확인해보면 두 변수가 서로 다름을 알 수 있다.
        // Singleton 기능을 수행하는 메서드가 아닌 복잡한 Calendar객체를
        // 생성해주는 factory method로서 역할을 수행한다.
        
        // 생성자를 protected로 감추고 getInstance()를 public으로 공개하였다.
        // - 캡슐화를 응용한 예이다.
        
    
    
    }
}
