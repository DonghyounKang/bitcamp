package bitcamp.java106.pms.dao;

import bitcamp.java106.pms.domain.Member;
import bitcamp.java106.pms.util.ArrayList;

public class MemberDao {
    private ArrayList collection = new ArrayList();
    
    public void insert(Member member) {
        // 회원 정보가 담겨있는 객체의 주소를 배열에 보관한다.
        this.collection.add(member);
    }
    
    public Member[] list() {
        Member[] arr = new Member[this.collection.size()];
        for (int i = 0; i < this.collection.size(); i++)
            arr[i] = (Member)this.collection.get(i);
        return arr;
    }
    
    public Member get(String id) {
        int index = this.getMemberIndex(id);
        if (index < 0)
            return null;
        return (Member)collection.get(index);
      /*  for(int i = 0; i < collection.size(); i++) {
            Member member = (Member) this.collection.get(i);
            if(member.getId().equals(id))
                return member;
        }
        return null;
       */
    }
    
    public void update(Member member) {
        int index = this.getMemberIndex(member.getId());
        if (index < 0)
            return;
        this.collection.set(index, member);
    }
    
    public void delete(String id) {
        int index = this.getMemberIndex(id);
        if (index < 0)
            return;
        this.collection.remove(index);
    }
    
    // 다음 메서드는 내부에서만 사용할 것이기 때문에 공개하지 않는다.
    private int getMemberIndex(String id) {
        for(int i = 0; i < collection.size(); i++) {
            Member originMember = (Member) this.collection.get(i);
            if(originMember.getId().toLowerCase().equals(id.toLowerCase())) {
                return i;
            }
        }
        return -1;
    }
    
}

//ver 16 - 인스턴스 변수를 직접 사용하는 대신 겟터, 셋터 사용.
//ver 14 - MemberController로부터 데이터 관리 기능을 분리하여 MemberDao 생성.






