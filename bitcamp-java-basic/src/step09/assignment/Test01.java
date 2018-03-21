package step09.assignment;

import java.util.Scanner;
import java.util.Calendar;

public class Test01 {
    
    static class Inform {
        int year;
        int month;
        int date;
    }
    
    public static void main(String[] args) {

        Scanner keyScan = new Scanner(System.in);
        System.out.print("년,월,일? (예: 2018 3 21)");
        Inform i1 = new Inform();
        i1.year = keyScan.nextInt();
        i1.month = keyScan.nextInt();
        i1.date = keyScan.nextInt();
        
        System.out.println("요일: ");
        System.out.println("주차: ");
        System.out.println("일차: ");
    }
}
