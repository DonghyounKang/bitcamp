// 다형성 - 다형적 변수(polymorphic variables)
package step11.ex09;

public class Exam01 {
    public static void main(String[] args) {
        Vehicle v = new Vehicle();
        Bike b = new Bike();
        Car c = new Car();
        Sedan s = new Sedan();
        Truck t = new Truck();
        
        
        //레퍼런스는 같은 타입의 객체를 가르킬수 있을 뿐만 아니라 
        //그 클래스의 서브 클래스까지 가리킬수 있다.
        //왜?
        //서브클래스는 항상 상위클래스에 모든 것을 사용할 수 있기 때문이다.
        //(class 내의 for문을 생각해보자 for문에서는 for문 밖의 변수를 사용할 수 있지만 class에서는 for문 안에 있는 변수를 사용할 수 없다.) 
        
        //이런 규칙에 따라 다음 v1변수는 Vehicle 객체 뿐만 아니라
        //Bike, Car, Sedan, Truck객체 까지 다양한 서브 클래스의 객체를 가리킬 수 있다.
        //따라서 v1는 "다형적 변수"의 기능을 갖고 있다고 말한다. 
        Vehicle v1 = null;
        v1 = b; //OK
        v1 = c; //OK
        v1 = s; //OK
        v1 = t; //OK
        
        Bike b1 = null;
        //b1 = v; //컴파일 오류
        //b1 = c; //컴파일 오류
        //b1 = s; //컴파일 오류
        //b1 = t; //컴파일 오류
        
        Car c1 = null;
        //c1 = v; //컴파일 오류
        //c1 = b; //컴파일 오류
        c1 = s; //OK
        c1 = t; //OK
        
        Sedan s1 = null;
        //s1 = v; //컴파일 오류
        //s1 = b; //컴파일 오류
        //s1 = c; //컴파일 오류
        //s1 = t; //컴파일 오류
        
        Truck t1 = null;
        //t1 = v; //컴파일 오류
        //t1 = b; //컴파일 오류
        //t1 = c; //컴파일 오류
        //t1 = s; //컴파일 오류
        
    }
}
