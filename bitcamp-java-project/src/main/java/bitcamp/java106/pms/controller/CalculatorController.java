package bitcamp.java106.pms.controller;

import java.util.Scanner;

import bitcamp.java106.pms.annotation.Component;

@Component("calc")
public class CalculatorController implements Controller {
    Scanner keyScan;

    public CalculatorController(Scanner scanner) {
        this.keyScan = scanner;
    }
    
    @Override
    public void service(String menu, String option) {
        System.out.print("식을 입력하세요(숫자 연산자 숫자 ex: 3 + 5)");
        String[] arr = keyScan.nextLine().split(" ");
        int a = Integer.parseInt(arr[0]);
        String op = arr[1];
        int b = Integer.parseInt(arr[2]);
        int result = 0;
        
        switch (op) {
            case "+" : result = a + b;
            System.out.printf("%d %s %d = %d", a,op,b,result);
            break;
            
            case "-" : result = a - b;
            System.out.printf("%d %s %d = %d", a,op,b,result);
            break;
            
            case "/" : result = a / b;
            System.out.printf("%d %s %d = %d", a,op,b,result);
            break;
            
            case "*" : result = a * b;
            System.out.printf("%d %s %d = %d", a,op,b,result);
            break;
            
            default : System.out.println("잘못된 연산자 입니다.");
        }


    }

}
