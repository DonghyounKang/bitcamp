// 소스 파일과 바이트코드 파일 분리하기
public class Exam05{
    public static void main (String[] args) {
        System.out.println("Exam05");
    }
}
class G{}


/*
소스코드와 컴파일로 만들어진 바이트 코드 파일을 분리해 저장하면 차후 사용자에게 배포
하는 파일을 만들 때 편하다
그래서 이렇게 분류
src -> 소스 파일을 두는 폴더
bin -> binary파일(컴파일로 생성된 바이트 코드 파일)을 두는 폴더

컴파일 방법
> javac -d 컴파일 결과를 저장할 폴더 경로 소스 파일 경로
> javac -d ./bin ./src/Exam05.java

컴파일 후 다른 폴더에 있는 .class파일(바이트 코드) 실행 방법
1. 해당 폴더로 찾아가서 실행(비추천)
2. JVM에게 바이트 코드 파일이 있는 위치를 알려준다
> java -classpath 클래스파일이 있는 폴더 위치 클래스명
> java -cp
ex)
> java -classpaht(cp) .\bin Exam05


 */