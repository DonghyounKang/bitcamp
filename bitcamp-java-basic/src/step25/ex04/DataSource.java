//DBconnection 객체 관리하는 역할
// => 빌려주는 역할을 수행
package step25.ex04;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.ArrayList;
import java.util.Properties;

public interface DataSource {
    public Connection getConnection() throws Exception;
    public void returnConnection(Connection con);
}
