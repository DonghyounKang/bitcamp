// JDBC 프로그래밍 개요 - DBMS에 SQL문 보내기 : insert
package step25.ex01;

import java.sql.Connection;
import java.sql.DriverManager;

//
public class Exam03_1 {

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
        // - 리턴값: sql문을 DBMS형식 (protocol)에 따라 encoding하여 서버에 전달하는 일을 하는 객체
        java.sql.Statement stmt = con.createStatement();
        
        // 4) statement 객체를 사용하여 DBMS에 SQL문을 보낸다.
        //    -executeUpdate(INSERT, UPDATE, DELETE 등 DML)
        //      => 리턴 값: 변경(추가,수정,삭제)된 데이터의 개수
        //    -executeQuery(SELECT등 DQL)
        //      => 리턴 값: 서버에서 데이터를 가져올 때 사용하는 도구(객체)
        
        //용어정리
        //DML(Data Manipulation Language)
        // 데이터를 조작하는 sql명령어
        //DQL(Data Quary Language)
        // 데이터를 조회하는 sql명령어
        int count = stmt.executeUpdate(
                "insert into ex_board(titl,cont,rdt) values('aaa','xxx',now())");
        System.out.printf("%d element(s) Insert Complete", count);
        
        //자원해제
        // => File과 마찬가지로 DBMS 연결 이후 더이상 사용하지 않으면 자원해제 할 것
        stmt.close();
        con.close();
        
        
    }
}







