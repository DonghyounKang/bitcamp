//ListenerII : ServletRequestListener - 요청이 들어오고 응답이 발생할 때 사용되는 Listener
package step09.ex2;

import java.util.Date;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpServletRequest;


@WebListener
public class Listener2 implements ServletRequestListener {
    @Override
    public void requestInitialized(ServletRequestEvent sre) {
        HttpServletRequest request = (HttpServletRequest)sre.getServletRequest();
        System.out.printf("Listener2.requestInitialized() - %s\n", new Date());
        System.out.printf("[%s] : %s\n", request.getRemoteAddr(), request.getServletPath());
    }
    
    @Override
    public void requestDestroyed(ServletRequestEvent sre) {
        //Filter까지 모두 수행후 응답을 완료했을 때 호출
        System.out.printf("Listener2.requestDestroyed() - %s\n", new Date());

    }
}
