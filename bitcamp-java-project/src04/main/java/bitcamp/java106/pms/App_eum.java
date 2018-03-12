package bitcamp.java106.pms;

import bitcamp.java106.pms.domain.Team;
import bitcamp.java106.pms.domain.Member;
import java.util.Scanner;

//ver1.2 : 명령어를 잘못입력했을 때 안내메세지 출력
//ver1.1 : member/view 명령 구현
//ver1.0 : member/list 명령 구현
//ver0.9 : member의 add명령 구현
    // 회원정보를 담을 새로운 데이터 타입을 정의(Member.java)
    // 다수의 회원정보를 저장할 reference 배열을 준비한다.
//ver0.8 : team/view 명령구현
    //ver0.81: 입력값에서 명령어와 검색어를 구분
    //ver0.82: 기능이나 코드가 바뀌면 그에 따라 적절히 변수명도 바뀔 필요가 있다
    //ver0.83: 입력값에서 검색어를 별도로 저장
    //ver0.84: 팀명이 없으면 안내 메세지 출력
    //ver0.85: 팀명으로 배열을 찾아서 팀 정보를 찾는다
    //ver0.86: 팀명으로 검색 시 대소문자 구분하지 않게 설정
    //ver0.87: 팀명의 일치여부(팀명없을시 안내문구 출력)
//ver0.7 : team/list 명령구현 
//ver0.6 : team/add 명령구현 => team메모리 배열 만들기
//ver0.5 : help 명령구현
//ver0.4 : quit명령어입력시 반복문을 종료
//ver0.3 : 사용자로부터 입력 받는것을 무한 반복한다.
//ver0.2 : 사용자로부터 입력을 받아 출력한다.
//ver0.1 : 명령입력 프롬프트를 출력
public class App_eum{

    public static void main(String[] args){

        Scanner keyScan = new Scanner(System.in);
        Team[]teams = new Team[1000];//Team 객체 주소를 1000개만들기
        int teamIndex = 0; // team 배열의 방주소

        Member[]members = new Member[1000];//
        int memberIndex = 0; // member 배열의 방주소

        while(true){
            System.out.print("명령> ");
            
            //String input = keyScan.nextLine().toLowerCase();//입력받자마자 가공
            String[] arr = keyScan.nextLine().toLowerCase().split(" ");//입력받자마자 가공
            //split(" ") => " "를 기준으로 잘라서 배열을 생성
            String order = arr[0];
            //입력 받은 문자열을 공백으로 잘라서 명령과 검색어로 구분한다.
            //일단 진행하기전에 기존의 기능이 잘 되는지 확인하라!
            String option = null; //문자열 없음!
            if(arr.length == 2){
                option = arr[1];
            }//team/view 뒤에 검색어가 없는 경우

            if(order.equals("quit")){
                System.out.println("안녕히 가세요!");
                break;
 
            } else if(order.equals("help")){
                System.out.println("[도움말]");
                System.out.println("팀 등록 명령 : team/add");
                System.out.println("팀 조회 명령 : team/list");
                System.out.println("팀 상세조회 명령 : team/view 팀명");
                System.out.println("회원 등록 명령 : member/add");
                System.out.println("회원 조회 명령 : memeber/list");
                System.out.println("회원 상세조회 명령 : meber/view 아이디");
                System.out.println("종료 : quit");

            } else if(order.equals("team/add")){
                System.out.println("[팀 정보 입력]");
                Team team = new Team();
                
                System.out.print("팀명? ");
                team.name = keyScan.next();

                System.out.print("설명? ");
                team.description = keyScan.next();

                System.out.print("최대인원 ? ");
                team.maxQty = keyScan.nextInt();

                keyScan.nextLine();

                System.out.print("시작일? ");
                team.startDate = keyScan.nextLine();

                System.out.print("종료일? ");
                team.endDate = keyScan.nextLine();

                //팀정보가 담겨있는 객체의 주소를 배열에 저장한다. 
                teams[teamIndex++] = team;
                //teamIndex++;

            } else if(order.equals("team/list")){
                System.out.println("[팀 목록]");
                for(int i = 0; i < teamIndex; i++){
                    System.out.printf("%s, %d, %s ~ %s\n",
                        teams[i].name, teams[i].maxQty,
                        teams[i].startDate, teams[i].endDate);
                }

            } else if(order.equals("team/view")){
                System.out.println("[팀 정보 조회]");
                if(option == null){
                    System.out.println("팀명을 입력하시기 바랍니다.");
                    System.out.println();
                    continue;
                }
                Team team = null;
                for(int i = 0; i < teamIndex; i++){
                    if(option.equals(teams[i].name.toLowerCase())){
                        team = teams[i];
                        break;
                    }
                }
                if(team == null){
                    System.out.println("해당 이름의 팀이 없습니다.");
                }else{
                    System.out.printf("팀명: %s\n",team.name);
                    System.out.printf("설명: %s\n",team.description);
                    System.out.printf("최대인원: %d\n",team.maxQty);
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

                //회원정보가 담겨있는 객체의 주소를 배열에 저장한다. 
                members[memberIndex++] = member;
                //memberIndex++;
            } else if(order.equals("member/list")){
                System.out.println("[회원 목록]");
                for(int i = 0; i < memberIndex; i++){
                    System.out.printf("%s, %s, %s\n",
                        members[i].id, members[i].email,
                        members[i].password);
                }
            } else if(order.equals("member/view")){
                System.out.println("[회원 정보 조회]");
                if(option == null){
                    System.out.println("회원명을 입력하시기 바랍니다.");
                    System.out.println();
                    continue;
                }
                Team team = null;
                for(int i = 0; i < memberIndex; i++){
                    if(option.equals(members[i].name.toLowerCase())){
                        member = members[i];
                        break;
                    }
                }
                if(team == null){
                    System.out.println("해당 이름의 팀이 없습니다.");
                }else{
                    System.out.printf("아이딘: %s\n",member.id);
                    System.out.printf("설명: %s\n",member.email);
                    System.out.printf("암호: %s\n",member.password);
                }    
            }else{
                System.out.println("명려어가 올바르지 않습니다.");
            
            }
                System.out.println();
        }
    }
}