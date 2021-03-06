//초기화 블록 - 인스턴스 블록의 활용
package step08;

public class Exam06_2 {
    
    public static void main(String[] args) {
        /*생성자를 이용하여 인스턴스를 초기화 시킬수 있는데 
         *인스턴스 블록이라는 문법이 존재하는 이유?
         *생성자를 정의할 수 있는 상황이라면 인스턴스 블록은 사용할 이유가 없다.
         *
         *만약 생성자를 정의할 수 없는 상황이라면 인스턴스 블록 사용
         *
         *생성자를 사용할 수 없는 경우가 존재하는가 = > YES
         *
         *예)
         *"익명 클래스"
         *클래스 이름이 없기 때문에 생성자를 만들 수 없다.
         *그러나 생성자처럼 꼭 기본 값으로 초기화 시키고 싶다.
         */
        
        //다음은 Object클래스를 상속받은 익명클래스를 정의하고 객체를 만드는 명령이다.
        Object obj1 = new Object() {
            //이 클래스는 이름이 없으므로 생성자를 만들 수 없다.
            //따라서 초기화를 하려면 인스턴스 블록을 사용해야 한다. 
            {
                System.out.println("인스턴스 블록");
            }
        };
        
    }
}
