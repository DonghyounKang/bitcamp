package bitcamp.java106.step06;
//스테틱 메서드
public class CarFactory {
    public static Car create(String model) {
        Car c = new Car();
        switch(model) {
        case "티코" :
            c.setMaker("대우");
            c.setModel("Tico");
            c.setCc(890);
            return c;
        case "소나타" :
            c.setMaker("현대");
            c.setModel("Sonata");
            c.setCc(1980);
            return c;
        case "SM5" :
            c.setMaker("르노삼성");
            c.setModel("SM5");
            c.setCc(1990);
            return c;
        default:
            c.setMaker("비트");
            c.setModel("자바휘웅");
            c.setCc(5000);
            return c;
        }
    }
}
