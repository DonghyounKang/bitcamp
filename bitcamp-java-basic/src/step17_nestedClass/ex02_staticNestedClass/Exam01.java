//상수변수 활용하여 분류코드 다루기
package step17_nestedClass.ex02_staticNestedClass;

public class Exam01 {
    public static void main(String[] args) {
        Product p = new Product();
        p.category = Product.APPLIANCE_TV;
        p.name = "울트랴비전 뷰";
        p.price = 2000000;
        
    }
}
