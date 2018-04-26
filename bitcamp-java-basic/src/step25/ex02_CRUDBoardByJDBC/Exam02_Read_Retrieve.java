// 게시판 관리 - 목록(Read) preparedStatement 적용
package step25.ex02_CRUDBoardByJDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Exam02_Read_Retrieve {

    public static void main(String[] args) throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/java106db?serverTimezone=UTC&useSSL=false",// serverTimeZone 설정(UTC)
                "java106","1111");
        
        //당장 select할 때 파라미터값을 넣지 않는다 하더라도
        // 나중에 넣을 것을 대비하여 PreparedStatement 사용
        PreparedStatement stmt = con.prepareStatement(
                "select bno,titl,rdt from ex_board");

        ResultSet rs = stmt.executeQuery();

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







