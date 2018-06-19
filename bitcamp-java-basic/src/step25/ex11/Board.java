// DAO와 서비스 객체 사이에서 데이터를 실어나르는 용도로 사용한다.
// => DTO(Data Transfer Object)라 부른다.
// => "도메인 객체(domain)"라고도 부른다.
package step25.ex11;

import java.io.Serializable;
import java.util.Date;

// 외부 저장소로 객체를 내보낼 수 있도록 serial 기능을 활성화 시킨다.
public class Board implements Serializable {
    private static final long serialVersionUID = 1L;
    
    // DB 테이블의 컬럼 값을 저장할 인스턴스 변수를 준비한다.
    // => 보통 컬럼 이름은 DB 관례에 따라 약자로 기술한다.
    // => 그러나 자바에서는 자바의 관례에따라 변수명을 만들라!
    //    DB 컬럼명과 같게하지 말라!
    int no;
    String title;
    String content;
    Date registeredDate;
    
    
    // 개발하는 동안 객체의 값을 확인할 수 있도록 toString()을 오버라이딩 한다.
    @Override
    public String toString() {
        return "Board [no=" + no + ", title=" + title + ", content=" + content + ", registeredDate=" + registeredDate
                + "]";
    }
    
    
    // 셋터와 겟터 생성
    public int getNo() {
        return no;
    }
    public Board setNo(int no) {
        this.no = no;
        return this;
    }
    public String getTitle() {
        return title;
    }
    public Board setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getContent() {
        return content;
    }
    public Board setContent(String content) {
        this.content = content;
        return this;
    }
    public Date getRegisteredDate() {
        return registeredDate;
    }
    public Board setRegisteredDate(Date registeredDate) {
        this.registeredDate = registeredDate;
        return this;
    }
    
    
    
}