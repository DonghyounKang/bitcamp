//인스턴스 변수  응용 - 성적 데이터 저장할 메모리 만들기
//인스턴스 - 개별데이터(new 명령어를 통해 생성)
package step08;

public class Exam01_2 {

    public static void main(String[] args) {
        //1) 성적 데이터를 설계할 클래스 -> 그에 맞는 클래스명 사용하기
        class Score{
            //2) 여러 명의 구분되는 성적데이터를 저장해야하기 때문에 인스턴스 변수로 메모리를 설계
            String name;
            int kor;
            int eng;
            int math;
            int sum;
            float average;
        }
        //저장하고 싶은 데이터 개수만큼 인스턴스를 생성
        Score s1 = new Score(); // 1명의 성적데이터를 저장할 메모리
        Score s2 = new Score();
        Score s3 = new Score();
        
        //각 인스턴스에 한몀의 성적 데이터 저장
        s1.name = "홍길동";
        s1.kor = 100;
        s1.eng = 90;
        s1.math = 80;
        s1.sum = s1.kor + s1.eng + s1.math;
        s1.average = s1.sum / 3f;
    
        s2.name = "임꺽정";
        s2.kor = 100;
        s2.eng = 100;
        s2.math = 100;
        s2.sum = s2.kor + s2.eng + s2.math;
        s2.average = s2.sum / 3f;
    
        s3.name = "유관순";
        s3.kor = 100;
        s3.eng = 90;
        s3.math = 60;
        s3.sum = s3.kor + s3.eng + s3.math;
        s3.average = s3.sum / 3f;
    }
}


