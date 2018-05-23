// web application component : Filter

package step09.ex1;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

// web application component
// 1) Servlet : 클라이언트의 요청을 처리하는 역할을 수행
// 2) Filter : Servlet 실행 전 후에 보조 작업을 수행
// 3) Listener : Servlet Container에서 특정 event가 발생할 때 작업을 수행

//Filter
// - Servlet의 실행 전 후에 특정 작업을 수행하고 싶을 때 사용한다.
// - ex: 
//      => 클라이언트의 접속을 기록하는 기능
//      => 클라이언트가 보낸 데이터의 압축을 해제
//      => 클라이언트가 보낸 데이터의 암호를 해제
//      => Servlet이 작업을 수행하기 전에 공통으로 처리해야하는 작업을 수행
//      => 클라이언트의 인증 또는 권한 검사
//      => 클라이언트에게 보낼 데이터를 압축하거나 암호화

//Filter 만들기
// - javax.servlet.Filter 인터페이스를 구현

//Filter 배치
//  1)Annotation으로 필터를 배치하기 
//      - @WebFilter("적용할 URL")

//  2)DDFile(web.XML)에 Filter를 배치하기
//      - Filter 등록
//      <filter>
//          <filter-name>filter1</filter-name>
//          <filter-class>step09.ex1.Filter1</filter-class>
//      </filter>
//
//      - Filter를 적용할 URL 지정 
//      <filter-mapping>
//          <filter-name>filter1</filter-name>
//          <url-pattern>/step09/ex1/*</url-pattern>
//      </filter-mapping>

@WebFilter("/step09/ex1/*")
public class Filter1 implements Filter{
    FilterConfig config;
    
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        //최초로 필터 객체 생성시 호출
        // 필터가 작업할 때 사용할 도구를 준비시키는 코드를 여기 둔다.
        this.config = filterConfig;
        System.out.println("Filter1.init()");
    }
    
    @Override
    public void destroy() {
        //Web Application이 멈추거나 Servlet container를 멈출 때 호출된다.
        //Filter가 init()를 통해 준비했던 도구나 자원을 해제시키는 코드를 여기에 둔다.
        System.out.println("Filter1.destroy()");
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {
        //Servlet을 실행하기전에 Filter가 적용될 때마다 호출된다.
        // Servlet이 클라이언트의 요청을 처리하는데 필요한 것들을 여기에서 준비한다.
        System.out.println("Filter1.doFilter() : before");
        
        //필터의 작업 수행 후 다음 필터를 실행한다
        //만약 다음 필터가 없으면 원래 목적지인 Servlet을 실행
        chain.doFilter(request, response);
        
        //servlet을 실행한 후에 수행할 작업이 있다면 바로 chain.doFilter() 다음에 두어라
        System.out.println("Filter1.doFilter() : after");
    }
    
    
}
