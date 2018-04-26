//게시판 관리 - JDBC 코드를 별도의 클래스로 캡슐화 - DAO 적용
package step25.ex04;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class Exam01_Read_Retrieve_view {

    public static void main(String[] args) throws Exception {
        Scanner keyScan = new Scanner(System.in);
        System.out.print("조회할 게시물 번호 : ");
        String no = keyScan.nextLine();
        
        try {
            DataSource dataSource = new DefaultDataSource();
            BoardDao boardDao = new BoardDao(dataSource);
            Board board = boardDao.view(no);
            
            if (board == null) {
                System.out.println("could not get the record from Server");
            } else {
                System.out.printf("번호: %d\n", board.getNo()); 
                System.out.printf("제목: %s\n", board.getTitle());
                System.out.printf("내용: %s\n", board.getContent());
                System.out.printf("등록일: %s\n", board.getRegisteredDate());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

       

    }
}







