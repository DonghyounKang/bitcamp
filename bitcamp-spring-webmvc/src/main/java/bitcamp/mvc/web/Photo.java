package bitcamp.java106.pms.domain;

import java.io.Serializable;

public class Photo implements Serializable {
 
    private static final long serialVersionUID = 1L;
    
    private int no;
    private String mainThum;
    private String viewThum;
    private int boardNo;

    @Override
    public String toString() {
        return "Photo [no=" + no + ", smainThum=" + mainThum + ", viewThum=" + viewThum
                + ", boardNo=" + boardNo + "]";
    }
    
    public int getNo() {
        return no;
    }
    public void setNo(int no) {
        this.no = no;
    }
    public String getMainThum() {
        return mainThum;
    }
    public void setMainThum(String mainThum) {
        this.mainThum = mainThum;
    }
    public String getViewThum() {
        return viewThum;
    }
    public void setViewThum(String viewThum) {
        this.viewThum = viewThum;
    }
    public int getboardNo() {
        return boardNo;
    }
    public void setboardNo(int boardNo) {
        this.boardNo = boardNo;
    }
}