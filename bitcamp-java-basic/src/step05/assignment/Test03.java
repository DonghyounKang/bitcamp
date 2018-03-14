package step05.assignment;

import java.util.Scanner;

public class Test03{
    public static void main(String[] args){

        Scanner keyScan = new Scanner(System.in);

        System.out.print("밑변 길이? ");
        int base = keyScan.nextInt();
        
        int starlen = 1;
        while(starlen <= base) {
            
            int space = 1;
            int spacelen = (base - starlen) / 2;
            while(space <= spacelen){
                System.out.print(" ");
                space++;
            }
            
            int star = 1;
            while(star <= starlen){
                System.out.print("*");
                star++;
            }
            System.out.println();
            starlen+=2;
        }

    }
}