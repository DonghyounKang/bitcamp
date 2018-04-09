package bitcamp.java106.pms.controller;

import java.util.Scanner;

import bitcamp.java106.pms.domain.Board;
import bitcamp.java106.pms.util.Console;

public class BoardController {
    
    Scanner keyScan;
    
    Board[] boards = new Board[100];
    int boardIndex = 0;

    public BoardController(Scanner scanner) {
        this.keyScan = scanner;
    }
    
    public void service(String menu, String option) {
        if (menu.equals("team/add")) {
            this.onBoardAdd();
        } else if (menu.equals("team/list")) {
            this.onBoardList();
        } else if (menu.equals("team/view")) {
            this.onBoardView(option);
        } else if (menu.equals("team/update")) {
            this.onBoardUpdate(option);
        } else if (menu.equals("team/delete")) {
            this.onBoardDelete(option);
        } else {
            System.out.println("명령어가 올바르지 않습니다.");
        }
    }
    void onBoardAdd() {
        System.out.println("[ 게시물 등록 ]");
        Board board = new Board();
        
        System.out.print("제목? ");
        board.title = keyScan.nextLine();
        
        System.out.print("내용? ");
        board.content = keyScan.nextLine();
        
        System.out.print("등록일? ");
        board.createDate = keyScan.nextLine();
        
        boards[boardIndex++] = board;
    }

    void onBoardList() {
        System.out.println("[ 게시물 조회 ]");
        for (int i = 0; i < boardIndex; i++) {
            if (boards[i] == null) continue;
            System.out.printf("%s, %s, %s\n",
                    i, boards[i].title, boards[i].createDate);
        }

    }
    
    void onBoardView(String option) {
        System.out.println("[ 게시물 조회 ]");
        if (option == null) {
            System.out.println("번호를 입력하시기 바랍니다.");
            return;
        }
        
        int i = Integer.parseInt(option);
        if (i < 0 || i >= boardIndex) {
            System.out.println("유효하지 않은 게시물입니다.");
        } else {
            Board board = boards[i];
            System.out.printf("제목: %s\n", board.title);
            System.out.printf("설명: %s\n", board.content);
            System.out.printf("등록일: %s\n", board.createDate);
        }
    }

    void onBoardUpdate(String option) {
        System.out.println("[ 게시물 변경 ]");
        if (option == null) {
            System.out.println("번호를 입력하시기 바랍니다.");
            return;
        }
        
        int i = Integer.parseInt(option);
        
        if(i < 0 || i > boardIndex) {
            System.out.println("유효하지 않은 게시물 번호입니다.");
        } else {
            Board board = boards[i];
            Board updateBoard = new Board();
            System.out.printf("제목(%s)? ", board.title);
            updateBoard.title = keyScan.nextLine();
            System.out.printf("내용(%s)? ", board.content);
            updateBoard.content = keyScan.nextLine();
            updateBoard.createDate = board.createDate;
            boards[i] = updateBoard;
            System.out.println("변경완료");
        }
    }

    void onBoardDelete(String option) {
        System.out.println("[ 게시물 삭제 ]");
        if (option == null) {
            System.out.println("번호를 입력하시기 바랍니다.");
            return;
        }
        
        int i = Integer.parseInt(option);
        
        if(i < 0 || i >= boardIndex) {
            System.out.println("유효하지 않은 게시물입니다.");
        } else {
            if (Console.confirm("정말 삭제하시겠습니까?")) {
                boards[i] = null;
                System.out.println("삭제완료");
            }
        }
    }
}
