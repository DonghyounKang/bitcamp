// static 멤버와 import
package step17_nestedClass.ex02_staticNestedClass;


import step17_nestedClass.ex02_staticNestedClass.Category2.*;


public class Exam04 {
    public static void main(String[] args) {
        Product2 p = new Product2();
        
        //p.category = Category2.appliance.TV;
        
        // 위에서 import로 appliance가 포함되어 있는 Category2 클래스에 대해
        // 컴파일러에게 알려줬기 때문에
        // 다음과같이 Category2의 이름을 생략하고 쓸수 있다.
        p.category = computer.MOUSE;
        p.category = book.NOVEL;
        p.category = appliance.TV;
        p.name = "울트랴비전 뷰";
        p.price = 2000000;
        
    }
}
