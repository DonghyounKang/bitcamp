//게시판 관리 - 삭제(delete) preparedStatement 적용
package step25.ex02_CRUDBoardByJDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Exam02_Delete {

    public static void main(String[] args) throws Exception {
        Scanner keyScan = new Scanner(System.in);
        System.out.print("삭제할 게시물 번호 : ");
        String no = keyScan.nextLine();
        Class.forName("com.mysql.cj.jdbc.Driver");
        
        Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/java106db?serverTimezone=UTC&useSSL=false",// serverTimeZone 설정(UTC)
                "java106","1111");
        
        PreparedStatement stmt = con.prepareStatement("delete from ex_board where bno=?");
        stmt.setString(1, no);
        
        int count = stmt.executeUpdate();
        System.out.printf("%d element(s) Delete Complete", count);

        con.close();
        keyScan.close();
    }
}







