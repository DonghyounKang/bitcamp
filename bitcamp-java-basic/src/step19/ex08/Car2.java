// 의존객체 Engine을 자체적으로 만들지 않고 외부에서 주입
package step19.ex08;

public class Car2 {
    
    Engine engine;

    public Car2 (Engine engine) {
        System.out.println("===> Car2(Engine)");
        this.engine = engine;
    }
    public void move( ) {
        engine.run();
    }
}
