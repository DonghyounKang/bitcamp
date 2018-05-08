
package bitcamp.java106.step10;

import org.springframework.context.annotation.Bean;

public class AppConfig01 {
    //AnnotationConfigApplicationContext는 @Bean이 붙은 메서드를 호출하여 
    // 그 리넡값을 컨테이너에 저장
    //객체이름 미지정시 메서드 이름을 객체이름으로 사용
    @Bean 
    public Car getCar() {
        Car c = new Car(null);
        c.setMaker("비트 자동차");
        c.setModel("티코");
        c.setCc(890);
        c.setAuto(true);
        return c;
    }
    //@Bean("car") // 해당 메서드를 보관할 때 사용할 이름 지정
    // 실무에서는 스프링 설정용어로 사용하는 클래스에서 객체를 리턴하는 메소드 생성시 그 메서드의 이름을 객체이름과 같게 짓는다.
    @Bean
    public Car car2() {
        Car c = new Car(null);
        c.setMaker("비트 자동차");
        c.setModel("티코");
        c.setCc(890);
        c.setAuto(true);
        return c;
    }
}
