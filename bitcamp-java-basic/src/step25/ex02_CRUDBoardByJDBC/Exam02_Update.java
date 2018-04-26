// 게시판 관리 - 수정(Update) preparedStatement 적용
package step25.ex02_CRUDBoardByJDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Exam02_Update {

    public static void main(String[] args) throws Exception {
        Scanner keyScan = new Scanner(System.in);
        System.out.print("변경할 게시물 번호 : ");
        String no = keyScan.nextLine();
        System.out.print("제목? ");
        String title= keyScan.nextLine();
        System.out.print("내용? ");
        String content= keyScan.nextLine();
        Class.forName("com.mysql.cj.jdbc.Driver");
        
        Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/java106db?serverTimezone=UTC&useSSL=false",// serverTimeZone 설정(UTC)
                "java106","1111");
        
        PreparedStatement stmt = con.prepareStatement(
                "update ex_board set titl=?, cont=?, rdt=now() where bno=?");
        stmt.setString(1, title);
        stmt.setString(2, content);
        stmt.setString(3, no);
        
        int count = stmt.executeUpdate();
        System.out.printf("%d element(s) Insert Complete", count);
        
        stmt.close();
        con.close();
    }
}







