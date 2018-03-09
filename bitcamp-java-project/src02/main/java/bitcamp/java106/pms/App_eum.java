package bitcamp.java106.pms;


import bitcamp.java106.pms.domain.Team;
import java.util.Scanner;

//4단계 : 조건문 적용

public class App_eum{
    public static void main(String[] args){

        Scanner keyScan = new java.util.Scanner(System.in);
        
        //팀정보를 받을 메모리 준비
        Team[] teams = new Team[5];//레퍼런스 배열 선언

        int count = 0;
        
        for(int i = 0; i < teams.length; i++){
            count++;

            teams[i] = new Team();//0번 방에 인스턴스 주소(레퍼런스)입력

            System.out.print("팀명? ");
            teams[i].name = keyScan.nextLine();

            System.out.print("설명? ");
            teams[i].description = keyScan.nextLine();

            System.out.print("최대인원? ");
            teams[i].maxQty= keyScan.nextInt();
            keyScan.nextLine(); 

            System.out.print("시작일? ");
            teams[i].startDate = keyScan.nextLine();

            System.out.print("종료일? ");
            teams[i].endDate = keyScan.nextLine();

            if(count == teams.length){// if(i == teams.length-1)
                break;
            }

            System.out.print("계속 입력하시겠습니까?(Y/n)");
            String str = keyScan.nextLine();
            if (str.toLowerCase().equals("n")){
                break;
            }
        }

        System.out.println("---------------------------");
        
        for(int i = 0; i < count; i++){
            System.out.printf("%s, %d명, %s ~ %s\n", 
                teams[i].name, teams[i].maxQty, 
                teams[i].startDate, teams[i].endDate);
        }
    }
}