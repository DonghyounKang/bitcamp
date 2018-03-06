package step02.assignment;

public class Rtest{
    public static void main(String[] args){

        java.io.InputStream keyboard = System.in;
        java.util.Scanner keyScan = new java.util.Scanner(keyboard);
        
/* 1차 : 한명의 점수 계산
        System.out.print("입력? ");
        String name = keyScan.next();
        int kor = keyScan.nextInt();
        int eng = keyScan.nextInt();
        int math = keyScan.nextInt();

        int sum = kor + eng + math;
        float average = sum/3;

        System.out.println("----------------------");
        System.out.println(name + " " + kor + " " + eng + " " + math + " " +
            sum + " " + average);
*/
/* 2차 및 3차 : 5명의 점수계산(3차 : 변수선언 한번에)
        String name1, name2, name3, name4, name5;
        int kor1, kor2, kor3, kor4, kor5;
        int eng1, eng2, eng3, eng4, eng5;
        int math1, math2, math3, math4, math5;
        int sum1, sum2, sum3, sum4, sum5;
        float aver1, aver2, aver3, aver4, aver5;

        System.out.print("입력? ");
         name1 = keyScan.next();
         kor1 = keyScan.nextInt();
         eng1 = keyScan.nextInt();
         math1 = keyScan.nextInt();

         sum1 = kor1 + eng1 + math1;
         aver1 = sum1/3;
        
        System.out.print("입력? ");
         name2 = keyScan.next();
         kor2 = keyScan.nextInt();
         eng2 = keyScan.nextInt();
         math2 = keyScan.nextInt();

         sum2 = kor2 + eng2 + math2;
         aver2 = sum2/3;

        System.out.print("입력? ");
         name3 = keyScan.next();
         kor3 = keyScan.nextInt();
         eng3 = keyScan.nextInt();
         math3 = keyScan.nextInt();

         sum3 = kor3 + eng3 + math3;
         aver3 = sum3/3;

        System.out.print("입력? ");
         name4 = keyScan.next();
         kor4 = keyScan.nextInt();
         eng4 = keyScan.nextInt();
         math4 = keyScan.nextInt();

         sum4 = kor4 + eng4 + math4;
         aver4 = sum4/3;

        System.out.print("입력? ");
         name5 = keyScan.next();
         kor5 = keyScan.nextInt();
         eng5 = keyScan.nextInt();
         math5 = keyScan.nextInt();

         sum5 = kor5 + eng5 + math5;
         aver5 = sum5/3;


        System.out.println("----------------------");
        System.out.println(name1 + " " + kor1 + " " + eng1
             + " " + math1 + " " + sum1 + " " + aver1);
        System.out.println(name2 + " " + kor2 + " " + eng2 + " " + math2 + " " +
        sum2 + " " + aver2);
        System.out.println(name3 + " " + kor3 + " " + eng3 + " " + math3 + " " +
        sum3 + " " + aver3);
        System.out.println(name4 + " " + kor4 + " " + eng4 + " " + math4 + " " +
        sum4 + " " + aver4);
        System.out.println(name5 + " " + kor5 + " " + eng5 + " " + math5 + " " +
        sum5 + " " + aver5);
*/
        String[] name = new String[5];
        int[] kor = new int[5];
        int[] eng = new int[5];
        int[] math = new int[5];
        int[] sum = new int[5];
        float[] aver = new float[5];

        for(int i = 0; i < 5; i++){
            System.out.print("입력? ");
            name[i] = keyScan.next();
            kor[i] = keyScan.nextInt();
            eng[i] = keyScan.nextInt();
            math[i] = keyScan.nextInt();

            sum[i] = kor[i] + eng[i] + math[i];
            aver[i] = sum[i] / 3;
        }

        System.out.println("----------------------");        
//6차 printf 활용
        for(int i = 0; i < 5; i++){
            System.out.printf("%s, %d, %d, %d, %d, %f\n",
                name[i], kor[i], eng[i], math[i], sum[i], aver[i]);

        }
/*5차 : for문        System.out.println("----------------------");        
 활용
        
        for(int i = 0; i < 5; i++){
        System.out.println(name[i] + " " + kor[i] + " " + eng[i]
             + " " + math[i] + " " + sum[i] + " " + aver[i]);
            }
*/

/*4차 : 배열을 활용한 5명 점수계산
        System.out.print("입력? ");
        name[0] = keyScan.next();
        kor[0] = keyScan.nextInt();
        eng[0] = keyScan.nextInt();
        math[0] = keyScan.nextInt();

        sum[0] = kor[0] + eng[0] + math[0];
        aver[0] = sum[0] /3;

        System.out.print("입력? ");
        name[1] = keyScan.next();
        kor[1] = keyScan.nextInt();
        eng[1] = keyScan.nextInt();
        math[1] = keyScan.nextInt();

        sum[1] = kor[1] + eng[1] + math[1];
        aver[1] = sum[1] /3;

        System.out.print("입력? ");
        name[2] = keyScan.next();
        kor[2] = keyScan.nextInt();
        eng[2] = keyScan.nextInt();
        math[2] = keyScan.nextInt();

        sum[2] = kor[2] + eng[2] + math[2];
        aver[2] = sum[2] /3;

        System.out.print("입력? ");
        name[3] = keyScan.next();
        kor[3] = keyScan.nextInt();
        eng[3] = keyScan.nextInt();
        math[3] = keyScan.nextInt();

        sum[3] = kor[3] + eng[3] + math[3];
        aver[3] = sum[3] /3;

        System.out.print("입력? ");
        name[4] = keyScan.next();
        kor[4] = keyScan.nextInt();
        eng[4] = keyScan.nextInt();
        math[4] = keyScan.nextInt();

        sum[4] = kor[4] + eng[4] + math[4];
        aver[4] = sum[4] /3;

        System.out.println("----------------------");
        System.out.println(name[0] + " " + kor[0] + " " + eng[0]
             + " " + math[0] + " " + sum[0] + " " + aver[0]);
        System.out.println(name[1] + " " + kor[1] + " " + eng[1] + " " + math[1] + " " +
        sum[1] + " " + aver[1]);
        System.out.println(name[2] + " " + kor[2] + " " + eng[2] + " " + math[2] + " " +
        sum[2] + " " + aver[2]);
        System.out.println(name[3] + " " + kor[3] + " " + eng[3] + " " + math[3] + " " +
        sum[3] + " " + aver[3]);
        System.out.println(name[4] + " " + kor[4] + " " + eng[4] + " " + math[4] + " " +
        sum[4] + " " + aver[4]);
*/
    }
}