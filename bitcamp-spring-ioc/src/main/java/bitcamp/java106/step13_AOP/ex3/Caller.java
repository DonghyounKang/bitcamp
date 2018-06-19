package bitcamp.java106.step13_AOP.ex3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Caller {
    
    @Autowired X x;
    
    public void test() {
        System.out.println("test().......start");
        
        int result = x.m1(10, 2);
        System.out.printf("result = %d\n", result);
        
        int result1 = x.m1(10, 0);
        System.out.printf("result = %d\n", result1);
        
        System.out.println("test().......finish");
    }
}
