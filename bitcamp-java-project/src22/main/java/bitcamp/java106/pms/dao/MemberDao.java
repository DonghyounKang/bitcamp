package bitcamp.java106.pms.dao;


import bitcamp.java106.pms.domain.Member;

public class MemberDao extends AbstractDao<Member> {
    
    public int indexOf(Object key) {
        for(int i = 0; i < collection.size(); i++) {
            String memberId = (String) key;
            Member originMember = this.collection.get(i);
            if(originMember.getId().toLowerCase().equals(memberId.toLowerCase())) {
                return i;
            }
        }
        return -1;
    }


}

//ver 16 - 인스턴스 변수를 직접 사용하는 대신 겟터, 셋터 사용.
//ver 14 - MemberController로부터 데이터 관리 기능을 분리하여 MemberDao 생성.






