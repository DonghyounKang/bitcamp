package bitcamp.java106.pms.domain;

import java.io.Serializable;
import java.sql.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class PhotoBoard implements Serializable {
    private static final long serialVersionUID = 1L;
    
    private int no;
    private String title;
    private String content;
    @JsonFormat(pattern="yyyy-MM-dd", timezone="Asia/Seoul")
    private Date createdDate;
    
    @Override
    public String toString() {
        return "PhotoBoard [no=" + no + ", title=" + title + ", content="
                + content + ", createdDate=" + createdDate + "]";
    }
    public String getContent() {
        return content;
    }
    public void setContent(String content) {
        this.content = content;
    }
    public int getNo() {
        return no;
    }
    public void setNo(int no) {
        this.no = no;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public Date getCreatedDate() {
        return createdDate;
    }
    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }
    
}
