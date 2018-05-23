//클라이언트가 보낸 데이터의 charset을 지정하는 필터
package bitcamp.java106.pms.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

@WebFilter("/*")  //모든 servlet을 실행하기전에 작업 수행할 filter
public class CharacterEncodingFilter implements Filter{
    
    FilterConfig config;
    String encoding = "UTF-8";
    
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        this.config = filterConfig;
        
        if(config.getInitParameter("encoding") != null ) {
            this.encoding = config.getInitParameter("encoding");
        }
    }
    
    @Override
    public void destroy() {

    }
    
    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
        throws IOException, ServletException {
        
        //서블릿 실행전 클라이언트가 보낼 데이터에 대해 charset 지정
        request.setCharacterEncoding(this.encoding);
        
        // 다음 필터가 있다면 그 필터의 dofilter()를 호출
        // 없다면 서블릿의 service()호출
        chain.doFilter(request, response);
        
        //서블릿 호출 후 특별히 처리할 작업이 있다면 여기에 작성한다.
        //
    }
}
