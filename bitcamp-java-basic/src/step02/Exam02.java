//18.03.05(2주차)
//키보드 입력 받기
package step02;

public class Exam02{
    public static void main(String[] args){
        //키보드 정보를 가져온다
        java.io.InputStream keyboard = System.in;
        
        //키보드에서 값을 꺼내주는 도구를 연결한다.
        java.util.Scanner keyScan = new java.util.Scanner(keyboard);

        System.out.print("팀명? ");  //print() : 문자열 출력 후 줄바꿈 X

        /*
        nextline()
        -Scanner 도구를 사용하여 키보드로부터 한 줄의 문자열을 가져올 때 사용하는 명령어
        -동작은?
        사용자가 한줄 입력할 때 까지
        즉 입력 데이터에 줄바꿈을 의미하는 ODOA 2바이트가 들어올 때까지 대기한다.
        사용자가 엔터키를 누르면
        입력값으로 0D0A 2바이트 값이 들어오고 

        */

        System.out.println(keyScan.nextLine());
    }
  }

  //)0D0A - 0D: Carrage Return(CR) 0A: Lin Feed(LF)
  /* 
  System.out
  -표준출력장치
  -즉 콘솔을 가리키다.
  System.in
  -표준입력장치
  -즉 키보드를 가리킨다
  */
