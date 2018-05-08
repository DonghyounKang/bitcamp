
package bitcamp.java106.step08;

import java.sql.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

//
public class Car6 {
    String model;
    String maker;
    int cc;
    boolean auto;
    Date createdDate;
    
    @Autowired(required=false)
    @Qualifier(value ="e2")//의존객체가 여러개 있을 경우 주입할 의존객체의 이름을 지정 value 생략가능 BeanPostProcessor 등록 필수
    Engine engine;

    

    
    @Override
    public String toString() {
        return "Car [model=" + model + ", maker=" + maker + ", cc=" + cc + ", auto=" + auto + ", createdDate="
                + createdDate + ", engine=" + engine + "]";
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        System.out.println("Car.setEngine()");
        this.engine = engine;
    }


    public boolean isAuto() {
        return auto;
    }

    public void setAuto(boolean auto) {
        this.auto = auto;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getMaker() {
        return maker;
    }

    public void setMaker(String maker) {
        this.maker = maker;
    }

    public int getCc() {
        return cc;
    }

    public void setCc(int cc) {
        this.cc = cc;
    }


}



