//주석
package step01;
/**
 * javadoc 주석
 * => 소스 파일에서 추출하여 HMTL문서 만들 때 사용한다.
 * => 클래스 앞, 메서드 앞, 변수 선언 앞에 붙인다.
 */
public class Exam03{
    /**
     * 변수 선언 앞에 설명을 붙여 놓으면
     * 나중에 HTML문서를 만들 때 추출할 수 있다.
     */
    int var;

    /**
     * 메서드에 대한 설명을 여기에 붙여 놓으면
     * 나중에 HTML문서 만들 때 추출할 수 있다.
     */
    public static void main (String[] args) {
        // 한 줄 주석: 
        //줄이 끝날 때 까지 주석으로 간주
        
        /*여러 줄 주석
        =>주석의 끝을 만날 때까지 주석으로 간주
        */

        System.out.println("src/step01/Exam03");
    }
    /*
    애노테이션(annotation)?
    @이름 형태로 된 주석
    컴파일러나 JVM에게 특벼한 명령을 전달할 때 사용하는 아주 특별한 주석
    컴파일 후 .class파일에 존재할 수 있다.
    */
    @Override
    public String toString(){
        return "Exam03";
    }
}

/* 
주석?
=>소스코드에 대한 설명
    소스코드 해석을 돕기 위해 작성
=> 컴파일시 제거
    즉 .class 파일에는 존재하지 않는다
    
*/