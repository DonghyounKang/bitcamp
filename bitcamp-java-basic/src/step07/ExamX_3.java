//사용자 정의 데이터 타입 - 인스턴스 메서드
package step07;

public class ExamX_3 {

    public static void main (String[] args) {
        
        Score3 score = new Score3();
        score.name = "홍길동";
        score.kor = 100;
        score.eng = 90;
        score.math = 85;
        
        // 다음은 score의 값을 다루기 위해 non-instance 메서드를 호출하는 예이다.
        // non-instance method(= static method = class method)
        /*
        Score2.calculate(score);
        */
        
        // 클래스 메서드를 사용할 때마다 매번 인스턴스의 주소를 파라미터로 넘겨줘야 했다.
        // 하지만 인스턴스 메서드를 사용하면 인스턴스 주소를 넘기기가 더 편하다.
        // 메서드 호출 앞에 둔다. 
        score.calculate(); //변수 뒤에 연산자를 주는 i++과 비슷 (score에 대한 calculate()를 실행하라)
        
        System.out.printf("%s, %d, %d, %d, %d, %.1f\n",
                score.name, score.kor, score.eng, score.math, score.sum, score.average);

    }
}

/*
 결론
 사용자 정의 데이터 타입에서
 인스턴스 값을 다루는 연산자를 정의할 때는
 인스턴스 메서드로 만드는 것이 사용하기 편하다.
 
 */