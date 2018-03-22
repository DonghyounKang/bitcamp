package step11.ex07;



public class B extends step11.ex07.A {
    
        int v2;
        
        B() {
            //수퍼클래스의 어떤 생성자를 호출할지 지정하지 않으면
            //다음과같이 수퍼클래스의 기본생성자를 호출하라는 명령을 붙인다.
            //super();
            
            //만약 수퍼클래스에 기본생성자가 없으면 컴파일 오류 발생
            //해결방법
            //개발자가 직접 수퍼클래스에 있는  생성자를 호출하라.
            super(100);
            
            System.out.println("B()생성자");
        }
    
}
