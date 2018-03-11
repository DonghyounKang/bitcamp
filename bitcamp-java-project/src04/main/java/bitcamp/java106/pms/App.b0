package bitcamp.java106.pms;

public class App{
    public static void main(String[] args){
        
        java.io.InputStream keyboard = System.in;
        java.util.Scanner keyScan = new java.util.Scanner(keyboard);

        String teamName;
        String description;
        int maxQty;
        String startDate;
        String endDate;

        System.out.print("팀명? ");
        teamName = keyScan.next();

        System.out.print("설명?");
        description = keyScan.next();
        
        System.out.print("최대인원? ");
        maxQty = keyScan.nextInt();
        
        keyScan.nextLine();

        System.out.print("시작일? ");
        startDate = keyScan.next();
        
        System.out.print("종료일? ");
        endDate = keyScan.next();

        System.out.println("-----------------");
        System.out.printf("팀명: %s\n설명: %s\n최대인원: %d\n일자: %s ~ %s",
        teamName, description, maxQty, startDate, endDate);

        

    }
}