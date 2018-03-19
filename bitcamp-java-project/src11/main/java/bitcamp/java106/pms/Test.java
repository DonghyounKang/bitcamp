package bitcamp.java106.pms;

import java.util.Scanner;
import bitcamp.java106.pms.domain.Team;
import bitcamp.java106.pms.domain.Member;

public class Test{
    
    
    static Scanner keyScan = new Scanner(System.in);
    static Team[] teams = new Team[500];
    static int teamIndex = 0;
    static Member[] members = new Member[1000];
    static int memberIndex = 0;
    static String option = null;
    
    static String[] prompt(){
        System.out.print("명령> ");
        return keyScan.nextLine().toLowerCase().split(" ");
        
    }

    static void onQuit() {
        System.out.println("bye");
    }

    static void onHelp(){
        System.out.println("[ 도움말 ]");
        System.out.println("- 팀 등록 명령 : team/add");
        System.out.println("- 팀 조회 명령 : team/list");
        System.out.println("- 팀 상세조회 명령 : team/view 팀명");
        System.out.println("- 팀 정보 수정 명령 : team/update 팀명");
        System.out.println("- 팀 삭제 명령 : team/delete 팀명");                
        System.out.println("- 회원 등록 명령 : member/add");
        System.out.println("- 회원 조회 명령 : member/list");
        System.out.println("- 회원 상세조회 명령 : member/view 아이디");
        System.out.println("- 종료 : quit");
    }

    static void onTeamAdd(){
        Team team = new Team();
        System.out.println("[ 팀 등록 ]");
        
        System.out.print("팀명? ");
        team.name = keyScan.next();

        System.out.print("설명? ");
        team.description = keyScan.next();
        
        System.out.print("최대인원? ");
        team.maxQty = keyScan.nextInt();
        
        keyScan.nextLine();

        System.out.print("시작일? ");
        team.startDate = keyScan.nextLine();
        
        System.out.print("종료일? ");
        team.endDate = keyScan.nextLine();
        
        teams[teamIndex++] = team;
    }

    static void onTeamList(){
        System.out.println("[ 팀 목록 조회 ]");
        for(int i = 0; i < teamIndex; i++) {
            if (teams[i] == null) continue;
            System.out.printf("%s, %d, %s ~ %s\n", teams[i].name, 
            teams[i].maxQty, teams[i].startDate, teams[i].endDate);
        }

    }

    static void onTeamView(){
        if (option == null) {
            System.out.println("팀명 입력바람");
            System.out.println();
            return;
        }

        Team team = null;
        for (int i = 0; i < teamIndex; i++){
            if (teams[i] == null) continue;
            if (option.equals(teams[i].name.toLowerCase())) {
                team = teams[i];
                break;
            }
        }
        
        if(team == null) {
            System.out.println("일치하는 팀이 없음");
        } else {
            System.out.printf("팀명: %s\n", team.name);
            System.out.printf("설명: %s\n", team.description);
            System.out.printf("최대인원: %d\n", team.maxQty);
            System.out.printf("기간: %s ~ %s\n", team.startDate,team.endDate);
        }
    }

    static void onTeamUpdate(){
        System.out.println("[ 팀 정보 수정 ]");

        if (option == null) {
            System.out.println("팀명 입력바람");
            System.out.println();
            return;
        }

        Team team = null;
        int i;
        for (i = 0; i < teamIndex; i++){
            if (teams[i] == null) continue;
            if (option.equals(teams[i].name.toLowerCase())){
                team = teams[i];
                break;
            }
        }
            
        if(team == null){
            System.out.println("일치하는 팀이 없음");
        } else {
            Team updateTeam = new Team();
            System.out.printf("팀명(%s): ",team.name);
            updateTeam.name = keyScan.next();

            System.out.printf("설명(%s): ",team.description);
            updateTeam.description = keyScan.next();

            System.out.printf("최대인원(%d): ",team.maxQty);
            updateTeam.maxQty = keyScan.nextInt();

            keyScan.nextLine();
            
            System.out.printf("시작일(%s): ",team.startDate);
            updateTeam.startDate = keyScan.nextLine();

            System.out.printf("종료일(%s): ",team.endDate);
            updateTeam.endDate = keyScan.nextLine();
            
            teams[i] = updateTeam;

            System.out.println("수정 완료!");
        }
    }

