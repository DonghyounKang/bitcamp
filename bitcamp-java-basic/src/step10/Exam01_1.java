//String - "Hello" vs new String("Hello")
package step10;

public class Exam01_1 {
    public static void main(String[] args) {
        //String 인스턴스 생성하는 방법
        //Heap 메모리 영역
        //1)
        String s1 = new String("Hello");
        String s2 = new String("Hello");
        // => 메모리에 저장되는 값의 동일 여부를 검사하지 않고 무조건 인스턴스를 생성한다.
        // => 가비지가 되면 G.C에 의해 제거
        if(s1 == s2)
            System.out.println("s1 == s2");
        else
            System.out.println("s1 != s2");
        
        
        //상수 문자열만 전문적으로 보관하는
        //String canstant pool 메모리 영역에 String instance 만들기
        //2)
        String x1 = "Hello";
        String x2 = "Hello";
        // => 내용물이 같으면 기존 인스턴스의 주소를 리턴
        //  즉 메모리 절약을 위해 중복 데이터를 갖는 인스턴스를 생성하지 않는다.
        // => JVM이 끝날 때까지 메모리에 유지
        
        if(x1 == x2)
            System.out.println("x1 == x2");
        else
            System.out.println("x1 != x2");
    }

}
