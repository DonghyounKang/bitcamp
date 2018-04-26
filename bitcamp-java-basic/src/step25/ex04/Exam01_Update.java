//게시판 관리 - JDBC 코드를 별도의 클래스로 캡슐화 - DAO 적용
package step25.ex04;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Exam01_Update {

    public static void main(String[] args) throws Exception {
        Scanner keyScan = new Scanner(System.in);
        
        Board board = new Board();
        
        System.out.print("변경할 게시물 번호 : ");
        board.setNo(Integer.parseInt(keyScan.nextLine()));
        
        System.out.print("제목? ");
        board.setTitle(keyScan.nextLine());
        
        System.out.print("내용? ");
        board.setContent(keyScan.nextLine());
        
        try {
            DataSource dataSource = new DefaultDataSource();
            BoardDao boardDao = new BoardDao(dataSource);
            int count = boardDao.update(board);
            System.out.printf("%d element(s) Insert Complete", count);
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        keyScan.close();
    }
}







