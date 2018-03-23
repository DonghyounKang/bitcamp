package step11.ex11;

public class X4 extends X3{
    @Override
    void m1() {
        System.out.println("X4의 m1()");
    }
    
    void test() {
        this.m1(); //X4의 m1()
        super.m1(); //X2의 m1()
        //super.super.m1(); //X의 m1()??? 컴파일 오류
        
        this.m2(); // X3의 m2()
        super.m2(super.m2()); // X의 m2()??? -> 결과: X3의 m2()
        
    }
}


//오버라이딩 과 오버로딩이란????
//웹 - get 방식과 post 방식의 차이와 그 예시
//http protocol??

//객체지향의 시작
// 클래스Class를 선언하는것
// 세상을 데이터로 다루는 것
// 추상화: abstraction
// class로 실체나 개념을 데이터화 시키는 것(Class를 정의하는 행위)
//
// 