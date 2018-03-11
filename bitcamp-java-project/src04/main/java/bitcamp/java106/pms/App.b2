package bitcamp.java106.pms;

import bitcamp.java106.pms.domain.Team;
import java.util.Scanner;


public class App_pr01{
    public static void main(String[] args){
// 2단계: 배열 적용
       
        Scanner keyScan = new Scanner(System.in);
        
        Team[] teams = new Team[100];
        teams[0] = new Team();

        System.out.print("팀명? ");
        teams[0].name = keyScan.next();

        System.out.print("설명?");
        teams[0].description = keyScan.next();
        
        System.out.print("최대인원? ");
        teams[0].maxQty = keyScan.nextInt();
        
        keyScan.nextLine();

        System.out.print("시작일? ");
        teams[0].startDate = keyScan.next();
        
        System.out.print("종료일? ");
        teams[0].endDate = keyScan.next();

        System.out.println("-----------------");
        System.out.printf("%s, %d명, %s ~ %s",
        teams[0].name,  teams[0].maxQty, teams[0].startDate, teams[0].endDate);

        

    }
}