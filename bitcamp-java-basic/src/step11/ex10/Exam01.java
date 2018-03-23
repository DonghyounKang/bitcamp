// method overloading - 정의 하는 규칙 & 사용규칙

package step11.ex10;

public class Exam01 {

    public static void main(String[] args) {
        //메서드 사용하기
        // => 같은 이름의 메서드가 여러개 있을 경우, 
        //메서드를 호출할 때 넘겨주는 값(아규먼트)의 타입과 개수로 호출할 메서드를 결정한다.

        // 다음은 m() 메서드 중에서 아규먼트를 받지 않는 메서드를 호출 한다.
        A.m();
        
        // 다음은 int 값을 받는 m()을 호출
        A.m(100);
        
        // 다음은 String 값을 받는 m()을 호출
        A.m("hello");
        

        // 다음은 int와 String 값을 순서대로 받는 m()을 호출
        A.m(100, "hello");
        

        // 다음은 String 과 int 값을 순서대로 받는 m()을 호출
        A.m("hello", 100);
        
        //float타입의 값을 받는 m()은 없기때문에 컴파일 오류
        //A.m(3.14f);
        
        //메서드를 찾을 때 아규먼트의 타입과 일치하는 메서드를 찾기 때문에 메서드의 파라미터 이름은 아무 상관이 없다.
        //메서드의 파라미터 이름은 아무 상관이 없다.
    }
}

//오버로딩(overloading)
// => 파라미터 타입이나 개수, 순서는 다르지만 이름이 같은 메서드를 여러 개 만들 수 있는 문법
//왜 이런 문법이 등장했는가?(중요!)
// => 파라미터의 형식은 다르지만 같은 기능을 수행하는 메서드에 대해 같은 이름을 부여함으로써
//    프로그래밍의 일관성을 제공하기 위함