//증감연산자: 전위(pre-fix) 증가연산자

package step04;

public class Exam06_5{
    public static void main(String[] args){
        int i = 2;
        
        
        ++i;
        //i 메모리의 값을 먼저 증가시킨다.
        //그리고 i 메모리의 값을 그자리에 놓는다.
        
        ++i;

        System.out.println(i);

        System.out.println(++i);
        //i = i + 1
        //System.out.prinln(5)
        System.out.println(i);
    }
}

