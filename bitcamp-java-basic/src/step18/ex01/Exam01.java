//Reflection API : 클래스 로딩
package step18.ex01;

class A {
    static int i;
    static void m() {
        i = 100;
    };
    static {
        System.out.println("A 클래스 로딩");
    }
}

public class Exam01 {

    public static void main(String[] args) throws Exception {
        //클래스 로딩
        // => 클래스가 로딩되어 있지 않다는 조건에서 시작
        // 클래스 로딩의 조건
        //1. 클래스의 스태틱 멤버(변수,메서드,중첩클래스)를 사용할 때 
        //2. new 명령을 사용하여 인스턴스를 생성하려 할 때 
        //3. Class.forName()을 이용하여 임의로 클래스를 로딩할 때 
        
        //클래스 로딩과정에서 하는 일
        // => 스테틱 변수를 준비한다.
        // => 스테틱 블록 실행한다.
        
        //A.i = 100; //A클래스 로딩 확인
        //A.m(); //A클래스 로딩 확인
        //new A(); //A클래스 로딩 확인
        
       Class.forName("step18.ex01.A");//A클래스 로딩 확인
       //파라미터로 패키지명을 포함한 전체 클래스 이름을 지정해야한다.
       //패키지명을 포함한 전체 클래스 이름 
       //= fully qualified class name 
       //= FQName 
       //= QName
        
        //A obj = null;//레퍼런스 선언은 클래스 로딩과 상관 없다.
        //A[] arr; //배열 레퍼런스 선언도 클래스 로딩과 상관 없다.
        //arr = new A[100]; //레퍼런스 배열 또한 클래스 로딩과 상관 없다.
        
        
    }

}


//Reflection API
//클래스의 정보를 분석하여 필요한 정보를 추출하는 것
