package step11.ex11;

public class B2 extends B {
    /*
     * 오버라이딩 문법
     *  => 메서드명, 파라미터 형식, 리턴 타입이 같아야한다.
     *  => 파라미터 명은 달라도 상관없다.
     */
    void m(float x) {
        //이 메서드는 실수로 파라미터 타입을 실수로 float으로 설정
        //이것은 오버라이딩이 아닌 오버로딩이 된 것
        //즉 float 파라미터를 받는 m()메서드가 추가된것
        // 개발자는
        System.out.println("B2의 m()");
    }
    
}
