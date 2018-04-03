//상속 - Generalization 수행 후 
package step11.ex16;

//Sedan과 Truck의 공통 기능인
//start(), shutdown(), run() 메서드를 추출하여 Car 클래스를 만들고
//Sedan과 Truck은 이 클래스의 sub클래스가 된다.

//start와 shutdown은
//Sedan이나 Truck 모두 같은 작업을 수행하기 때문에 
// 상속받은 것을 그대로 사용하면 되지만
// run()은 Sedan과 Truck이 서로 다르게 작업하기 때문에 오버라이딩해야한다.
public class Exam01 {
    //Sedan 클래스와 Truck클래스의 공통 메서드를 추출하여
    //Car 클래스 정의 후
    //두 클래스는 Car클래스를 상속받도록 한다.
    
    public static void main(String[] args) {
        
    }
}
