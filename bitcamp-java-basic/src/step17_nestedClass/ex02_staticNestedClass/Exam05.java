// static 멤버와 import
package step17_nestedClass.ex02_staticNestedClass;

import static step17_nestedClass.ex02_staticNestedClass.Category2.appliance.*;
import static step17_nestedClass.ex02_staticNestedClass.Category2.book.*;
import static step17_nestedClass.ex02_staticNestedClass.Category2.computer.*;



public class Exam05 {
    public static void main(String[] args) {
        Product2 p = new Product2();
        
        //p.category = Category2.appliance.TV;
        
        // 위에서 import로 스태틱 멤버(변수,메서드, 중첩클래스)가 들어있는
        // 바깥 클래스의 정보를 컴파일러에게 알려줬기 때문에
        // 다음과같이 바깥 클래스와 중첩 클래스의 이름을 모두 생략하고 쓸수 있다.
        p.category = MOUSE;
        p.category = NOVEL;
        p.category = TV;
        p.name = "울트랴비전 뷰";
        p.price = 2000000;
        
    }
}
