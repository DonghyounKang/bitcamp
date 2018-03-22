package step11.ex04;

public class Exam01 {
    public static void main(String[] args) {

        //방법3) 상속을 이용하여 기능을 추가한 클래스를 사용한다.
        //      장점
        //      => 기존 코드의 문제가 있으면 그 코드를 수정하는 순간, 
        //         그 코드르 상속받아 만든 모든 클래스에 자동으로 적용
        //      => 기존 코드를 손대지 않기 때문에 새 기능을 추가할 때 
        //         기존 기능에 문제가 발생할 가능성이 거의 없다.
        //      => 소스 코드의 유지보수가 쉽다.
        Sedan c = new Sedan("비트자동차", "티코", 5, true, true);
        
        //이것이 상속이라는 문법이 등장한 이유이다.
        // => 기존 코드의 수정을 최소화 하면서 새 기능을 추가하는 방법
        // => 기존 기능을 재작성하지 않고 다시 사용할 수 있게 만드는 문법이다.
        // => 코드 재사용성을 높인다. 
        
    }
}
