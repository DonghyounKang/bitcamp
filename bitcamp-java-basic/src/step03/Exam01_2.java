//클래스 사용전
package step03;

public class Exam01_2{
    public static void main(String[] args) {

        //여러개의 변수(메모리)를 묶어서 한사람의 성적정보를 저장하라
        // 다양한 타입의 메모리를 묶어서 score라는 새로운 형태의 메모리를 만들 수 있는 설계도
        // => 개발자가 새롭게 정의한 데이터 타입이다
        // => "사용자 정의 데이터 타입"이라 부른다
        // (식판그림)
        class Score{
            String name;
            int kor;
            int eng;
            int math;
            int sum;
            float aver;
        }

        //개발자가 새롭게 정의한 설계도에 따라 메모리를 준비한다.
        //=> Score 설계도에 따라 메모리를 확보하라!
        //=> 확보된 메모리를 사용하려면 주소를 보관할 필요가 있다
        //=> 주소를 보관 -> 레퍼런스 변수 필요!
        Score s; //Score 설계도에 따라 만든 메모리의 주소를 저장할 변수
        s = new Score(); //=>Score설계도에 따라 메모리를 확보하고, 그 메모리의 주소를 s에 저장한다.


        //클래스 설계도에 따라 만든 메모리를 집어넣기
        //=> 주소를 사용하여 메모리에 접근
        // s에 저장된 주소로 찾아가서 name항목의 값
        //=> 위의 말을 줄여서 "레퍼런스 주소s가 가리키는 메모리의 name항목의 값"
        //=> 다른 전문용어로 "레퍼런스 주소 s가 가리키는 인스턴스의 name값"
        //=> 다시 줄여서 "s 인스턴스의 name값"
        //=> 다른 말로 "s 객체의 name값"
        s.name = "홍길동"; //s에 저장된 주소로 찾아가서 항목에 대한 값 저장
        s.kor = 100;
        s.eng = 90;
        s.math = 80;
        s.sum = s.kor + s.eng + s.math;
        s.aver = s.sum / 3;

        System.out.printf("이름: %s\n", s.name);
        System.out.printf("국어: %d\n", s.kor);
        System.out.printf("영어: %d\n", s.eng);
        System.out.printf("수학: %d\n", s.math);
        System.out.printf("합계: %d\n", s.sum);
        System.out.printf("평균: %.1f\n", s.aver);
    }
}