package step11.ex14;

public class A2 extends A{
    
    @Override
    public void m() {
        System.out.println("A2의 m() 호출");
    }
    
    public void x() {
        System.out.println("A에서 추가한 메서드 x()");
    }
}
