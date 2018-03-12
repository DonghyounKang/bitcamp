//후위 증감연산자 응용1

package step04;

public class Exam06_3{
    public static void main(String[] args){
        /*
         */
        int i = 7;
        i = i++;
        /*
         1) i값을 그자리에 놓는다.
         => i = 7;
         => 7값을 i에 저장할 수 엇ㅂ다.
         => 왜? 아직 할당 연산자(=) 우측의 모든 식이 수행되지 않았다.
         2) ++ 연산 실행
          => 즉 i = i + 1 실행
          => i = 8이 되었다.
         3) 할당 연산자 실행
          => i = 7 실행
          => i는 8에서 7로 바뀌었다. 
        */

        System.out.println(i);
    }
}

