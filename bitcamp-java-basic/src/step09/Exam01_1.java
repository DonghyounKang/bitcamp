// 생성자 활용 예 - 자바에서 제공하는 클래스 사용을 통해 생성자 활용 익히기
// String
package step09;

public class Exam01_1 {
    public static void main(String[] args) throws Exception {
        //생성자를 호출하여 문자열 인스턴스를 초기화 한다.
        
        String s1 = new String("Hello");
        String s2 = new String("Hello");
        
        //s1과 s2는 다른 인스턴스
        if(s1 == s2) {
            System.out.println("s1 == s2");
        } else {
            System.out.println("s1 != s2");
        }
        
        char[] chars = new char[] {'H', 'e', 'l', 'l', 'o'};
        String s3 = new String(chars);
        
        System.out.printf("%s, %s, %S \n", s1,s2,s3);
        
        byte[] bytes = {(byte)0x0b, (byte)0xa1, (byte)0xb0, 
                (byte)0xa2, (byte)0xb6, (byte)0xca, (byte)0xb6, (byte)0xcb};
        
        String s4 = new String(bytes);
        System.out.println(s4);
        //출력이 깨지는 이유
        //EUC-KR코드 값이 들어있는 바이트 배열이 제대로 유니코드 배열로 저장되지 않았기 때문
        //이 생성자는 바이트 배열에 드어있는 값이 unicode라고 간주
        
        //해결책
        //String 클래스의 생성자 중에서 바이트 배열과 인코딩정보를 함께 받는 생성자를 생성
        //즉 bytes배열에 EUC-KR의 코드값이 들어있다고 알려준다.
        // 그러면 JVM은 바이트 계열에 들어있는 값을 제대로 유니코드로 바꿀것이다.
        String s5 = new String(bytes,"EUC-KR");
        System.out.println(s5);
                  
    }
}

/*
 * 생성자 활용
 * 인스턴스 변수 초기화를 위해 여러개의 생성자를 만들어 제공할 수 있다. 
 * 자신에게 맞는 적절한 생성자를 호출하여 인스턴스르 초기화 시킨 후 사용*/
