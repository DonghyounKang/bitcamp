//증감연산자 : post-fix 증가 연산자(후위 증가 연산자) 

package step04;

public class Exam06_1{
    public static void main(String[] args){
        int i = 2;

        i++; //현재 위치에 i 값을 놓고 i 메모리 값을 1 증가시킨다

        i++; 

        //현재 자리에 'i변수에 들어있는 값'을 먼저 넣고 1 증가시킨다
        //1. 값을 넣고
        //2. 1 증가시킨다.

        System.out.println(i);

        System.out.println(i++);
        //System.out.println(4)
        //i = i + 1;
        System.out.println(i);
    }
}

