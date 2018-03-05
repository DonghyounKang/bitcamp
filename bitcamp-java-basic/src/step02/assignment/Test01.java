package step02.assignment;

import java.util.Scanner;

public class Test01{
    public static void main(String[] args){

        String name;
        int kr, en, mth;

        java.io.InputStream keyboard = System.in;
        java.util.Scanner keyScan = new java.util.Scanner(keyboard);

        System.out.print("이름? ");
        name = keyScan.next();
        System.out.print("국어? ");
        kr = keyScan.nextInt();
        System.out.print("영어? ");
        en = keyScan.nextInt();      
        System.out.print("수학? ");
        mth = keyScan.nextInt();  

        int sum = kr + en + mth;
        float aver = sum / 3;

        System.out.println(name + " " + kr + " " + en + " " + mth + " " +
        sum + " " + aver);
    }
}