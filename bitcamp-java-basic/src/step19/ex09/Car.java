// 의존객체 Engine을 자체적으로 만들지 않고 외부에서 주입
package step19.ex09;

@Component(value = "car")

public class Car {
    
    Engine engine;

    public Car (Engine engine) {
        System.out.println("===> Car(Engine)");
        this.engine = engine;
    }
    public void move( ) {
        engine.run();
    }
}
