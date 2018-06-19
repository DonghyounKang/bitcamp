//Spring IOC Container를 설정하는 클래스
package bitcamp.java106.step13_AOP.ex6;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration// 이 클래스가 설정 클래스임을 선언
@ComponentScan("bitcamp.java106.step13_AOP.ex6")
@EnableAspectJAutoProxy
public class AppConfig {

}
