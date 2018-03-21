//클래스 변수의 응용
package step08;

public class Exam01_6 {
    static class Member {
        //=>모든 인스턴스가 다음의 변수에 대해 같은 값을 가질경우 클래스 변수로 만드는것이 
        //바람직하다.
        //=> 만약 값을 저장하는 용도가 아닌 조회하는 용도로만 사용한다면 대문자로 선언하여
        //상수임을 표현하라
        //=> 조회용도로만 사용하기로 결정했다면 문법적으로 값을 변경하는 것을 막아라(final 사용)
        //=> 보통 조회용으로 사용하는 변수는 공개해도 된다. -> public으로 선언
        public final static int GUEST = 0;
        public final static int MEMBER = 1;
        public final static int MANAGER = 2;
        
        String id;
        String password;
        int type; //0: 손님, 1: 회원, 2: 관리자
    }
    
    public static void main(String[] args) {
        Member m1 = new Member();
        m1.id = "aaa";
        m1.password = "1111";
        m1.type = 0;
        
        Member m2 =new Member();
        m2.id = "bbb";
        m2.password = "2222";
        m2.type = 2;
        
        Member m3 =new Member();
        m3.id = "ccc";
        m3.password = "3333";
        m3.type = 1;
       
        //회원의 타입을 지정할 때 숫자를 이용함
        //그런데 소스코드를 작성한 후 시간이 오래 지나면 숫자의 의미를 기억하기 쉽지 않다.
        //소스코드 작성자 본인도 숫자의 의미를 기억하기 쉽지 않다.
        //다른 사람의 소스 코드를 유지 보수 하는 사람은 더더욱 숫자의 의미를 파악하기 어렵
        //주석이나 개발 문서를 자세히 살펴보지 않는 이상 숫자의 의미를 파악하기 쉽지 않다.
        
        //이런 경우를 방지하고자 만든 문법이 "상수"이다.
        
        //-상수-
        //의미있는 이름으로 변수를 생성하여 그 변수에 숫자를 저장한다.
        //그리고 그 값을 사용시 변수를 통해 사용
        //상수를 사용한 예
        Member m4 = new Member();
        m4.id = "aaa";
        m4.password = "1111";
        m4.type = Member.GUEST;
        
        Member m5 =new Member();
        m5.id = "bbb";
        m5.password = "2222";
        m5.type = Member.MANAGER;
        
        Member m6 =new Member();
        m6.id = "ccc";
        m6.password = "3333";
        m6.type = Member.MEMBER;
       
        
    }
}
