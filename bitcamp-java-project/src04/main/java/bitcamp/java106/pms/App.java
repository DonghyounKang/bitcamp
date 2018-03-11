package bitcamp.java106.pms;

import bitcamp.java106.pms.domain.Team;
import bitcamp.java106.pms.domain.Member;
import java.util.Scanner;


public class App{

    public static void main(String[] args){

        int i = 0;
        int i2 = 0;
        int i3 = 0;//Team 관련 변수
        int j = 0;
        int l = 0;
        int n =0; //Member 관련 변수
        String str; //명령 기입 변수
        Team[] teams = new Team[3];//clss Team에 대한 배열 생성
        Member[] members = new Member[3];
        

        Scanner keyScan = new Scanner(System.in);
        
        System.out.print("명령> ");
        str = keyScan.next();
        
        for(;;){
            if(str.toLowerCase().equals("help")){
                System.out.println("팀 등록 명령 : team/add");
                System.out.println("팀 조회 명령 : team/list");
                System.out.println("팀 상세조회 명령 : team/view 팀명");
                System.out.println("회원 등록 명령 : member/add");
                System.out.println("회원 조회 명령 : member/list");
                System.out.println("회원 상세조회 명령 : member/view 아이디");
                System.out.println("종료 : quit");
                System.out.print("명령> ");
                str = keyScan.next();

            } else if(str.toLowerCase().equals("team/add")){
                if(i < teams.length){
                    teams[i] = new Team();

                    System.out.print("팀명? ");
                    teams[i].name = keyScan.next();
    
                    System.out.print("설명? ");
                    teams[i].description = keyScan.next();
    
                    System.out.print("최대인원 ? ");
                    teams[i].maxQty = keyScan.nextInt();

                    keyScan.nextLine();
    
                    System.out.print("시작일? ");
                    teams[i].startDate = keyScan.nextLine();
    
                    System.out.print("종료일? ");
                    teams[i].endDate = keyScan.nextLine();

                    ++i;
                } else{
                    System.out.println("더이상 기입할 수 없습니다.");
                    }
                    System.out.print("명령> ");
                    str = keyScan.next();
                   
            } else if(str.toLowerCase().equals("team/list")){
                for ( i2 = 0; i2 < teams.length; i2++){
                    System.out.printf("%3s, %3d명, %3s ~ %3s\n",
                        teams[i2].name,  teams[i2].maxQty, 
                        teams[i2].startDate, teams[i2].endDate);}
                System.out.print("명령> ");
                str = keyScan.next();

            } else if(str.toLowerCase().contains("team/view")){
                System.out.println(str);
                System.out.print("명령> ");
                str = keyScan.next();
                
            } else if(str.toLowerCase().equals("member/add")){
                if(j < members.length){
                    members[j] = new Member();

                    System.out.print("아이디? ");
                    members[j].id = keyScan.next();
    
                    System.out.print("이메일? ");
                    members[j].email = keyScan.next();
    
                    System.out.print("암호? ");
                    members[j].password = keyScan.next();

                    ++j;
                   
                } else{
                    System.out.println("더이상 기입할 수 없습니다.");
                }
                    System.out.print("명령> ");
                    str = keyScan.next();

            } else if(str.toLowerCase().equals("member/list")){
                for (l = 0; l < members.length; l++){
                    System.out.printf("%3s, %3s, %3s\n",
                            members[l].id, members[l].email, 
                            members[l].password);}
                System.out.print("명령> ");
                str = keyScan.next();

            } else if(str.toLowerCase().equals("member/view")){
                System.out.println("member/view");
                


                str = keyScan.next();

            } else if(str.toLowerCase().equals("quit")){
                break;
            }   
                else{System.out.print("다시 입력해주세요\n");
                System.out.print("명령> ");
                str = keyScan.next();
                }
        }    
    }
}