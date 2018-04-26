// 게시판 관리 - 조회(view)
package step25.ex02_CRUDBoardByJDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class Exam01_Read_Retrieve_view {

    public static void main(String[] args) throws Exception {
        Scanner keyScan = new Scanner(System.in);
        System.out.print("조회할 게시물 번호 : ");
        String no = keyScan.nextLine();

        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/java106db?serverTimezone=UTC&useSSL=false",// serverTimeZone 설정(UTC)
                "java106","1111");

        Statement stmt = con.createStatement();

        ResultSet rs = stmt.executeQuery("select bno,titl,cont, rdt from ex_board where bno=" + no);

        if (rs.next()) {
            System.out.printf("번호: %d\n", rs.getInt("bno")); 
            System.out.printf("제목: %s\n", rs.getString("titl"));
            System.out.printf("내용: %s\n", rs.getString("cont"));
            System.out.printf("등록일: %s\n", rs.getDate("rdt"));
        } else {
            System.out.println("could not get the record from Server");
        }

        rs.close();
        stmt.close();
        con.close();


    }
}







