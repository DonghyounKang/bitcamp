
package bitcamp.java106.pms.dao;

import bitcamp.java106.pms.domain.Member;
import bitcamp.java106.pms.domain.Team;

//1. Team 클래스 내의 연산자를 그대로 가져온다.
public class TeamMemberDao {
    
    //2. 내부적으로 사용할 변수 선언
    private Object[][] teamMembers = new Object[1000][2];
    private int rowIndex;
    
    private int getIndex(String teamName, String memberId) {
        String ptn = teamName.toLowerCase();
        String pmi = memberId.toLowerCase();
        for (int i = 0; i < this.rowIndex; i++) {
            if (this.teamMembers[i][0] == null) continue;
            
            String tn = ((String)this.teamMembers[i][0]).toLowerCase();
            String mi = ((String)this.teamMembers[i][1]).toLowerCase();
            if (tn.equals(ptn) && mi.equals(pmi)) {
                return i;
            }
        }
        return -1;
    }
    
    
    // 연산자는 외부에서 사용하는 것이기 때문에 공개해야 한다.
    // => 그래서 public modifier를 사용한다.
    public int addMember(String teamName, String memberId) {
        //3. 저장 전에 해당 Team에 해당 Member가 포함되어있는지 확인
        //대소문자 구분 없이 찾도록 설정
        if (this.isExist(teamName, memberId)) { 
            return 0;
        }
        this.teamMembers[rowIndex][0] = teamName;
        this.teamMembers[rowIndex][1] = memberId;
        rowIndex++; //가독성 
        return 1;
    }
    
    public int deleteMember(String teamName, String memberId) {
        int index = this.getIndex(teamName, memberId);
        if (index < 0) { //존재하지 않는 맴버라면
            return 0;
        }
        
        this.teamMembers[index][0] = null;
        this.teamMembers[index][1] = null;
        return 1;
    }
    
    public boolean isExist(String teamName, String memberId) {
        if(this.getIndex(teamName, memberId) < 0) {
            return false;
        } else {
            return true;
        }
    }
    
    private int getMemberCount(String teamName) {
        int cnt = 0; //로컬변수는 반드시 초기화시켜야 한다.
        String ptn = teamName.toLowerCase();
        
        for (int i = 0; i < this.rowIndex; i++) {
            if (this.teamMembers[i][0] == null)
                continue;

            String tn = ((String)this.teamMembers[i][0]).toLowerCase();
            if (tn.equals(ptn)) {
                cnt++;
            }
        }
        return cnt;
    }
    //Method signature
    public String[] getMembers(String teamName) {
        String ptn = teamName.toLowerCase();
        String[] members = new String[this.getMemberCount(teamName)];
        
        for (int i = 0, x = 0; i < this.rowIndex; i++) {
            if (this.teamMembers[i][0] == null)
                continue;

            String tn = ((String)this.teamMembers[i][0]).toLowerCase();
            if (tn.equals(ptn)) {
                members[x++] = ((String)this.teamMembers[i][1]);
            }
        }
        return members;
    }      
}
//용어정리
//Method Signature = 함수 프로토타입(function prototype)
//메서드의 이름과 파라미터 형식, 리턴 타입에 대한 정보를 말한다.

//ver 17 - 클래스 추가

