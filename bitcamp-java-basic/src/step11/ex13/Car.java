package step11.ex13;

public class Car {
    String model;
    String maker;
    int cc;
    int valve;
    
    //외부에서 직접 인스턴스를 생성하는 것을 막기위해 private로 생성자를 선언
    private Car() {
        
    }
    
    //대신 객체를 생성해주는 static 메서드 준비
    //어떤 경우에 이렇게 인스턴스를 직접 생성하지 않고 스테틱메서드를 통해 인스턴스메서드를 생성하는가
    // => 다음과 같은 경우처럼 인스턴스 생성과정이 복잡할 경우
    //    직접 인스턴스를 생성하기 보다는 인스턴스를 생성해주는 메서드를 사용하여 인스턴스를 만든다.
    
    // => Singleton 패턴에서 getInstance()메서드는 오직 한개의 인스턴스만 생성한다.\
    //    메서드의 목적이 인스턴스를 한개만 만들어 사용하는 것이다.
    //    하지만 아래의 create()메서드는 호출할 때마다 인스턴스를 만들어주기 때문에 
    //    Singleton과 구조가 비슷하지만 Singleton은 아니다.
    //    이 메서드의 목적은 복잡한 인스턴스 생성을 대신 해주는 것이다.
    
    //    - 언제 이런 방식으로 설계하는가?? -
    // => 인스턴스 생성이 복잡할 경우에 이용하는 방법이다.
    //    즉 인스턴스 생성 기능을 대신해주는 메서드를 통해 인스턴스를 생성하면 
    //    인스턴스를 사용하고 싶은 개발자는 코드가 간결해서 좋다.
    
    // => 이런 생성방식 -> 'factory method 설계 패턴' - 메서드가 인스턴스를 만들어서 리턴
    
    
    public static Car create(String name) {
        
        Car c = new Car(); //private - 클래스 내부에서 사용가능
        
        switch(name) {
        case "티코":
        
            c.model = "티코";
            c.maker = "대우";
            c.cc = 800;
            c.valve = 16;
            
            break;
        
        case "소나타":
            c.model = "소나타";
            c.maker = "대우";
            c.cc = 1980;
            c.valve = 16;
            
            break;
            
        default:
            c.model = "모델 S";
            c.maker = "테슬라";
            c.cc = 0;
            c.valve = 0;
        }
        return c;
    }
}
