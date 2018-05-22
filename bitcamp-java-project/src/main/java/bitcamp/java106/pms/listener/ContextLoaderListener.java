package bitcamp.java106.pms.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import bitcamp.java106.pms.AppConfig;
import bitcamp.java106.pms.support.WebApplicationContextUtils;

// 서블릿 컨테이너가 시작될 때 Spring IOC Container를 준비
// => 기존의 InitServlet 역할을 대체

@WebListener
public class ContextLoaderListener implements ServletContextListener{
    
    //Servlet Container가 시작되면 Spring IOC Container를 준비한다.
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        ApplicationContext iocContainer = new AnnotationConfigApplicationContext(AppConfig.class);
        
        //Servlet에서 Spring IOC Container를 꺼내 쓸 수 있도록
        //WebApplicationContextUtils에 보관
        WebApplicationContextUtils.containers.put(
                sce.getServletContext(), iocContainer);
        
        //복잡한 이유
        // SpringMVCFramework모방 ; 그냥 그렇게 이해하라
    }
}
