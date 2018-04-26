// JDBC 프로그래밍 개요 - DBMS에 SQL문 보내기 : select
package step25.ex01;

import java.sql.Connection;
import java.sql.DriverManager;

public class Exam03_6 {

    public static void main(String[] args) throws Exception {
        // 1) JDBC 드라이버 로딩 
        Class.forName("com.mysql.cj.jdbc.Driver");
        
        System.out.println("JDBC Driver loading & register complete!");
        
        // 2) DBMS에 연결하기
        java.sql.Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/java106db?serverTimezone=UTC&useSSL=false",// serverTimeZone 설정(UTC)
                "java106","1111");
        System.out.println("DBMS Connection Complete");

        // 3) SQL문을 server에 보낼 객체를 얻는다.
        java.sql.Statement stmt = con.createStatement();
        
        // 4) statement 객체를 사용하여 DBMS에 SQL문을 보낸다.
        int count = stmt.executeUpdate("delete from ex_board where bno=13");
        
        System.out.printf("%d element(s) Delete Complete", count);
        //자원해제
        // => File과 마찬가지로 DBMS 연결 이후 더이상 사용하지 않으면 자원해제 할 것
        stmt.close();
        con.close();
        
        
    }
}







