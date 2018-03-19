package step07;
// 메서드 분류(관련된 기능을 묶을 때)
// => 관련 기능을 수행하는 메서드를 하나로 묶는다.

public class Calculator {
    public static int plus(int a, int b){
        return a + b;
    }
    public static int minus(int a, int b){
        return a - b;
    }
    public static int multiple(int a, int b){
        return a * b;
    }        
    public static int divide(int a, int b){
        return a / b;
    }

}
