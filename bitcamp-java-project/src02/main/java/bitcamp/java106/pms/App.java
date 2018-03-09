package bitcamp.java106.pms;

import bitcamp.java106.pms.domain.Information;

public class App{
    public static void main(String[] args){

        java.util.Scanner keyScan = new java.util.Scanner(System.in);


        int i;
        Information[] infos  = new Information[5];

        for(i = 0; i < info.length; i++){
            
            infos[i] = new Information();

            System.out.print("팀명? ");
            infos[i].teamName = keyScan.nextLine();

            System.out.print("설명? ");
            infos[i].description = keyScan.nextLine();

            System.out.print("최대인원? ");
            infos[i].maxQty = keyScan.nextInt();

            keyScan.nextLine();
            System.out.print("시작일? ");
            infos[i].startDate = keyScan.nextLine();

            System.out.print("종료일? ");
            infos[i].endDate = keyScan.nextLine();
            
            System.out.println("계속 입력하시겠습니까?");
            String ch = keyScan.nextLine();
                if(ch.toLowerCase().equals("n")){
                    i += 1;
                    break;
                } else if(ch.toLowerCase()("y")){
                    
                } else
            }     
            System.out.println("--------------------------");
            for (int j = 0; j < i; j++){
                System.out.printf("팀명: %s, %d 명, 기간: %s ~ %s\n",
                    infos[j].teamName, infos[j].maxQty, 
                    infos[j].startDate, infos[j].endDate);
            }
        
    }
}



/*System.out.printf("팀명: %s, %d 명, 기간: %s ~ %s\n",
info[i].teamName, info[i].maxQty, info[i].startDate, info[i].endDate);*/