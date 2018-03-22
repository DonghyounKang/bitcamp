// 기존의 Car클래스에 코드를 추가했다
package step11.ex02;

public class Exam01 {
    public static void main(String[] args) {
        // 새 프로젝트에서는 제조사, 모델명, 수용인원 외에
        // 선루프 장착여부, 자동변속 여부를 추가적으로 저장하고 싶다.
        
        //방법1) 기존의 Car클래스를 변경한다.
        //      문제점
        //      => 기존 소스를 변경하게 되면 기존의 Car를 사용해서 만든 프로그램들도 
        //         영향을 받는다.
        //      => 심각한 오류가 발생할 수 있다.
        //      => 기존의 소스코드르 손대는 것은 위험도가 높다.
        //      => 기존 코드를 계속 수정하다보면 누더기 코드가 될 가능성이 높다.
        //      => 쓰지 않는 코드가 누적되는 문제 발생
        
        Car c1 = new Car("비트 자동차","티코", 5, true, true);
        
    }   
}
