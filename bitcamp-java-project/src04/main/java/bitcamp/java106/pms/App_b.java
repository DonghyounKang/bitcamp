package bitcamp.java106.pms;

import bitcamp.java106.pms.domain.Member;
import bitcamp.java106.pms.domain.Team;
public class App_b{
    public static void main(String[] args) {
        java.util.Scanner keyScan = new java.util.Scanner(System.in);
        int i1 = 0;
        int i2 = 0;
        int count1 = 0;
        int count2 = 0;
        String str1;
        Team[] teams = new Team[100];
        Member[] mems = new Member[100];
        for(;;){
            System.out.print("명령: ");
            str1 = keyScan.nextLine();
            if(str1.toLowerCase().equals("help")){
                System.out.print("팀 등록 명령 : team/add\n");
                System.out.print("팀 조회 명령 : team/list\n");
                System.out.print("팀 상세조회 명령 :team/view 팀명\n");
                System.out.print("회원 등록 명령 : member/add\n");
                System.out.print("회원 조회 명령 : member/list\n");
                System.out.print("회원 상세조회 명령 : member/view 아이디\n");
                System.out.print("종료 : quit\n");
                        
            }if(str1.toLowerCase().equals("team/add")){
                                  
                    teams[count1] = new Team();
                    System.out.print("팀명? ");
                    teams[count1].name = keyScan.nextLine();
                    System.out.print("설명? ");
                    teams[count1].description = keyScan.nextLine();
                    System.out.print("최대인원? ");
                    teams[count1].maxQty = keyScan.nextInt();
                    keyScan.nextLine(); 
                    System.out.print("시작일? ");
                    teams[count1].startDate = keyScan.nextLine();
                    System.out.print("종료일? ");
                    teams[count1].endDate = keyScan.nextLine();
                    System.out.println();

                    count1++;
            }if (str1.toLowerCase().equals("team/list")){
                for (i1 = 0; i1 < count1; i1++){
                    
                    System.out.printf("%s, %s, %d, %s ~ %s\n",
                    teams[i1].name, teams[i1].description,
                    teams[i1].maxQty, teams[i1].startDate,
                    teams[i1].endDate);
                    System.out.println();
                }
            }if (str1.toLowerCase().contains("team/view")){
                if(str1.equals("team/view")){
                    System.out.println("팀명을 입력하시기 바랍니다.");
                    System.out.println();
                    continue;
                }
                for(i1 = 0; i1 < count1; i1++){
                    if(str1.contains( teams[i2].name)){
                        System.out.println("팀명: " + teams[i1].name );
                        System.out.println("설명: " + teams[i1].description );
                        System.out.println("최대인원: " + teams[i1].maxQty );
                        System.out.printf("기간: %s ~ %s\n",
                        teams[i1].startDate, teams[i1].endDate);
                        System.out.println();
                        break;
                    }
                }
                if(i1 == count1){
                    System.out.println("해당 이름의 없습니다.");
                    System.out.println();
                }
            }
            if (str1.toLowerCase().equals("member/add")){
            
                mems[count2] = new Member();
                System.out.print("아이디? ");
                mems[count2].id = keyScan.nextLine();
                System.out.print("이메일? ");
                mems[count2].email = keyScan.nextLine();
                System.out.print("암호? ");
                mems[count2].password = keyScan.nextLine();
                System.out.println();
            
                count2++;
            }
            if (str1.toLowerCase().equals("member/list")){
                for (i2 = 0; i2 < count2; i2++){
                
                System.out.printf("%s, %s, %s\n",
                            mems[i2].id, mems[i2].email, mems[i2].password);
                System.out.println();
                            }
                }if (str1.toLowerCase().contains("member/view")){
                            
                if(str1.equals("member/view")){
                System.out.println("아이디를 입력하시기 바랍니다.");
                continue;
            }
            for(i2 = 0; i2 < count2; i2++){
                if(str1.contains( mems[i2].id)){
                System.out.println("아이디: " + mems[i2].id );
                System.out.println("설명: " + mems[i2].email );
                System.out.println("암호: " + mems[i2].password );
                break;
            }
                }if(i2 == count2){
                System.out.println("해당 아이디의 회원이 없습니다.");
                System.out.println();
            }
            }
            if(str1.toLowerCase().equals("quit")){
                System.out.println("안녕히가세요!");
                System.out.println();
                break;
            }
        }
 
    }
}

