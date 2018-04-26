// 게시판 관리 - 목록(Read)
package step25.ex02_CRUDBoardByJDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Exam01_Read_Retrieve {

    public static void main(String[] args) throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/java106db?serverTimezone=UTC&useSSL=false",// serverTimeZone 설정(UTC)
                "java106","1111");

        Statement stmt = con.createStatement();

        ResultSet rs = stmt.executeQuery("select bno,titl,rdt from ex_board");

        while (rs.next()) {
            System.out.printf("%d, %s, %s\n",
                    rs.getInt("bno"), 
                    rs.getString("titl"), 
                    rs.getDate("rdt")); 
        }

        rs.close();
        stmt.close();
        con.close();


    }
}







