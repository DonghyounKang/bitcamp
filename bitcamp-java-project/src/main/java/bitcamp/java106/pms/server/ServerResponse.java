//역할 : 응답과 관련된 기능을 다룬다.
package bitcamp.java106.pms.server;

import java.io.PrintWriter;

public class ServerResponse {
    protected PrintWriter out;
    
    public ServerResponse(PrintWriter out) {
        this.out = out;
    }
    
    public PrintWriter getWriter() {
        return this.out;
    }
}


//ver 28 : 클래스 추가