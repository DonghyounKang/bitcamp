package bitcamp.java106.step06;

import org.springframework.beans.factory.FactoryBean;

//Spring IOCContainer에서 정한 규칙에 따라 factory 클래스를 만들면
//Spring 전용 문법을 사용하여 보다 쉽게 객체를 생성할 수 있다.
//
//Spring에서 factory 클래스를 만들때 제안한 규칙
//=>org.springframework.beans.factory.FactoryBean 인터페이스
//
public class CarFactory3 implements FactoryBean<Car> {
    String model;
    
    public CarFactory3() {
        System.out.println("CarFactory3()생성자 호출됨");
    }
    
    public void setModel(String model) {
        System.out.println("CarFactory3.setModel() 호출됨");
        this.model = model;
    }
    
    @Override
    public Car getObject() throws Exception {
        System.out.println("CarFactory3.getObject() 호출됨");
        // 객체를 생성해서 리턴하는 메서드 spring IOCContainer는 이 메서드를 호출 할 것이다.
        // 객체 생성시 추가적으로 필요한 값을 파라마터로 받을 수 없기 때문에 
        // 프로퍼티로 받도록 해야한다.
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

    @Override
    public Class<?> getObjectType() {
        System.out.println("CarFactory3.getObjectType() 호출됨");
        return Car.class; // 이 공장 객체가 만드는 인스턴스의 타입은 Car이다.
    }


}
