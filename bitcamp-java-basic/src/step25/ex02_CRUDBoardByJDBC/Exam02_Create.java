// 게시판 관리 - 등록(insert/Create) preparedStatement 적용
package step25.ex02_CRUDBoardByJDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;


//
public class Exam02_Create {

    public static void main(String[] args) throws Exception {
        Scanner keyScan = new Scanner(System.in);
        System.out.print("제목 : ");
        String title = keyScan.nextLine();

        System.out.print("내용 : ");
        String content = keyScan.nextLine();

        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/java106db?serverTimezone=UTC&useSSL=false",// serverTimeZone 설정(UTC)
                "java106","1111");

        //값이 들어갈 자리 -> ?(in-parameter)를 지정
        // => 데이터 타입에 상관없이 ?를 넣는다.
        PreparedStatement stmt = con.prepareStatement(
                "insert into ex_board(titl,cont,rdt) values(?, ?,now())");
        //in-parameter의 값을 설정
        // => 설정순서는 상관없다.
        // => 유지 보수를 위해 순서대로 나열할 것
        stmt.setString(1, title);
        stmt.setString(2, content);

        // 실행시 SQL문을 파라미터로 넘길 필요가 없다(PreparedStatement
        int count = stmt.executeUpdate();

        System.out.printf("%d element(s) Insert Complete", count);

        stmt.close();
        con.close();
        keyScan.close();
    }
}







