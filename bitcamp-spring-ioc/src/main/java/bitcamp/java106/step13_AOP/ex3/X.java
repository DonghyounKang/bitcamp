package bitcamp.java106.step13_AOP.ex3;

import org.springframework.stereotype.Component;

@Component
public class X {
    
    public X() {
        System.out.println("X객체 생성");
    }
    
    public int m1(int a, int b) {
        System.out.println("X.m1()");
        int result = a / b;
        
        return a / b;
    }
}
