//후위 증감연산자 응용II

package step04;

public class Exam06_4{
    public static void main(String[] args){
        /*
         */
        int i = 2;
        int result = i++ + i++ * i++;
        /*연산자 우선순위 
        ++, --
        *, /
        +, -
        =
        */

        //int result = 2 + 3 * 4;
        //int result = 2 + 12;
        //int result = 14;
        //int i = 5

        System.out.printf("%d, %d\n", i, result);
    }
}

