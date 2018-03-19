//메서드 분류 - 클래스 변수의 활용
package step07;

    
public class Exam02_2 {

    public static void main (String[] args) {
        //계산결과를 보관할 변수는 더이상 필요없다 (Calculator2에서 계산결과를 관라한다.)
        //int result = 0;
        
        //2 + 3 - 1 * 7 / 3
        //연산자 우선순위 고려 X, 순서대로 계산하라
        Calculator2.plus(2);
        Calculator2.plus(3);
        Calculator2.minus(1);
        Calculator2.multiple(7);
        Calculator2.divide(3);
        
        System.out.printf("result = %d\n", Calculator2.result);
    }
}
