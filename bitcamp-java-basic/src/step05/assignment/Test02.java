package step05.assignment;

import java.util.Scanner;

public class Test02{
    public static void main(String[] args){

        Scanner keyScan = new Scanner(System.in);

        System.out.print("밑변 길이? ");
        int base = keyScan.nextInt();
        
        int count = 1;
        while(count <=  base) {
            int star = 1;
            while(star <= count){
                System.out.print("*");
                star++;
            }
            System.out.println();
            count++;
        }

        count = base - 1;
        while(count >=  1) {
            int star = 1;
            while(star <= count){
                System.out.print("*");
                star++;
            }
            System.out.println();
            count--;
        }


    }
}