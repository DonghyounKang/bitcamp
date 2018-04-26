// JDBC 프로그래밍 개요 - DBMS에 SQL문 보내기 : select
package step25.ex01;

import java.sql.Connection;
import java.sql.DriverManager;

public class Exam03_2 {

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
        //아직 서버에서 결과를 가져오지 못했다.
        
        // 5) ResultSet객체를 사용하여 server에서 select한 결과를 한 record(row)를 가져온다.
        //용어정리
        //record(레코드) : select를 실행한 후, 생성된 결과를 말한다.
        boolean isReceived = rs.next(); // 가져왔다면 true, 가져올것이 없다면 false
        
        if(isReceived) {
            //서버에서 한개 가져온 결과 출력
            System.out.printf("%d, %s, %s, %s\n",
                    rs.getInt(1), //select결과의 컬럼번호. 1번부터 시작 -> bno
                    rs.getString(2), //'titl' 컬럼 값
                    rs.getString(3), //'cont' 컬럼 값
                    rs.getDate(4)); //'rdt' 컬럼 값
        } else {
            System.out.println("could not get the record from Server");
        }
        
        //자원해제
        // => File과 마찬가지로 DBMS 연결 이후 더이상 사용하지 않으면 자원해제 할 것
        rs.close();
        stmt.close();
        con.close();
        
        
    }
}







