//예외 처리 - 예외에 대해 의미부여하기 - 사용자 정의 예외만들고 사용하기
package step21_Exceptions.ex05;

public class BoardException extends RuntimeException {

    // 이 클래스의 생성자가 호출될 때 그에 대응하는 수퍼클래스의 생성자를 호출하는 
    //일 외에는 다른 작업을 수행하지 않는다.
    //
    // 기능을 추가할 것도 아닌데 왜 RuntimeException을 상속받았는가?
    // => 이 클래스는 기존의 예외 클래스 기능을 확장하기 위함이 아닌 
    //    의미있는 이름을 가진 예외클래스를 만드는 것이 목적이다.
    // => 즉 예외발생시 클래스 이름으로 어떤 예외인지 쉽게 추측할 수 있게 하기 위함이다.
    
    // 
    
    public BoardException() {
        super();
    }

    public BoardException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

    public BoardException(String message, Throwable cause) {
        super(message, cause);
    }

    public BoardException(String message) {
        super(message);
    }

    public BoardException(Throwable cause) {
        super(cause);
    }
    
}
