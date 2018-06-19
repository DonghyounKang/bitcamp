package bitcamp.java106.step13_AOP.ex2;

import org.springframework.stereotype.Component;

@Component
public class X {
    public X() {
        System.out.println("X객체생성");
    }
    public void m1() {
        System.out.println("X.m1()");
    }
}
