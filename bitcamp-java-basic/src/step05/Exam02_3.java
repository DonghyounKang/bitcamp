//흐름 제어문 - switch 문법
package step05;

import java.util.Scanner;

public class Exam02_3 {
    public static void main(String[] args) {
        //switch(값){}
        //값으로 가능한 데이터 타입
        //int 정수(byte, short, int, char), 문자열, Eum 타입
        //case 값으로 변수를 사용할 수 있다. 리터럴만 가능하다.
        byte b = 20;
        switch(b){ 
        case 1:
        case 2:
        default:
        }

        short s = 20;
        switch(s){
        case 1:
        case 2:
        default:
        }

        int i = 20;
        switch(i){
        case 1:
        case 2:
        default:    
        }

        char c = 'A';// A문자의 유티코드 값(UTF-16 0x41을 c에 저장한다.)
        switch(i){
        case 1:
        case 2:
        default:    
        }

        //string 값을 switch와 case의 값으로 사용할 수 있다.
        String str = "hello";
        switch(str){
        case "hello":
        case "ohora":
        default:  
        }


        //boolean값은 switch와 case에서 사용할 수 없다.
        /*boolean bool = true;
        switch(bool){
        case true:
        case false:
        }*/

        //case에는 리터럴만 올 수 있다 즉. 변수를 사용할 수 없다.
        int x = 1, y = 300;
        switch(x){
        case 1 * 300 : //ok
        case 1 * y : //컴파일 오류
        }
        /*
        컴파일 오류
        long l = 20;
        switch(l){
        case 1:
        case 2:
        default:
        }
        */

    }
}