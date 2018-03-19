//사용자 정의 데이터 타입 - 클래스 변수의 단점
package step07;

public class ExamY_3 {

    public static void main (String[] args) {
        //클래스 변수는 오직 한개만 존재
        //여러개의 작업을 분리하여 진행할 수 없다.
        //다음 두개의 식을 분리하여 계산
        //식1) 2 + 3 - 1 * 7 /3 =? 
        //식2) 3 * 2 + 7 / 4 - 5 = ?
        
        //Calculator2에서는 계산결과를 저장하는 변수가 1개여서
        // 식 1 과 식 2를 개별적으로 동시에 계산 불가
        Calculator2.plus(2);
        Calculator2.plus(3);
        
        Calculator2.plus(3);
        Calculator2.multiple(2);
        
        Calculator2.minus(1);
        Calculator2.plus(7);
        
        Calculator2.multiple(7);
        Calculator2.divide(4);
        
        Calculator2.divide(3);
        Calculator2.minus(5);
        
        // Calculator2의 result 변수는 모두 한개이기 때문에
        // 결과를 출력하면  식1과 식2을 모두 포함한 계산결과 출력
        System.out.printf("result = %d\n", Calculator2.result);

    }
}

