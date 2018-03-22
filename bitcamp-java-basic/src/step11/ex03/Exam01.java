package step11.ex03;

public class Exam01 {
    public static void main(String[] args) {

        //방법2) 기존 코드를 복사하여 새 클래스(Car2)를 만든다.
        //      문제점
        //      => 같은 기능을 하는 여러 클래스가 존재하게 되면 
        //         관리하기가 힘들다.
        //      => 만약 원본 코드에 버그가 있다면 버그도 복사하게 된다.
        //      => 따라서 버그를 고칠 때는 복사한 코드도 일일이 찾아 고쳐야 한다.
        Car2 c = new Car2("비트자동차", "티코", 5, true, true);
        
    }
}
