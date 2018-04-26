//DBconnection 객체 관리하는 역할

package step25.ex04;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.ArrayList;
import java.util.Properties;

public class DefaultDataSource implements DataSource {
    String driver;
    String jdbcUrl;
    String user;
    String password;
    ArrayList<Connection> conPool = new ArrayList<>();
    
    //생성자에 DB관련 정보를 주지 않는다면 
    // JVM property에 서 찾는다.
    public DefaultDataSource() throws Exception {
        Properties props = new Properties();
        props.load(new FileInputStream("jdbc.properties"));
        this.driver = props.getProperty("jdbc.driver");
        this.jdbcUrl = props.getProperty("jdbc.url");
        this.user = props.getProperty("jdbc.username");
        this.password= props.getProperty("jdbc.password");
    }
    
    public DefaultDataSource(String driver, String jdbcUrl, String user, String password) throws Exception {
        this.driver = driver;
        this.jdbcUrl =jdbcUrl;
        this.user = user;
        this.password =password;
        
        //JDBC 드라이버 로딩 및 DriverManager에 등록
        Class.forName(driver);
        // Driver 객체가 로딩할 때 스스로 객체를 생성하여 DriverManager에 등록
        
    }
    
    public Connection getConnection() throws Exception {
        if (conPool.size() == 0) {
            //저장된 Connection 객체가 없다면, 새로생성
            System.out.println("새 connection object 생성");
            return new ConnectionProxy(
                    this,
                    DriverManager.getConnection(jdbcUrl, user, password));
        }
        
        Connection con = conPool.remove(0);
        if (con.isClosed() || //보관소에 꺼낸 connection 객체가 닫혀있거나
                !con.isValid(1)) {// 그 연결이 유효하지 않다면
            return new ConnectionProxy(
                    this,
                    DriverManager.getConnection(jdbcUrl, user, password));
            //isValid(초)
            // 그 연결의 유효 여부를 검사하기 위해 DBMS에 간단한 메세지를 보내 확인
            // 서버에서 1초이내에 응답이 온다면 유효한 것으로 판단
        }
        System.out.println("기존 연결 객체 사용");
        return con;
    }
    
    public void returnConnection(Connection con) {
        conPool.add(con);
    }
}
