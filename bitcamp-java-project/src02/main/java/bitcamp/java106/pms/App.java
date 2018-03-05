package bitcamp.java106.pms;

public class App{
    public static void main(String[] args){

        String name, para, start, end;
        int num;
    
        java.io.InputStream keyboard = System.in;
        java.util.Scanner keyScan = new java.util.Scanner(keyboard);

        System.out.print("팀명? ");
        name = keyScan.nextLine();
        System.out.print("설명? ");
        para = keyScan.nextLine();
        System.out.print("최대 인원? ");
        num = keyScan.nextInt();      
        keyScan.nextLine();
        System.out.print("시작일? ");
        start = keyScan.nextLine();  
        System.out.print("종료일? ");
        end = keyScan.nextLine();  

        System.out.println("---------------------------");
        System.out.println("팀명: " + name);
        System.out.println("설명: "  + '\n' + para);
        System.out.println("최대인원:" + num + "명");
        System.out.println("일자: " + start + " ~ " + end);

    }
}