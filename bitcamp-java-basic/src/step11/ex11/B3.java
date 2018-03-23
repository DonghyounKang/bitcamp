//오버라이딩 문법 검사
package step11.ex11;

public class B3 extends B {
    /*
     * 오버라이딩 문법 검사
     *  오버라이딩 여부를 컴파일러에게 검사하도록 요청
     *  메서드 저의 앞에 @Override 붙이기
     */
    
    @Override // 컴파일러에게 오버라이딩 오류 검사 요청
    void m(int x) {
        //overriding을 한다고 하면서 파라미터의 타입이나 개수, 순서를 달리해서
        //오버로딩이 되는 경우가 있기 때문에 overriding을 하는 메서드 앞에
        //@override를 붙임으로써 잘못 사용하는 경우를 방지
        System.out.println("B2의 m()");
    }
    
}
