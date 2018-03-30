
package bitcamp.java106.pms.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

//1. Team 클래스 내의 연산자를 그대로 가져온다.
public class TeamMemberDao {

    //2. 내부적으로 사용할 변수 선언
    private HashMap<String, ArrayList<String>> collection= new HashMap<>();

    public int addMember(String teamName, String memberId) {
        String teamNameLC = teamName.toLowerCase();
        String memberIdLC = memberId.toLowerCase();

        //팀 이름으로 멤버아이디가 들어있는 ArrayList를 가져온다.
        ArrayList<String> members = collection.get(teamNameLC);
        if (members == null) { // 해당 팀의 멤버가 추가된 적이 없다면 (memberId가 있는지 없는지 확인하는 if)
            members = new ArrayList<>();
            collection.put(teamNameLC, members);  //입력(추가)
            return 1;
        }

        // ArrayList에 해당 아이디를 가진 멤버가 있다면,
        if(members.contains(memberIdLC)) {              
            return 0;
        }

        members.add(memberIdLC);
        return 1;
    }

    public int deleteMember(String teamName, String memberId) {
        String teamNameLC = teamName.toLowerCase();
        String memberIdLC = memberId.toLowerCase();

        ArrayList<String> members = collection.get(teamNameLC);
        if(members == null || !members.contains(memberIdLC))
            return 0;

        members.remove(memberIdLC);
        return 1;
    }

    public Iterator<String> getMembers(String teamName) {
        //nullpointerException error 대비
        ArrayList<String> members = collection.get(teamName.toLowerCase());
        //ArrayList로 리턴하는 경우 ArrayList내의 메서드로 controller에서 데이터를 변경할 가능성이 존재한다.
        //따라서 조회용인 iterator로 리턴한다. 
        if (members == null)
            return null;
        return members.iterator();
    }    
    
    public boolean isExist(String teamName, String memberId) {
        String teamNameLC = teamName.toLowerCase();
        String memberIdLC = memberId.toLowerCase();

        ArrayList<String> members = collection.get(teamNameLC);
        if(members == null || !members.contains(memberIdLC))
            return false;
        
        return true;
    }
}

//ver 19 - DAO 인터페이스 변경
//ver 18- ArrayList를 적용하여 객체(의 주소)목록을 관리한다.
//ver 17 - 클래스 추가

