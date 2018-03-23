package step11.ex11;

public class D2 extends D {
    @Override
    void m() {
        //재정의 하기 전에 메서드를 호출하고 싶다면
        System.out.println("D2의 m()");
    }

    void test() {
        this.m();
        
        //만약 오버라이딩 하기 전의 메서드를 호출하고 싶다면 -> 이렇게 하면 오해의 소지가 발생할 가능성이 있다.
        //X.java >>
        super.m();
    }
}
