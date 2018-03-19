//사용자 정의 데이터 타입 - 인스턴스 변수
package step07;

public class ExamY_4 {

    public static void main (String[] args) {
        //계산결과를 개별적으로 관리하고 싶은 경우
        //그렇다면 개별적으로 관리할 변수를 인스턴스 변수로 선언
        
        //Calculator2에서는 계산결과를 저장하는 변수가 1개여서
        // 식 1 과 식 2를 개별적으로 동시에 계산 불가
        
        //두개의 식의 계산 결과를 따로 관리하기 위해서
        //result변수를 개별적으로 생성
        
        Calculator3 c1 = new Calculator3(); // 식1의 계산
        Calculator3 c2 = new Calculator3(); //식2의 계산
        
        Calculator3.plus(c1, 2);
        Calculator3.plus(c2, 3);
        
        Calculator3.plus(c1, 3);
        Calculator3.multiple(c2, 2);
        
        Calculator3.minus(c1, 1);
        Calculator3.plus(c2, 7);
        
        Calculator3.multiple(c1, 7);
        Calculator3.divide(c2, 4);
        
        Calculator3.divide(c1, 3);
        Calculator3.minus(c2, 5);
        
        // Calculator2의 result 변수는 모두 한개이기 때문에
        // 결과를 출력하면  식1과 식2을 모두 포함한 계산결과 출력
        System.out.printf("result c1 = %d\n", c1.result);
        System.out.printf("result c2 = %d\n", c2.result);

    }
}

