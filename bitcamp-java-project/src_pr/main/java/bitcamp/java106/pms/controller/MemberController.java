package bitcamp.java106.pms.controller;

import java.util.Scanner;

import bitcamp.java106.pms.domain.Member;
import bitcamp.java106.pms.util.Console;

public class MemberController {
    
    Scanner keyScan;
    
    Member[] members = new Member[100];
    int memberIndex = 0;
    
    public MemberController(Scanner scanner) {
        this.keyScan = scanner;
    }
    
    public void service(String menu, String option) {
        if (menu.equals("member/add")) {
            this.onMemberAdd();
        } else if (menu.equals("member/list")) {
            this.onMemberList();
        } else if (menu.equals("member/view")) {
            this.onMemberView(option);
        } else if (menu.equals("member/update")) {
            this.onMemberUpdate(option);
        } else if (menu.equals("member/delete")) {
            this.onMemberDelete(option);
        } else {
            System.out.println("명령어가 올바르지 않습니다.");
        }
    }
   
    int getMemberIndex(String id) {
        for(int i = 0; i < memberIndex; i++) {
            if (members[i] == null) continue;
            if (id.equals(members[i].id.toLowerCase())) {
                return i;
            }
        }   
        return -1;
    }
 

    void onMemberAdd() {
        System.out.println("[ 회원 정보 입력 ]");
        Member member = new Member();

        System.out.print("아이디? ");
        member.id = keyScan.nextLine();

        System.out.print("이메일? ");
        member.email = keyScan.nextLine();

        System.out.print("암호? ");
        member.password = keyScan.nextLine();

        members[memberIndex++] = member;

    }
    
    void onMemberList() {
        System.out.println("[ 회원 목록 조회 ]");
        for (int i = 0; i < memberIndex; i++) {
            System.out.printf("%s, %d명, %s ~ %s\n",
                    members[i].id, members[i].email, members[i].password);
        }
    }
    
    void onMemberView(String id) {
        System.out.println("[ 회원 상세 정보 조회]");
        if (id == null) {
            System.out.println("회원명을 입력하시기 바랍니다.");
            System.out.println();
            return;
        }

        int i = getMemberIndex(id);

        if (i == -1) {
            System.out.println("해당 이름의 회원이 없습니다.");
        } else {
            Member member = members[i];
            System.out.printf(" 아이디: %s\n", member.id);
            System.out.printf(" 이메일: %s\n", member.email);
        }                
    }
    
    void onMemberUpdate(String id) {
        System.out.println("[ 회원 정보 수정 ]");
        if (id == null) {
            System.out.println("회원명을 입력하시기 바랍니다.");
            return;
        }

        int i = getMemberIndex(id);

        if (i == -1) {
            System.out.println("해당 이름의 회원이 없습니다.");
        } else {
            Member member = members[i];
            Member updateMember = new Member();
            
            System.out.printf("아이디(%s)? ", member.id);
            updateMember.id = member.id;
            
            System.out.printf("이메일(%s)", member.email);
            updateMember.email = keyScan.nextLine();
            
            System.out.printf("비밀번호(%s)?", member.password);
            updateMember.password = keyScan.nextLine();
            
            members[i] = updateMember;
            System.out.println("변경완료!");
        }
    }
    
    void onMemberDelete(String id) {
        System.out.println("[ 회원 정보 삭제 ]");
        if (id == null) {
            System.out.println("회원명을 입력하시기 바랍니다.");
            System.out.println();
            return;
        }
        
        int i = getMemberIndex(id);
        
        if (i == -1) {
            System.out.println("해당 이름의 회원이 없습니다.");
        } else {
            if(Console.confirm("정말 삭제하시겠습니까?")) {
                members[i] = null;
                System.out.println("삭제 완료");
            }
        }
    }


    
}
