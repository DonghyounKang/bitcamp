// JDBC 프로그래밍 개요 - DBMS에 SQL문 보내기 : select
package step25.ex02_CRUDBoardByJDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class Exam01_Delete {

    public static void main(String[] args) throws Exception {
        Scanner keyScan = new Scanner(System.in);
        System.out.print("삭제할 게시물 번호 : ");
        String no = keyScan.nextLine();
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/java106db?serverTimezone=UTC&useSSL=false",// serverTimeZone 설정(UTC)
                "java106","1111");
        Statement stmt = con.createStatement();
        int count = stmt.executeUpdate("delete from ex_board where bno=" + no);
        System.out.printf("%d element(s) Delete Complete", count);

        con.close();
        keyScan.close();
    }
}







