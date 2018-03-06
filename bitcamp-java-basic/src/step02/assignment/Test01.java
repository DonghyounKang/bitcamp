package step02.assignment;


public class Test01{
    public static void main(String[] args){

        String name;
        int kr, en, mth;
        
        java.io.InputStream keyboard = System.in;
        java.util.Scanner keyScan = new java.util.Scanner(keyboard);
        
        System.out.print("이름? ");
        name = keyScan.nextLine();
        System.out.print("국어? ");
        kr = keyScan.nextInt();
        System.out.print("영어? ");
        // 이저에 국어 점수를 입력받을 때 들어온 줄바꿈 코드는
        //nextInt() 메서드에서 버린다
        en = keyScan.nextInt();      
        System.out.print("수학? ");
        mth = keyScan.nextInt();  
        
        int sum = kr + en + mth;
        float aver = sum / 3;

        System.out.println(name + " " + kr + " " + en + " " + mth + " " +
        sum + " " + aver);
    }
}

