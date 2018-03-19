//사용자 정의 데이터 타입 - 메서드 = 연산자
package step07;

public class ExamX_2 {

    public static void main (String[] args) {
        
        //사용자 정의 데이터 타입의 값을 연산자를 사용하여 다뤄보기
        
        Score2 score = new Score2();//클래스 이름 대문자 / score가 가리키는 인스턴스 변수
        score.name = "홍길동";
        score.kor = 100;
        score.eng = 90;
        score.math = 85;
        
        // 다음의 score의 값을 다루는 연산자가 없을 때의 예시
        /*
        score.sum = score.kor + score.eng + score.math;
        score.average = (float)score.sum / 3; //float으로 명시적 형변환, 3은 int => float으로 암시적 형변환
        //score.average = score.sum / 3f;
        */
        
        Score2.calculate(score);
        
        System.out.printf("%s, %d, %d, %d, %d, %.1f\n",
                score.name, score.kor, score.eng, score.math, score.sum, score.average);

    }
}
