package bitcamp.java106.pms;

import bitcamp.java106.pms.domain.Team;
import bitcamp.java106.pms.domain.Member;
import java.util.Scanner;


public class App_1{

    public static void main(String[] args){
        
        //3.team/view 팀명 작성

        String str; // 명령입력 변수
        int i1 = 0;//Team array 관련 변수
        int count1 = 0;
        int j1 = 0;//Member array 관련 변수
        int count2 = 0;
        Team[] teams = new Team[2];//Team reference array
        Member[] mems = new Member[2];//Member refference array

        Scanner keyScan = new Scanner(System.in);
        for(;;){
            System.out.print("명령> ");
            str = keyScan.next();

                if(str.toLowerCase().equals("help")){
                    System.out.print("팀 등록 명령 : team/add\n");
                    System.out.print("팀 조회 명령 : team/list\n");
                    System.out.print("팀 상세조회 명령 : team/view 팀명\n");
                    System.out.print("회원 등록 명령 : member/add\n");
                    System.out.print("회원 조회 명령 : member/list\n");
                    System.out.print("회원 상세조회 명령 : member/view 아이디:\n");
                    System.out.print("종료 : quit");
                }

                if(str.toLowerCase().equals("team/add")){
                    if(i1 < teams.length){
                            ++count1;
                            teams[i1] = new Team();

                            System.out.print("팀명? ");
                            teams[i1].name = keyScan.next();
                
                            System.out.print("설명? ");
                            teams[i1].description = keyScan.next();
                            
                            System.out.print("최대인원? ");
                            teams[i1].maxQty = keyScan.nextInt();
                            
                            keyScan.nextLine();
                
                            System.out.print("시작일? ");
                            teams[i1].startDate = keyScan.nextLine();
                            
                            System.out.print("종료일? ");
                            teams[i1].endDate = keyScan.nextLine();
                            
                            i1++;
                        }
                        
                    else if(i1 == count1){
                        System.out.println("더이상 기입할 수 없습니다.");
                    }    
                }    
                if(str.toLowerCase().equals("team/list")){
                    for(i1 = 0; i1 < count1; i1++){
                        System.out.printf("%s, %d, %s ~ %s\n",
                        teams[i1].name, teams[i1].maxQty,
                        teams[i1].startDate, teams[i1].endDate);
                    }
                }
                if (str.toLowerCase().contains("team/view")){

                }
                    
                    /* method 01, 02 variable define
                    if(str.contains("team/view") == true){
                */    
                    /* method 02
                    str = str.replaceAll(" ","");
                    String token = str.replaceAll.substring(11);

                    System.out.print("token " + token + "이다");
                    */
                    
                    /* method 01
                    if(token == null || token.equals("")){
                        System.out.println("팀명을 입력해주세요");
                        continue;             
                    }
                    for(i1 = 0; i1 < teams.length; i1++){
                        if(teams[i1].name.equals(token)){
                            System.out.printf("팀명: %s\n 설명:%s\n 최대인원: %d\n 기간: %s ~ %s",
                            teams[i1].name, teams[i1].description, teams[i1].maxQty,
                        teams[i1].startDate, teams[i1].endDate);
                            break;
                        }
                    }
                }*/

                if(str.toLowerCase().equals("member/add")){
                    if(j1 < mems.length){
                        ++count2;
                        mems[j1] = new Member();

                        System.out.print("아이디? ");
                        mems[j1].id = keyScan.next();
            
                        System.out.print("이메일? ");
                        mems[j1].email = keyScan.next();

                        System.out.print("비밀번호? ");
                        mems[j1].password = keyScan.next();
                        
                        j1++;
                    }
                    
                else if(j1 == count2){
                    System.out.println("더이상 기입할 수 없습니다.");
                }
                }
                
                if(str.toLowerCase().equals("member/list")){
                    for(j1 = 0; j1 < count2; j1++){
                        System.out.printf("%s, %s, %s\n",
                        mems[j1].id, mems[j1].email,
                        mems[j1].password);
                    }
                }

                if(str.toLowerCase().equals("member/view 아이디")){

                }
                if(str.toLowerCase().equals("quit")){
                    break;
                }
        }   
    }       
}    

