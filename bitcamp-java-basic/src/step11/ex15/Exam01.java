//상속 - Generalization 수행 전
package step11.ex15;
//상속의 종류

//1) Specialization
//  => 가장 많이 사용하는 방법
//     super클래스를 상속받아 sub클래스를 만드는 것
//     super클래스에 특징을 추가하여 더 특별한 기능을 수행하는 sub클래스를 만든다
//     
//     "특화/특수화/전문화(specialization)"

//2) Generalization
//  => 리펙토링 과정에 수행하는 방법
//     sub클래스들에 공통분모를 추출하여 super클래스를 정의하는 것
//
//     "일반화/표준화(generalization)" 
public class Exam01 {
    //Sedan 클래스와 Truck클래스의 공통 메서드를 추출하여
    //Car 클래스 정의 후
    //두 클래스는 Car클래스를 상속받도록 한다.
    
    public static void main(String[] args) {
        
    }
}
