//클래스 - 레퍼런스 배열 사용 전
package step03;

public class Exam02_1{
    public static void main(String[] args) {

        //여러개의 인스턴스 주소 정하기

        class Score{
            String name;
            int kor;
            int eng;
            int math;
            int sum;
            float aver;
        }
            //Score 레퍼런스를 여러개 준비
            Score s1, s2, s3;
            
            //각 레퍼런스에 인스턴스를 생성하여 주소를 저장
            s1 = new Score();
            s2 = new Score();
            s3 = new Score();

            //레퍼런스 이용하여 인스턴스에 접근 후 항목에 값을 넣는다
            s1.name = "홍길동";
            s2.name = "유관순";
            s3.name = "임꺽정";

            //레퍼런스를 통해 인스턴스의 각 항목값을 꺼낸다
            System.out.printf("이름: %s\n", s1.name);
            System.out.printf("이름: %s\n", s2.name);
            System.out.printf("이름: %s\n", s3.name);
        }

}





/*
잡설

UML
Modeling
-생각(개념)을 시각화

Grady Booch
James Rumber
Ivar Jacobson

OOAD의 시각화 도구
Design Patterns
성공한 설계사례모음집 => Best Practices

applying uml and patterns -> micro process(축약된 절차)
                                요구사항 -> 분석 -> 설계 -> 구현
                                -> Unified Process(객체지향 방법)
                                -> Rationl창립 -> Rose ->RUP(방법론)등장
*/