    static void onTeamDelete(){
        System.out.println("[ 팀 정보 삭제 ]");

        if (option == null) {
            System.out.println("팀명 입력바람");
            System.out.println();
            return;
        }

        Team team = null;
        int i;
        for (i = 0; i < teamIndex; i++){
            if (teams[i] == null) continue;
            if (option.equals(teams[i].name.toLowerCase())){
                team = teams[i];
                break;
            }
        }
            
        if(team == null){
            System.out.println("일치하는 팀이 없음");
        } else {
            System.out.print("정말 삭제하시겠습니까?(y/N) ");
            String input = keyScan.nextLine();
            if(input.equals("y")){
                teams[i] = null;
                System.out.println("삭제 완료");
            }
        }

    }

    static void onMemberAdd(){
        Member member = new Member();

        System.out.println("[ 회원 등록 ]");
        
        System.out.print("아이디? ");
        member.id = keyScan.nextLine();

        System.out.print("이메일? ");
        member.email = keyScan.nextLine();

        System.out.print("비밀번호? ");
        member.password = keyScan.nextLine();
        
        members[memberIndex++] = member;
    }

    static void onMemberList(){
        System.out.println("[ 회원 목록 조회 ]");
        for(int i = 0; i < memberIndex; i++) {
            if (members[i] == null) continue;
            System.out.printf("%s, %s, %s\n", members[i].id, 
            members[i].email, members[i].password);
        }
    }

    static void onMemberView(){
        if (option == null){
            System.out.println("회원명 입력바람");
            System.out.println();
            return;
        }

        Member member = null;
        for(int i = 0; i < memberIndex; i++){
            if (members[i] == null) continue;
            if(option.equals(members[i].id.toLowerCase())){
                member = members[i];
                break;
            }
        }

        if(member == null){
            System.out.println("일치하는 회원명이 없음");
        } else {
            System.out.printf("아이디: %s\n", member.id);
            System.out.printf("이메일: %s\n", member.email);
        }
    }

    static void onMemberUpdate(){
        System.out.println("[ 회원 정보 수정 ]");

        if (option == null) {
            System.out.println("회원명 입력바람");
            System.out.println();
            return;
        }

        Member member = null;
        int i;
        for (i = 0; i < memberIndex; i++){
            if (members[i] == null) continue;
            if (option.equals(members[i].id.toLowerCase())){
                member = members[i];
                break;
            }
        }
         
        if(member == null){
            System.out.println("일치하는 회원이 없음");
        } else {
            Member updateMember = new Member();
            System.out.printf("아이디(%s): ", member.id);
            updateMember.id = keyScan.next();

            System.out.printf("이메일(%s): ", member.email);
            updateMember.email = keyScan.next();
            
            updateMember.password = member.password;

            members[i] = updateMember;

            System.out.println("수정 완료!");
        }
    }

    static void onMemberDelete(){
        System.out.println("[ 회원 정보 삭제 ]");

        if (option == null) {
            System.out.println("회원명 입력바람");
            System.out.println();
            return;
        }

        Member member = null;
        int i;
        for (i = 0; i < memberIndex; i++){
            if (members[i] == null) continue;
            if (option.equals(members[i].id.toLowerCase())){
                member = members[i];
                break;
            }
        }
         
        if(member == null){
            System.out.println("일치하는 회원이 없음");
        } else {
            System.out.println("정말 삭제하시겠습니까?(y/N)");
            String input = keyScan.nextLine();
            if(input.equals("y")){
                members[i] = null;
                System.out.println("삭제 완료");
            }
        }
    }

    public static void main(String[] args){

        while(true){
            String[] arr = prompt();
            String order = arr[0];
            
            if(arr.length == 2) {
                option = arr[1];
            }

            if (order.equals("quit")) {
                onQuit();
                break;

            } else if(order.equals("help")){
                onHelp();

            } else if (order.equals("team/add")) {
                onTeamAdd();

            } else if (order.equals("team/list")) {
                onTeamList();

            } else if (order.equals("team/view")){
                onTeamView();

            } else if (order.equals("team/update")){
                onTeamUpdate();

            } else if(order.equals("team/delete")){
                onTeamDelete();

            } else if (order.equals("member/add")) {
                onMemberAdd();
            
            } else if (order.equals("member/list")){
                onMemberList();
                
            } else if (order.equals("member/view")){
                onMemberView();

            } else if (order.equals("member/update")){
                onMemberUpdate();

            } else if (order.equals("member/delete")){
                onMemberDelete();
                
            } else {
                System.out.println("명령어가 일치하지 않습니다.");
            }
            System.out.println();
        }
    
    }     
}