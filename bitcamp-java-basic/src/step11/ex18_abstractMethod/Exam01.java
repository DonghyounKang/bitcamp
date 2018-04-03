//상속 - 추상메서드
package step11.ex18_abstractMethod;
//Car 클래스의 start() shutdown()은 sub클래스에서 그대로 받아 사용해도 된다.
//그러나 run()메서드는 sub클래스마다 자신의 특징에 맞춰 재정의해야한다.
//그렇다면 굳이 super클래스에서 run()메서드를 구현할 필요가 있을까?
//이런 run()처럼 sub클래스에서 무조건 재정의되어야 하는 메서드인 경우
//super클래스에서 정의하지 않도록하는 문법
//"추상메서드(Abstract Method)"이다.
public class Exam01 {
    
    
    public static void main(String[] args) {
        
        
       
    }
}
