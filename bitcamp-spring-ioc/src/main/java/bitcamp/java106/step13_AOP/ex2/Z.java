package bitcamp.java106.step13_AOP.ex2;

import org.springframework.stereotype.Component;

@Component
public class Z {
    public Z() {
        System.out.println("Z객체생성");
    }
    public void m2() {
        System.out.println("Z.m2()");
    }
}

