//클래스 변수와 인스턴스 변수  생성 시점과 메모리
package step08;

public class Exam01_4 {
    static class A{
        
        static int v1; //클래스가 메모리에 올라가는 순간(필요한 순간) static변수는 자동으로 생성
        int v2; 
    }
    public static void main(String[] args) {
        
        A.v1 = 100;
        
        //v2는 인스턴스 변수이기 때문에 사용하기 전에 new 명령으로 먼저 생성
        //A.v2 = 200;//컴파일 오류
        
        A p = new A();//v2변수 Heap에 생성
        //A클래스의 인스턴스를 만들 대 static이 안붙은 변수가 그 대상이다.
        
        //v2인스턴스 변수는 인스턴스 주소를 통해 사용해야한다. 클래스 이름으로 사용 불가하다
        //A.v2 = 200;// 컴파일 오류
        
        p.v2 =200;//ok!
        
        //인스턴스 변수는 인스턴스를 만들 때마다 생성된다.
        A p2 = new A();
        p2.v2 = 300;
        
        System.out.printf("A.v1 = %d, p.v2=%d, p2.v2=%d\n", A.v1, p.v2, p2.v2);
        
        
    }
}
