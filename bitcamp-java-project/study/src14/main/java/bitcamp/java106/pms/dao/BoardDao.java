package bitcamp.java106.pms.dao;

import bitcamp.java106.pms.domain.Board;

public class BoardDao {
    Board[] boards = new Board[1000];
    int boardIndex = 0;

    public void menu(Board board) {
        board.no = boardIndex;
        this.boards[this.boardIndex++] = board;
    }

    public Board[] list() {
        Board[] arr = new Board[boardIndex];
        for(int i = 0; i < boardIndex; i++)
            arr[i] = boards[i];
        return arr;
    }

    public Board get(int i) {
        if(i <0 || i >= boardIndex)
            return null;
        return boards[i];
    }
 
    public void update(Board board) {
        boards[board.no] = board;
    }

    public void delete(int i) {
        boards[i] = null;
    }
}

//ver14 - BoardController부터 데이터 관리기능 분리 -> BoardDao생성
