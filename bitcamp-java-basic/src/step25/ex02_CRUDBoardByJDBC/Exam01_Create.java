// 게시판 관리 - 등록(insert/Create)
package step25.ex02_CRUDBoardByJDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;


//
public class Exam01_Create {

    public static void main(String[] args) throws Exception {
        Scanner keyScan = new Scanner(System.in);
        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/java106db?serverTimezone=UTC&useSSL=false",// serverTimeZone 설정(UTC)
                "java106","1111");

        Statement stmt = con.createStatement();

        System.out.print("제목 : ");
        String title = keyScan.nextLine();

        System.out.print("내용 : ");
        String content = keyScan.nextLine();

        String sql = String.format(
                "insert into ex_board(titl,cont,rdt) values('%s','%s',now())", title, content);

        int count = stmt.executeUpdate(sql);

        System.out.printf("%d element(s) Insert Complete", count);

        stmt.close();
        con.close();
        keyScan.close();
    }
}







