//클래스 사용 - public class와 기본 class
package step03;

public class Exam04_3{
    public static void main(String[] args) {
        //다른 패키지의 클래스 활용
        // A클래스는 public이 아니다 따라서 다른 패키지의 클래스는 A를 사용할수 없다
        //step03.test.A v1; //컴파일 오류

        //B클래스는 public
        // 따라서 다른 패키지에 소속된 클래스도 B를 사용할 수 있다.
        
        step03.test.B v2;

    }
}