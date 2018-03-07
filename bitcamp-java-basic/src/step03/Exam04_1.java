//클래스 사용 - 패키지 클래스 사용
package step03;

public class Exam04_1{
    public static void main(String[] args) {

            // 밖에 별도로 선언한 클래스 사용하기
            Score s1 = new Score();
            s1.name ="홍길동";
            System.out.println(s1.name);
            //javac -encoding UTF-8 -cp .\bin -d .\bin .\src\step03\Exam04_1.java
                                     // (Score.class 위치)
            //javac -encoding UTF-8  -d .\bin -sourcepath src .\src\step03\Exam04_1.java
                                             //(source파일이 있는 경우) 
    }
}
/*
Exam04_!.java 컴파일 오류
>javac -encoding UTF-8 -d .\bin .\src\step03\Exam04_1.java
위의 명령어로 컴파일 실행시
Score 클래스 찾을 수 없다는 오류 발생
-이유?
 Exam04_1.java에서 Score클래스를 사용하는데, 컴파일 시 Score클래스 정보가 필요
 그런데 컴파일러가 Score클래스에 대한 정보를 모르기 때문에 Exam04_1.java를 제대로
 컴파일할 수 없음

-해결방안
 컴파일러에 Score클래스에 대한 정보를 제공

 방법1) Score.class 파일을 가지고 있는 경우
 javac -encoding UTF-8 -classpath .\bin -d .\bin .\src\step03\Exam04_1.java
                       // (Score.class 위치)

 방법2) Score 클래스의 소스파일을 가지고 있는 경우
 javac -encoding UTF-8  -d .\bin -sourcepath src .\src\step03\Exam04_1.java
                                //(source파일이 있는 경우)

언제 사용하는가? => 자바에서 기본으로 제공하는 클래스가 아닌 다른 클래스를 사용할 때
 */