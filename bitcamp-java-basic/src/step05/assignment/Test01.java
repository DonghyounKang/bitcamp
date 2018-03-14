package step05.assignment;

import java.util.Scanner;

public class Test01{
    public static void main(String[] args){

        Scanner keyScan = new Scanner(System.in);

        System.out.print("밑변 길이? ");
        int base = keyScan.nextInt();
        
        int count = 1;
        while(count <=  base) {
            int star = 1;
            while(star <= count){
                System.out.println("*");
                star++;
            }
            System.out.println();
            count++;
        }


    }
}