package bitcamp.java106.pms.dao;

import bitcamp.java106.pms.annotation.Component;
import bitcamp.java106.pms.domain.Team;

@Component
public class TeamDao extends AbstractDao<Team>{
    
    public int indexOf(Object key) {
        String id = (String) key;
        for(int i = 0; i < collection.size(); i++) {
            Team originTeam = this.collection.get(i);
            if(originTeam.getName().toLowerCase().equals(id.toLowerCase())) {
                return i;
            }
        }
        return -1;
    }
}

//ver 16 - 인스턴스 변수를 직접 사용하는 대신 겟터, 셋터 사용.
//ver 14 - TeamController로부터 데이터 관리 기능을 분리하여 TeamDao 생성.





