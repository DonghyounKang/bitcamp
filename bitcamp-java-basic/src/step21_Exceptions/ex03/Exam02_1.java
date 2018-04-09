//예외 던지기 - 예외상황을 호출자에게 알려주기
package step21_Exceptions.ex03;

public class Exam02_1 {

    //throw 명령어를 사용하여 예외 정보를 호출자에게 던진다.
    // => throw [java.lang.Throwable 타입의 객체];
    //던질 수 있는 클래스는 java.lang.Throwable 타입의 객체만이 가능하다.
    
    //java.lang.Throwable
    // => Throwable에는 두 종류의 subClass가 있다.
    // 1) java.lang.Error(시스템 오류)
    //  => JVM에서 발생된 오류이다.
    //  => 개발자가 사용하는 클래스가 아니다.
    //  => 이 오류 발생 시 시스템의 현 상태를  즉시 백업하고  실행을 멈춰야 한다.
    //  => JVM에서 오류가 발생한 경우 계속 실행해봐야 소용이 없다.
    //     근본적인 문제 해결 불가
    //  => 오류의 예:
    //     StackOverFlow 오류, VM관련 오류, AWT Window 관련 오류, Thread 종료 오류 등
    
    // 2) java.lang.Exception(애플리케이션 오류)
    //  => Application 으로부터 발생한 오류
    //  => 개발자가 사용하는 클래스
    //  => 적절한 조치를 취한 후 계속 시스템을 실행하게 만들 수 있다.
    //  => 오류의 예:
    //     배열의 인덱스가 무효한 오류, I/O관련 오류, SQL오류, Parse오류, DataFormat 오류 등
    
    //오류를 던진다면 반드시 메서드 선언부에 어떤 오류를 던지는 지 선언해야 한다.
    static void m() throws Throwable {
        throw new Throwable();//OK
    }
    
    static void m2() throws Error {
        throw new Error();//OK, 하지만 이 계열의 클래스는 사용하지 말것
        //왜? --> JVM관련 오류일때 사용하는 오류
    }
    
    //java.lang.Error 계열의 오류를 던질 때는 어떤 오류를 던지는지 선언하지 않아도 된다.
    // 선언해도 상관없다.
    static void m3() {
        throw new Error();
    }
    
    //Exception 계열의 예외는 어떤 종류의 예외를 던지는지 명시하여야 한다.
    static void m4() throws Exception {
        throw new Exception(); //OK  보통 개발자가 사용하는 예외 클래스
        
    }
    
    static void m5() throws Exception {
        throw new String(); //컴파일 오류  
        //throw로 던질 수있는 객체는 오직 java.lang.Throwable 타입만 가능하다.
        
    }
    
    public static void main(String[] args) {
        
        //예외를 받았을 때 처리하는 문법
        try {
            m();
        } catch (RuntimeException e) {
            //예외가 발생하면 catch블록에 서 적절한 조치를 취한다.
            //예를 들면 아래와 같이 예외가 발생한 이유를 간단히 출력
            System.out.println(e.getMessage());
        }
        System.out.println("시스템 종료");
    }
}
