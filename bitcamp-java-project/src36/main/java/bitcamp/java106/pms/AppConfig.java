package bitcamp.java106.pms;

import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//이 클래스가 Spring IOC 관련해서 설정작업을 수행함을 지정
@Configuration 
//자동으로 객체를 생성할 패키지 지정
//=> @component가 붙은 클래스를 찾아 자동으로 객체를 생성 & 의존객체 자동 주입
@ComponentScan(basePackages="bitcamp.java106.pms")
public class AppConfig {
    //Spring IOC container에서 자동생성하지 않는 객체는 
    //factory 메서드를 만들어 SpringIOCContainer에게 리턴해야한다.
    //단 Spring IOC container에게 이 메서드를 호출하여
    //이 메서드가 리턴한 객체를 컨테이너에 보관하도록 명령을 내려야하는데
    // 메서드 앞에 @Bean 애노테이션을 붙이면 된다.
    @Bean //Spring IOC container에게 이메서드르 호출하라는 명령
          // 그러면 이 Spring IOC Container는 이 메서드를 호출한 후 그 리턴값을 컨테이너에 보관한다.
    public SqlSessionFactory getSqlSessionFactory() throws Exception {
        InputStream inputStream = Resources.getResourceAsStream(
                "bitcamp/java106/pms/sql/mybatis-config.xml");
        return new SqlSessionFactoryBuilder().build(inputStream);
    }
    
}
