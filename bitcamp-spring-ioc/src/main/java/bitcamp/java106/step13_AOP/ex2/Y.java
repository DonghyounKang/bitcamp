package bitcamp.java106.step13_AOP.ex2;

import org.springframework.stereotype.Component;

@Component
public class Y {
    public Y() {
        System.out.println("Y객체생성");
    }
    public void m2() {
        System.out.println("Y.m2()");
    }
}

