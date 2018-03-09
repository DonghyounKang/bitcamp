package bitcamp.java106.pms;

import bitcamp.java106.pms.domain.Team;
import java.util.Scanner;


public class App_pr03{
    public static void main(String[] args){
    // 4단계: if 문 적용
       
        Scanner keyScan = new Scanner(System.in);
        
        Team[] teams = new Team[100];

        int count = 0;
        for(int i = 0; i < team.length; i++){
            count ++;
            teams[i] = new Team();

            System.out.print("팀명? ");
            teams[i].name = keyScan.next();

            System.out.print("설명? ");
            teams[i].description = keyScan.next();
            
            System.out.print("최대인원? ");
            teams[i].maxQty = keyScan.nextInt();
            
            keyScan.nextLine();

            System.out.print("시작일? ");
            teams[i].startDate = keyScan.nextLine();
            
            System.out.print("종료일? ");
            teams[i].endDate = keyScan.nextLine();

            if(count == teams.length){
                break;
            }

            System.out.println("계속하시겠습니까?(y/n)");
            String str = keyScan.nextLine();

            if(str.equals("n")){
                break;
            } 
        }   
        System.out.println("-----------------");
        for (int i = 0; i < count; i++){
            System.out.printf("%3s, %3d명, %3s ~ %3s\n",
                teams[i].name,  teams[i].maxQty, 
                teams[i].startDate, teams[i].endDate);
        }
        

    }
}