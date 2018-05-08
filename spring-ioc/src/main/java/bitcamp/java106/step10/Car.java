package bitcamp.java106.step10;

import java.sql.Date;

import org.springframework.stereotype.Component;

//@Component
// Spring IOC Container는 이 애노테이션에 붙은 클래스에대해 객체를 자동생성한다.
// 문법: @Component(value="객체이름") value 생략가능
// 객체 이름 생략하는 경우 클래스 이름을 객체 이름으로 사용

@Component
public class Car {
    String model;
    String maker;
    int cc;
    boolean auto;
    Date createdDate;
    
    Engine engine;
    
    //의존객체는 생성자에서 주입하는 것이 좋다.
    // 의존객체라는 말은 해당 객체 없이는 작업이 불가하다는 의미이기 때문에
    // 필수객체이다.
    //따라서 유지보수를 위해 생성자에서 받는것이 좋다.
    // 즉 의존객체 없이 해당 객체를 생성하는 일을 방지할 수 있다. 
    public Car(Engine engine) {
        this.engine = engine;
    }
    
    @Override
    public String toString() {
        return "Car [model=" + model + ", maker=" + maker + ", cc=" + cc + ", auto=" + auto + ", createdDate="
                + createdDate + ", engine=" + engine + "]";
    }

    /*
     * 의존객체는 외부에서 주입받는 것이기 때문에 생성자의 파라미터로 받는 경우 setter getter를 선언할 필요가 없다.
    public Engine getEngine() {
        return engine;
    }


    public void setEngine(Engine engine) {
        System.out.println("Car.setEngine() 호출");
        this.engine = engine;
    }
*/

    public boolean isAuto() {
        return auto;
    }

    public void setAuto(boolean auto) {
        System.out.println("Car.setAuto() 호출");
        this.auto = auto;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        System.out.println("Car.setCreatedDate() 호출");
        this.createdDate = createdDate;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        System.out.println("Car.setModel() 호출");
        this.model = model;
    }

    public String getMaker() {
        return maker;
    }

    public void setMaker(String maker) {
        System.out.println("Car.setMaker() 호출");
        this.maker = maker;
    }

    public int getCc() {
        return cc;
    }

    public void setCc(int cc) {
        System.out.println("Car.setCc() 호출");
        this.cc = cc;
    }


}



