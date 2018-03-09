package bitcamp.java106.pms;

import bitcamp.java106.pms.domain.Team;
import java.util.Scanner;


public class App_pr02{
    public static void main(String[] args){
// 3단계: for 문 적용
       
        Scanner keyScan = new Scanner(System.in);
        
        Team[] teams = new Team[100];

        for(int i = 0; i < 3; i++){
            teams[i] = new Team();

            System.out.print("팀명? ");
            teams[i].name = keyScan.next();

            System.out.print("설명?");
            teams[i].description = keyScan.next();
            
            System.out.print("최대인원? ");
            teams[i].maxQty = keyScan.nextInt();
            
            keyScan.nextLine();

            System.out.print("시작일? ");
            teams[i].startDate = keyScan.next();
            
            System.out.print("종료일? ");
            teams[i].endDate = keyScan.next();
        }

        System.out.println("-----------------");
        for (int i = 0; i < 3; i++){
            System.out.printf("%3s, %3d명, %3s ~ %3s\n",
                teams[i].name,  teams[i].maxQty, 
                teams[i].startDate, teams[i].endDate);
        }
        

    }
}