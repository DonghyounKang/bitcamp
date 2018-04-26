// JDBC 프로그래밍 개요 - DBMS에 연결하기
package step25.ex01;

import java.sql.Connection;
import java.sql.DriverManager;

//
public class Exam02_2 {

    public static void main(String[] args) throws Exception {
        // 1) JDBC 드라이버 로딩 
        Class.forName("com.mysql.cj.jdbc.Driver");
        
        System.out.println("JDBC Driver loading & register complete!");
        
        // 2)DBMS에 연결하기
        // => DriverManager를 통해 등록된 Driver 객체를 사용하여 DBMS와 연결한다.
        //      DriverManager.getConnection(jbc url, username, password)
        //      jdbc url : DBMS 서버정보 예) jdbc:mysql://서버:포트/데이터베이스 명
        //      username : DBMS 사용자 ID
        //      password : DBMS 사용자 암호
        // => 리턴 : Driver가 DBMS와 연결한 후 연결정보를 다루는 객체를 리턴
        Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/java106db?serverTimezone=UTC&useSSL=false&user=java106&password=1111");
        
        //jdbc url에 사용자 아이디와 암호 포함 가능
        
        System.out.println("DBMS Connection Complete");
        //자원해제
        // => File과 마찬가지로 DBMS 연결 이후 더이상 사용하지 않으면 자원해제 할 것
        con.close();
        
    }
}







