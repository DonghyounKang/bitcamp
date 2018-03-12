//증감연산자 : post-fix 감소 연산자(후위 감소 연산자) 

package step04;

public class Exam06_2{
    public static void main(String[] args){
        int i = 7;

        i--; 
        //현재 위치에 i 값을 놓고 i 메모리 값을 1 감소시킨다

        i--; 

        //현재 자리에 'i변수에 들어있는 값'을 먼저 넣고 1 감소시킨다
        //1. 값을 넣고
        //2. 1 감소시킨다.

        System.out.println(i);//5

        System.out.println(i--);
        //System.out.println(5)
        //i = i - 1;
        
        System.out.println(i);
    }
}

