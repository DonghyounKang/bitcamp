//사용자 정의 데이터 타입 - 인스턴스 변수와 인스턴스 메서드
package step07;

public class ExamY_5 {

    public static void main (String[] args) {
        //계산결과를 개별적으로 관리하고 싶은 경우
        //그렇다면 개별적으로 관리할 변수를 인스턴스 변수로 선언
        
        //Calculator2에서는 계산결과를 저장하는 변수가 1개여서
        // 식 1 과 식 2를 개별적으로 동시에 계산 불가
        
        //두개의 식의 계산 결과를 따로 관리하기 위해서
        //result변수를 개별적으로 생성
        
        Calculator4 c1 = new Calculator4(); // 식1의 계산
        Calculator4 c2 = new Calculator4(); //식2의 계산
        
        //인스턴스 메서드 사용시 파라미터로 메모리 주소를 전닿할 필요 없다.
        c1.plus(2);
        c2.plus(3);
        
        c1.plus(3);
        c2.multiple(2);
        
        c1.minus(1);
        c2.plus(7);
        
        c1.multiple(7);
        c2.divide(4);
        
        c1.divide(3);
        c2.minus(5);
        
        System.out.printf("result c1 = %d\n", c1.result);
        System.out.printf("result c2 = %d\n", c2.result);

    }
}

