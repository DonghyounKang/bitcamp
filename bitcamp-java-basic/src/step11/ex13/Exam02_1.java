// 캡슐화(encapsulation) - 접근 범위 

package step11.ex13;

import step11.ex13.sub.B;
import step11.ex13.sub.C;

public class Exam02_1 extends C{
    
    public static void main(String[] args) {

        A obj1 =new A();
        
        //obj1.privateVar = 100; //접근 불가, 오직 해당 클래스 안에서만 사용가능
        obj1.defaultVar = 100;// OK. 이 클래스는 A 클래스와 같은 패키지에 소속
        obj1.protectedVar = 100; //OK. 이 클래스가 자식 클래스는 아니지만 같은 패키지에 소속
        obj1.publicVar = 100;// OK. 모두 다 접근가능
        
        B obj2 = new B();
        //obj2.privateVar = 100; //접근 불가, 오직 해당 클래스 안에서만 사용가능
        //obj2.defaultVar = 100;// 접근 불가, 같은 패키지까지만 접근가능
        //obj2.protectedVar = 100; //접근불가, 같으 패키지 혹은 자식 클래스까지 접근가능
        obj2.publicVar = 100;// OK. 모두 다 접근가능
        
        C obj3 = new C();
        //obj3.privateVar = 100; //접근 불가, 오직 해당 클래스 안에서만 사용가능
        //obj3.defaultVar = 100;// 접근 불가, 같은 패키지까지만 접근가능
        //obj3.protectedVar = 100; //접근불가, 같은 패키지 혹은 자식 클래스까지 접근가능
                                 // 자식 클래스인데 접근불가?
                                 // 이유
                                 // 자기 자신의 인스턴스 변수가 아니다.
        obj3.publicVar = 100;// OK. 모두 다 접근가능
        
        
        Exam02_1 obj4 = new Exam02_1();
        //obj4.privateVar = 100; // 접근 불가, C 클래스에서만 접근가능
        //obj4.defaultVar = 100; // 접근불가, C클래스와 같은 패키지가 아니다.
        obj4.protectedVar = 100; //OK. Exam02_1은 C의 자식클래스이며 C로부터 상속받아서 만든 자기 변수이다. 
        
        obj4.publicVar = 100; //OK.
    }
}

// - 접근 제한자 -
// private : 자기 자신이 소속된 클래스 내부에서만 접근가능
// (default) : private + 같은 패키지 소속
// protected : default + 자식 클래스에서 자신이 만든 변수인 경우
// public : 모두 접근 가능

// - 반짝 실무 -
// => 인스턴스 변수는 보통 private로 선언하여 접근을 제한한다.
// => 겟터, 셋터는 public으로 선언하여 모두에게 접근을 허용한다.
// => 일반 메서드도 public으로 모두에게 접근을 허용한다.
// => 해당 클래스 내부에서만 사용되는 메서드는 private로 접근을 제한한다.
// => 자식 클래스의 접근을 허용할 필요가 있을 경우에만 protected로 선언한다.
// => library(다른 개발자가 사용할 클래스 모음)를 만들 때 그 모음집 내에서만 사용될 변수나 메서드인 경우 default로 접근을 제한한다.
// => 즉 library를 만드는 개발자의 경우 default를 사용하는 경우가 있다.
