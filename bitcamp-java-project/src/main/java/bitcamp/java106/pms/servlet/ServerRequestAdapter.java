package bitcamp.java106.pms.servlet;

import javax.servlet.http.HttpServletRequest;

import bitcamp.java106.pms.server.ServerRequest;

public class ServerRequestAdapter extends ServerRequest {
    HttpServletRequest request;

    public ServerRequestAdapter(HttpServletRequest request) {
        super("");
        this.request = request;
    }
    

    //상속받은 메서드를 현재 클래스의 역할에 맞게 재정의 - Overriding
    @Override
    public String getParameter(String name) {
        return request.getParameter(name);
    }
    
    @Override
    public String getServerPath() {
        return request.getPathInfo();
    }

}
