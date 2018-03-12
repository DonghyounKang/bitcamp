//증감연산자: 전위(pre-fix) 증감연산자 응용 I

package step04;

public class Exam06_7{
    public static void main(String[] args){
        int i = 2;
        int i = --i;
        //1) i = i - 1 => i = 1이다
        //2) i = 1 => i에 또 1을 넣는다.

        int i = 2;
        int i = ++i;
        //1) i = i + 1 => i = 3이다
        //2) i = 3 => i에 또 3을 넣는다. => 부질없는 짓
        System.out.println(i); //3
    }
}

