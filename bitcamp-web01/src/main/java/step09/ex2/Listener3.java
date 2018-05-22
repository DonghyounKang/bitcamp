//ListenerIII : ServletRequestAttributeListener - ServletRequest의 값을 저장하거나 제거할 때 사용하는 Listener
package step09.ex2;

import javax.servlet.ServletRequestAttributeEvent;
import javax.servlet.ServletRequestAttributeListener;
import javax.servlet.annotation.WebListener;


@WebListener
public class Listener3 implements ServletRequestAttributeListener {
        @Override
        public void attributeAdded(ServletRequestAttributeEvent srae) {
            //ServletRequest 객체에 값을 저장할 때 호출
            System.out.println("Lister3.attributeAdded()");
            System.out.printf("%s = %s 저장\n",srae.getName(), srae.getValue());
        }
        
        @Override
        public void attributeReplaced(ServletRequestAttributeEvent srae) {
            //ServletRequest 객체에 값을 변경할 때 호출
            System.out.println("Lister3.attributeReplaced()");
            System.out.printf("%s = %s(%s) 변경\n", 
                    srae.getName(), 
                    srae.getServletRequest().getAttribute(srae.getName()), // 변경한 후의 값
                    srae.getValue()); //변경되기 전의 값
            
        }
        
        @Override
        public void attributeRemoved(ServletRequestAttributeEvent srae) {
          //ServletRequest 객체에 값을 제거할 때 호출
        }
    
}
