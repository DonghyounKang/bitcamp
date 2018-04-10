//예외 처리 전
package step21_Exceptions.ex05;

import java.sql.Date;
import java.util.Scanner;

public class Exam01 {

    static Board read() {
        Board board = new Board();
    
        try(Scanner keyScan = new Scanner(System.in)){
            System.out.print("번호 > ");
            board.setNo(Integer.parseInt(keyScan.nextLine()));
            
            System.out.print("제목 > ");
            board.setTitle(keyScan.nextLine());

            System.out.print("내용 > ");
            board.setContent(keyScan.nextLine());
            
            System.out.print("등록일 > ");
            board.setCreatedDate(Date.valueOf(keyScan.nextLine()));
            
            return board;
        }
    }
    //NumberFormatException오류 : RuntimeException계열 오류 이므로 
    //IllegalArgumentException오류 :
    // 선언하지 않아도 예외를 던진다.
    
 
    public static void main(String[] args) {
        Board board = read();
        System.out.println("=----------------=");
        System.out.printf("번호: %d\n", board.getNo());
        System.out.printf("제목: %s\n", board.getTitle());
        System.out.printf("내용: %s\n", board.getContent());
        System.out.printf("등록일: %s\n", board.getCreatedDate());
    }
}
