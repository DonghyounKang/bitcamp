//18.03.05(2주차)
//키보드 입력 받기 - 응용
package step02;

public class Exam02_2{
    public static void main(String[] args){
        //키보드 정보를 가져온다
        //키보드에서 값을 꺼내주는 도구를 연결한다.
        java.io.InputStream keyboard = System.in;
        java.util.Scanner keyScan = new java.util.Scanner(keyboard);

        //팀맴버의 정보를 입력받아 출력하라
        // 이름, 전화, 이메일, 나이, 재직여부
        //예)
        //이름? 홍길동
        //전화? 1111-1111
        //이메일? hong@test.com
        //나이? 20
        //재직여부? y
        System.out.print("이름? ");  //print() : 문자열 출력 후 줄바꿈 X
        System.out.println(keyScan.nextLine());
        System.out.print("전화? ");
        System.out.println(keyScan.nextLine());
        System.out.print("이메일? ");
        System.out.println(keyScan.nextLine());
        System.out.print("나이? ");
        System.out.println(keyScan.nextLine());
        System.out.print("재직여부? ");
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
