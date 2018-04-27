// Application Container가 갖춰야할 기능(규칙) 정의한다.
package bitcamp.java106.pms;

public interface ApplicationContainer {
    String execute(String requestURI);
}
