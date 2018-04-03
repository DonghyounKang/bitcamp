package step14.ex02;

public class Exam01 {
    public static void main(String[] args) {
        //인터페이스의 인스턴스는 만들수 없다.
        //A4 obj = new A4();//컴파일 오류
        
        //인터페이스의 모든변수는 스태틱변수이다.
        System.out.println(A4.v1);
        
        //final이기 때문에 값 변경불가
        //A4.v2 =300;// 컴파일 오류
    }
}
