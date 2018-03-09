package bitcamp.java106.pms;

import bitcamp.java106.pms.domain.Team;
import java.util.Scanner;


public class App_pr{
    public static void main(String[] args){
        //클래스를 사용하여 입력데이터를 묶어서 저장하는 방법을 익힌다.

        Scanner keyScan = new Scanner(System.in);

        Team team = new Team();

        System.out.print("팀명? ");
        team.name = keyScan.next();

        System.out.print("설명?");
        team.description = keyScan.next();
        
        System.out.print("최대인원? ");
        team.maxQty = keyScan.nextInt();
        
        keyScan.nextLine();

        System.out.print("시작일? ");
        team.startDate = keyScan.next();
        
        System.out.print("종료일? ");
        team.endDate = keyScan.next();

        System.out.println("-----------------");
        System.out.printf("%s, %d명, %s ~ %s",
            team.name,  team.maxQty, team.startDate, team.endDate);

        

    }
}