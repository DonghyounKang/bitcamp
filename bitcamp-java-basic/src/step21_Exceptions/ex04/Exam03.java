//RuntimeException 예외 던지고 받기
package step21_Exceptions.ex04;

public class Exam03 {
    
    static void m1() {
        m2();
    }
    static void m2() {
        //즉 RuntimeException예외를 받을 경우
        // try~ catch~로 예외를 처리하지 않으면
        // 자동으로 상위 호출자에게 던진다.
        m3();
    }
    static void m3() {
        // m4()에서 어떤 예외가 발생하는지 구체적으로 선언되어있지 않기 때문에
        // 호출시 예외처리를 고민할 필요가 없다.
        // 그냥 예외를 던지지 않는 메서드처럼 사용하면 된다.
        // => 그러나 ! 명심하라 m4()에서 예외 발생시, 상위호출자에게 예외를 던질 것이다.
        
        m4();
    }
    static void m4() {
        //RuntimeException을 상위 호출자에게 전달할 때는 굳이 메서드 선언부에 
        //기술하지 않아도 된다.
        throw new RuntimeException("m4에서 예외 발생");
    }
    
    public static void main(String[] args) {
        try {
            m1();
            
        } catch (RuntimeException e) {
            //m4()에서 발생된 예외가 main()까지 도달한다.
            
            System.out.println(e.getMessage());
        }
        //RuntimeException계열의 예외를 던지는 메서드를 사용할 때는
        //그 호출경로에 있는 모든 메서드에 throws 문장을 선언할 필요가 없다.
        //예외를 처리하고 싶은 곳에서 
        //catch블록으로 처리하면 된다.
        //즉 중간에 끼어있는 메서드를 만들 때
        // throws 문장을 선언하지 않아서 편하다
        // ==> 비유하자면 스텔스처럼 조용히 예외를 전달한다.
        
        //단점 : 예외 처리 여부를 알 수 없다. 
    }
}