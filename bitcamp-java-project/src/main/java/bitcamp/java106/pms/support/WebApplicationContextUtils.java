package bitcamp.java106.pms.support;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletContext;

import org.springframework.context.ApplicationContext;

public class WebApplicationContextUtils {
    
    //실제 Spring Web MVC Framework에서는 웹 어플리케이션 별로 IOC Container를 관리한다.
    //이를 모방하여 만들기 위해 다음과 같이 Map에 보관하는 방식 사용
    public static Map<ServletContext, ApplicationContext> containers =
            new HashMap<>();
    
    //웹 어플리케이션에서 사용할 IOC Container를 꺼내고 싶다면 parameter에 웹 어플리케이션의 정보를 담고있는 servletContext를 넘겨줘야한다. 
    public static ApplicationContext getWebApplicationContext(ServletContext ctx) {
        return containers.get(ctx);
    }
    
}
