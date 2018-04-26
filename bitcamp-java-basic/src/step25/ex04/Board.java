// DAO와 서비스 객체 사이에서 데이터를 실어나르는 용도로 사용
// => DTO (Data Transfer Object)
// => 도메인 객체(Domain)라고도 부른다.
package step25.ex04;

import java.io.Serializable;
import java.sql.Date;

//외부 저장소로 객체를 내보낼 수 있도로 serial function 활성화
public class Board implements Serializable {
    
    private static final long serialVersionUID = 1L;
    //DB table의 column값을 저장할 인스턴스 변수 준비
    // 주의!
    // => 보통 column이름은 DB관례에 따라 약자로 기술
    //    but 자바에서는 자바의 관례에 따라 변수명을 만든다.
    // => DBColumn명과 같게하지 말것
    int no;
    String title;
    String content;
    Date registeredDate;
    
    //개발하는 동안 객체 값 확인을 위해 toString() override
    @Override
    public String toString() {
        return "Board [no=" + no + ", title=" + title + ", content=" + content + ", registeredDate=" + registeredDate
                + "]";
    }
    
    //setter & getter
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
    public String getContent() {
        return content;
    }
    public void setContent(String conent) {
        this.content = conent;
    }
    public Date getRegisteredDate() {
        return registeredDate;
    }
    public void setRegisteredDate(Date registeredDate) {
        this.registeredDate = registeredDate;
    }
    
    
}
