//메서드 : main() 메서드 - Program Argument
package step06;

import java.util.Scanner;

public class Exam05_2 {
    
    //Program Argument
    // jvm실행시 프로그램에 전달하는 값
    // 예)
    // > java -cp bin Exam05_2 aaa bbb cccc
    // aaa bbb cccc가 program argument이다.
    
    public static void main(String[] args){
        //program argument는 String 배열에 담겨서 main() 호출시 넘어온다.
        //program argument는 공백을 기준으로 문자열을 잘라서 배열을 만든다.
        for(String value : args) {
            System.out.printf("[%s]\n", value);
        }
        

    }
}