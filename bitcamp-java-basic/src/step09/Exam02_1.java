//인스턴스 메서드와 클래스 메서드의 활용 - String class
package step09;

public class Exam02_1 {

    public static void main(String[] args) throws Exception {
        String s1 = new String("Hello");
        
        //s1 인스턴스(s1 레퍼런스가 가리키는 인스턴스)의 값을 조회하는 메서드 사용
        //따라서 이 메서드를 호출하기 위해서 반드시 String 인스턴스의 주소를 줘야 한다.
        char c1 = s1.charAt(1);
        System.out.println(c1);
        
        System.out.println(s1.compareTo("Helli"));
        System.out.println(s1.compareTo("Hello"));
        System.out.println(s1.compareTo("Hellu"));
        
        System.out.println(s1.contains("ll"));
        System.out.println(s1.contains("ee"));

        // 두 문자열 연결하여 새 문자열 생성
        String s2 = s1.concat(", World");
        System.out.println(s1);
        System.out.println(s2);
        
        // 두 인스턴스의 문자열이 같은지 비교할 때
        System.out.println(s1.equals("aaa"));
        System.out.println(s1.equals("Hello"));
        
        //인스턴스에 들어있는 문자코드를 바이트 배열로 만들어 리턴
        String s3 = new String("ABC가각");
        
        //인스턴스에 들어있는 각 문자르 바이트 배열에 저장할 때 UTF-8 코드값으로 저장한다.
        //인코딩 문자 집합을 지정하지 않으면 JVM의 기본문자집합으로 인코딩한다.
        //이클립스에서 JVM을 실행하면 JVM은 기본으로 UTF-8문자표를 사용하여 바이트 배열의 코드값을 저장한다.
        byte[] bytes = s3.getBytes();
        
        //다른 인스턴스 메서드를 사용하여 바이트 배열을 추출해보기
        bytes = s3.getBytes("EUC-KR");
        for(int i = 0; i < bytes.length; i++)
            System.out.printf("%x,",bytes[i]);
        System.out.println();
        
        //String 클래스에도 특정 인스턴스가 아닌 일반 목적으로
        //문자열을 다룰수 있는 메서드르 제공한다.
        //즉 "클래스 메서드 = 스태틱 메서드" 제공한다.
        
        // => 형식을 갖춘 문자열을 만들기
        String s4 = String.format("%s님 반갑습니다.", "홍길동");
        System.out.println(s4);
        
        // => 구분자와 문자열들을 파라미터롤 받아서 연결한 새 문자열 만들기
        String s5 = String.join(":", "홍길동","임꺽정","유관순");
        System.out.println(s5);
        
        // => primitive type을 문자열로 만들기
        String s6 = String.valueOf(true);
        String s7 = String.valueOf(3.14f);
        String s8 = String.valueOf(100);
        
        System.out.println(s6);
        System.out.println(s7);
        System.out.println(s8);
    }
}
