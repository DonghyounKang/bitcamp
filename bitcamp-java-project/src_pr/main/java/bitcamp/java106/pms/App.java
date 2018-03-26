package bitcamp.java106.pms;

import java.util.Scanner;

import bitcamp.java106.pms.domain.Member;
import bitcamp.java106.pms.domain.Team;

public class App {
    
    static Scanner keyScan = new Scanner(System.in);
    static Team[] teams = new Team[100];
    static int teamIndex = 0;
    static Member[] members = new Member[100];
    static int memberIndex = 0;
    static String option = null;
    
    static String[] prompt() {
        System.out.print("명령 > ");
        return keyScan.nextLine().toLowerCase().split(" ");
        
    }
    
    static void onQuit() {
        System.out.println("bye");
        
    }
    
    static void onHelp() {
        System.out.println("[ 도움말 ]");
        System.out.println("팀 등록 명령 : team/add");
        System.out.println("팀 조회 명령 : team/list");
        System.out.println("팀 상세조회 명령 : team/view 팀명");
        System.out.println("회원 등록 명령 : member/add");
        System.out.println("회원 조회 명령 : member/list");
        System.out.println("회원 상세조회 명령 : member/view 아이디");
        System.out.println("종료 : quit");
        
    }
    
    static void onTeamAdd() {
        System.out.println("[팀 정보 입력]");
        Team team = new Team();
        
        System.out.print("팀명? ");
        team.name = keyScan.nextLine();
        
        System.out.print("설명? ");
        team.description = keyScan.nextLine();
        
        System.out.print("최대인원? ");
        team.maxQty = keyScan.nextInt();
        
        keyScan.nextLine();
        
        System.out.print("시작일? ");
        team.startDate = keyScan.nextLine();
        
        System.out.print("종료일? ");
        team.endDate = keyScan.nextLine();
        
        teams[teamIndex++] = team;
        
    }
    
    static void onTeamList() {
        System.out.println("[ 팀목록 ]");
        for (int i = 0; i < teamIndex; i++) {
            System.out.printf("%s, %s, %d, %s ~ %s\n",teams[i].name,
                    teams[i].description, teams[i].maxQty,
                    teams[i].startDate, teams[i].endDate);
        }
        
    }
    
    static void onTeamView() {
        System.out.println("[ 팀 정보 조회 ]");
        if (option == null) {
            System.out.println("팀명을 입력해주시기 바랍니다.");
            System.out.println();
            return;
        }
        
        Team team = null;
        for (int i = 0; i < teamIndex; i++) {
            if(option.equals(teams[i].name.toLowerCase())) {
                team = teams[i];
                break;
            }
        }
        
        if (team == null) {
            System.out.println("해당 이름의 팀이 존재하지 않습니다.");
        } else {
            System.out.printf("팀명 : %s\n", team.name);
            System.out.printf("설명: %s\n", team.description);
            System.out.printf("최대인원: %d\n", team.maxQty);
            System.out.printf("기간: %s ~ %s\n", 
                    team.startDate, team.endDate);
        }
        
    }
    
    static void onMemberAdd() {
        
        System.out.println("[ 회원 등록 ]");
        Member member = new Member();
        
        System.out.print("아이디? ");
        member.id = keyScan.nextLine();
        
        System.out.print("이메일? ");
        member.email = keyScan.nextLine();
        
        System.out.print("암호? ");
        member.password = keyScan.nextLine();
        
        members[memberIndex++] = member;
        
    }
    
    static void onMemberList() {
        System.out.println("[ 회원 목록 ]");
        for (int i = 0; i < memberIndex; i++) {
            System.out.printf("%s, %s\n",members[i].id,
                    members[i].email);
        }
        
    }
    
    static void onMemberView() {
        System.out.println("[ 회원 정보 조회 ]");
        if (option == null) {
            System.out.println("회원명을 입력해주시기 바랍니다.");
            System.out.println();
            return;
        }
        
        Member member = null;
        for (int i = 0; i < memberIndex; i++) {
            if(option.equals(members[i].id.toLowerCase())) {
                member = members[i];
                break;
            }
        }  
        
        if (member == null) {
            System.out.println("해당 이름의 회원이 존재하지 않습니다.");
        } else {
            System.out.printf("아이디 : %s\n", member.id);
            System.out.printf("이메일 : %s\n", member.email);
        }
        
    }
    
    public static void main(String[] args) {
        
        while(true) {
            String[] arr = prompt();
            
            String menu = arr[0];
            if (arr.length == 2) {
                option = arr[1];
            }
            
            if (menu.equals("help")) {
                onHelp();
                
            } else if (menu.equals("quit")) {
                onQuit();
                break;
                
            } else if (menu.equals("team/add")) {
                onTeamAdd();
                
            } else if (menu.equals("team/list")) {
                onTeamList();
                
            } else if ( menu.equals("team/view")) {
                onTeamView();
                
            } else if (menu.equals("member/add")) {
                onMemberAdd();
                
            } else if (menu.equals("member/list")) {
                onMemberList();
                
            } else if (menu.equals("member/view")) {
                onMemberView();
                
            } else {
                System.out.println("명령어가 올바르지 않습니다.");
            }
            
            System.out.println();
        }
        
        /*
        
        int count = 0;
        
        for(int i = 0; i < teams.length; i++) {
            count++;
            
            teams[i] = new Team();
            
            System.out.print("팀영? ");
            teams[i].name = keyScan.nextLine();
            
            System.out.print("설명? ");
            teams[i].description = keyScan.nextLine();
            
            System.out.print("최대인원? ");
            teams[i].maxQty = keyScan.nextInt();
            
            keyScan.nextLine();
            
            System.out.print("시작일? ");
            teams[i].startDate = keyScan.nextLine();
            
            System.out.print("종료일? ");
            teams[i].endDate = keyScan.nextLine();
            
            if(count == teams.length) {
                break;
            }
            
            System.out.print("계속 진행?");
            String ans = keyScan.nextLine();
            if(ans.toLowerCase().equals("n")) {
                break;
            }
            
        }  
        
            System.out.println("-------------------");
        for (int i = 0; i < count; i++) {
            System.out.printf("%s, %d명, %s ~ %s\n",
                    teams[i].name, teams[i].maxQty,
                    teams[i].startDate, teams[i].endDate);
                    
        } */
    }   
}
