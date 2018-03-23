//overriding - 오버라이딩 문법이 없다면?
package step11.ex11;

public class Exam02 {

    public static void main(String[] args) {
        A2 obj1 = new A2();
        
        obj1.name = "홍길동";
        obj1.age = 28;
        
        obj1.print();
        
        // 문제발생
        // A 설계도에 있는 print()는 오직 이름만 출력하도록 되어있다.
        // 이 메서드를 변경해야하는데
        //기존 A 클래스를 손대지 않고 print()의 기능을 변경할 수는 없을까?
        //만약 없다면?
        // => 다른 이름으로 메서드 생성
        // => 왜? 오버로딩에서는 파라미터 형식이 같은 메서드를 중복해서 만들수 없다.
        // 그래서 A2 클래스에 print2()라는 메서드 추가
        // 
        obj1.print2();
        
        
        //부모 클래스로부터 상속받은 메서드를 재정의할 수 없어서
        //새 메서드를 만들어야 한다면
        //같은 (유사한) 기능을 하는 메서드에 대해
        //안타깝게도 다른 이름으로 메서드를 만들어야 하기 때문에
        //개발자는 여러개의 메서드를 암기해야하는 어려움(번거로움)이 발생
        // => 이런 문제를 해결하기위해 'overriding'이다
        // Exam03.java>>
        
        
    }
}
