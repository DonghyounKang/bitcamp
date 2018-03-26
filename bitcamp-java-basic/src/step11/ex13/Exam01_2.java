// 캡슐화(encapsulation) - 접근 제한

package step11.ex13;

public class Exam01_2 {
    
    public static void main(String[] args) {
        //환자 데이터 등록
        Customer2 c1 = new Customer2();
        c1.name = "홍길동";
        c1.age = 300;
        c1.weight = 70;
        c1.height = -50;
        
        // Customer2 클래스에서는 인스턴스 변수를 private로 접근을 제한했기 때문에
        // 다른 클래스는 해당 인스턴스 변수에 접근 불가
        // 해결책
        // => 이 클래스에서 제공하는 메서드 사용
        // => Exam01_3.java
        
        
        
    }
}
