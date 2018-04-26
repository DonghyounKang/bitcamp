// JDBC 프로그래밍 개요 - DBMS에 SQL문 보내기 : select
package step25.ex01;

import java.sql.Connection;
import java.sql.DriverManager;

public class Exam03_4 {

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
        //      => 리턴 값: 서버에서 데이터를 가져오는 역할을 하는 객체를 리턴
        java.sql.ResultSet rs = stmt.executeQuery("select bno,titl,cont,rdt from ex_board");
        
        // 5) ResultSet객체를 사용하여 server에서 select한 결과를 한 record(row)를 가져온다.
        //용어정리
        //record(레코드) : select를 실행한 후, 생성된 결과를 말한다.
        boolean isReceived = rs.next(); // 가져왔다면 true, 가져올것이 없다면 false
        
        while (rs.next()) {
            System.out.printf("%d, %s, %s, %s\n",
                    rs.getInt("bno"), 
                    //rs.getString("bno"),    
                    rs.getString("titl"), 
                    rs.getString("cont"), 
                    rs.getDate("rdt")/*java.sql.date 객체 리턴*/); 
                    //rs.getString("rdt"));
        }
        
        //자원해제
        // => File과 마찬가지로 DBMS 연결 이후 더이상 사용하지 않으면 자원해제 할 것
        rs.close();
        stmt.close();
        con.close();
        
        
    }
}







