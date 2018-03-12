package bitcamp.java106.pms;

import java.util.Scanner;
import bitcamp.java106.pms.domain.Team;
import bitcamp.java106.pms.domain.Member;

public class App_pr{
    public static void main(String[] args){
       
        Scanner keyScan = new Scanner(System.in);
        Team[] teams = new Team[1000];
        int teamIndex = 0;
        Member[] members = new Member[100];
        int memberIndex = 0;

        while(true){
            System.out.print("명령> ");
            String[] arr = keyScan.nextLine().toLowerCase().split(" ");
            String order = arr[0];
            String option = null;
            if(arr.length == 2){
                option = arr[1];
            }           


            if(order.equals("quit")){
                System.out.println("bye!");
                break;
            } else if(order.equals("help")){
                System.out.println("[도움말]");
                System.out.println("팀 등록 명령 : team/add");
                System.out.println("팀 조회 명령 : team/list");
                System.out.println("팀 상세조회 명령 : team/view 팀명");
                System.out.println("회원 등록 명령 : member/add");
                System.out.println("회원 조회 명령 : member/list");
                System.out.println("회원 상세조회 명령 : member/view 아이디");
                System.out.println("종료 : quit");
            } else if (order.equals("team/add")){
                System.out.println("[팀 정보 입력]");

                Team team = new Team();

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
            } else if(order.equals("team/list")){
                System.out.println("[팀 목록]");
                for(int i = 0; i < teamIndex; i++){
                    System.out.printf("%s, %d, %s ~ %s\n", 
                        teams[i].name, teams[i].maxQty, 
                        teams[i].startDate, teams[i].endDate);
                } 
            } else if(order.equals("team/view")){
                System.out.println("[팀 정보 조회]");
                if (option == null){
                    System.out.println("팀명 입력 요망");
                    System.out.println();
                    continue;
                }
                Team team = null;
                for (int i = 0; i < teamIndex; i++){
                    if (option.equals(teams[i].name.toLowerCase())){
                        team = teams[i];
                        break;
                    }
                }
                if(team == null){
                    System.out.println("해당 팀 없음");
                } else{
                    System.out.printf("팀명: %s\n", team.name);
                    System.out.printf("설명: %s\n", team.description);
                    System.out.printf("최대인원: %d\n", team.maxQty);
                    System.out.printf("기간: %s ~ %s\n", 
                        team.startDate, team.endDate);
                }
            } else if(order.equals("member/add")){
                System.out.println("[회원 정보 입력]");
                Member member = new Member();
                
                System.out.print("아이디? ");
                member.id = keyScan.nextLine();

                System.out.print("이메일? ");
                member.email = keyScan.nextLine();

                System.out.print("암호? ");
                member.password = keyScan.nextLine();

                members[memberIndex++] = member;

            } else if (order.equals("member/list")){
                System.out.println("[회원목록]");
                for (int i = 0; i < memberIndex; i++){
                    System.out.printf("%s, %s, %s\n", 
                    members[i].id, members[i].email, members[i].password);
                }

            } else if(order.equals("member/view")){
                System.out.println("[회원 정보 조회]");
                if(option == null){
                    System.out.println("팀명 입력 요망");
                    System.out.println();
                    continue;
                }
                Member member = null;
                for (int i = 0; i < memberIndex; i++){
                    if (option.equals(members[i].id.toLowerCase())){
                        member = members[i];
                        break;
                    }
                }
                if(member == null){
                    System.out.println("해당 아이디의 회원이 없음");
                } else{
                    System.out.printf("아이디: %s\n", member.id);
                    System.out.printf("이메일: %s\n", member.email);
                    System.out.printf("암호: %s\n", member.password);
                }
            } else{
                System.out.println("잘못된 명령어");
            }

            System.out.println();
        }
    }   
}
