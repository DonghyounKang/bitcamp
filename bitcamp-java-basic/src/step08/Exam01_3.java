//클래스 변수
package step08;

public class Exam01_3 {
    static class A{
        //클래스 변수 = 스태틱 변수
        //클래스를 로딩하는 순간 자동 생성 -> 클래스 이름을 사용한다고 해서 "클래스에 소속된 변수", "클래스 변수"
        //static 이 붙은 변수이기 때문에 "스테틱 변수
        //클래스와 함께 "Method Area"영역에 존재
        //static이 붙는다.
        static int v1; //4바이트 int값을 저장할 메모리를 만들어라
        static boolean v2; //T/F 논리값을 저장할 메모리를 만들어라
        // 이 명령은 new 명령을 실행할 때 비로소 실행된다. 
    }

    public static void main(String[] args) {
        //class 변수 사용범
        //class명.스테틱 변수명 =값;
        
        A.v1 = 100;
        A.v2 = true;
        
        System.out.printf("%d, %b\n", A.v1, A.v2);
    }
}

//클래스 변수는 클래스가 로딩될때 자동으로 생성 되기 때문에
//각각 구분되는 개별 데이터 저장할 수 없다.
//왜?
//변수가 1개이다. 
