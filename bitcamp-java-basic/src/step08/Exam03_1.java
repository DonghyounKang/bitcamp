// 내장변수 this(in 인스턴스 메서드)
package step08;

public class Exam03_1 {
    
   static class A{
       int value;
       
       static void m1() {
           //클래스 메서드는 인스턴스 주소 없이 호출가능하기 때문에 인스턴스 주소를 받는 내장변수가 없다.
           //this.value 100;//compile error
       }
       
       void m2() {
           //인스턴스 메서드는 인스턴스 주소가 있어야만 호출 가능하기 때문에 인스턴스 주소를 받을 변수가 내장되어있다.
           //그것이 this
           this.value = 100;
       }
       
       void m3() {
           //인스턴스 변수를 사용할 때 this 생략 가능
           //this .value = 200;
           
           value = 200;//앞에 자동으로 this가 붙는다. 
       }
       
       void m4(int value) {
           //로컬 변수의 이름이 인스턴스 이름과 같을 경우
           //this를 붙이지 않으면 로컬변수를 가리킨다.
           value = 200;//로컬변수
           
           this.value = 300;//인스턴스 변수
           //따라서 로컬변수가 아닌 인스턴스 변수를 가리키고 싶을 때 this를 붙여야 한다.
       }
   }
   public static void main(String[] args) {
       //클래스 메서드의 경우 인스턴스 주소없이 호출
       //따라서 내장변수 this가 없다.
       A.m1();
       
       //
       A obj1 = new A();
       //인스턴스 메서드는 인스턴스 주소가 있어야만 호출할 수 있기 때문에 인스턴스 메서드에는 
       //인스턴스 주소를 받을 수 있는 내장변수 this가 있다.
       obj1.m2();
       
       //클래스 메서드도 레퍼런스를 가지고 호출 가능하지만
       //인스턴스 주소가 매서드에 전달되지 않는다.
       //따라서 클래스 메서드는 내장변수 this가 없다.
       obj1.m1();
       
       A obj2 = new A();
       
       //인스턴스 메서드의 this변수는 메서드르 호출할 때 전달한 인스턴스 주소값을 가진다.
       //그래서 메서드가 호출될 때마다 
       obj2.m2();
   }
}
