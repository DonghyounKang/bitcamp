package bitcamp.java106.pms.dao;

import java.util.LinkedList;

import bitcamp.java106.pms.domain.Team;

public class TeamDao {
    private LinkedList<Team> collection = new LinkedList();
    
    public void insert(Team team) {
        // 팀 정보가 담겨있는 객체의 주소를 배열에 보관한다.
        this.collection.add(team);
    }
    
    public Team[] list() {
        Team[] arr = new Team[this.collection.size()];
        for (int i = 0; i < this.collection.size(); i++) 
            arr[i] = this.collection.get(i);
        return arr;
    }
    
    public Team get(String name) {
        int index = this.getTeamIndex(name);
        if(index < 0)
                return null;
        return this.collection.get(index);
    }
    
    public void update(Team team) {
        int index = this.getTeamIndex(team.getName());
        if(index < 0)
                return;
        this.collection.set(index, team);
    }
    
    public void delete(String name) {
        int index = this.getTeamIndex(name);
        if(index < 0)
                return;
        this.collection.remove(index);
    }
    
    private int getTeamIndex(String name) {
        for(int i = 0; i < collection.size(); i++) {
            Team originTeam = this.collection.get(i);
            if(originTeam.getName().toLowerCase().equals(name.toLowerCase())) {
                return i;
            }
        }
        return -1;
    }
}

//ver 16 - 인스턴스 변수를 직접 사용하는 대신 겟터, 셋터 사용.
//ver 14 - TeamController로부터 데이터 관리 기능을 분리하여 TeamDao 생성.





