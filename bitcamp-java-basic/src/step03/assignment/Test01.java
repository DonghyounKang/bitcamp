package step03.assignment;

public class Test01{
    public static void main(String[] args){

        //java.io.InputStream keyboard = System.in;
        //java.util.Scanner keyScan = new java.util.Scanner(keyboard);
        java.util.Scanner keyScan = new java.util.Scanner(System.in);
        
        //Score메모리(인스턴스)의 주소를 저장할 변수: 레퍼런스 준비
        step03.Score[] scores;

        //입력값을 저장할 Score 메모리를 준비한다.
        scores = new step03.Score[3];

        //step03.Score[] scores = new steo03.Score[3];

        for (int i = 0; i < scores.length; i++){
            scores[i] = new step03.Score();
 
            System.out.print("입력? ");
            scores[i].name = keyScan.next();
            scores[i].kor = keyScan.nextInt(); 
            scores[i].eng = keyScan.nextInt();
            scores[i].math = keyScan.nextInt();

            scores[i].sum = scores[i].kor + scores[i].eng + scores[i].math;
            scores[i].aver = scores[i].sum / 3;
        }

        System.out.println("----------------------------------------");
        for (int i = 0; i < scores.length; i++) {
            System.out.printf(String.format("%5s %5d %5d %3d %5d %5.1f\n",
            scores[i].name, scores[i].kor, scores[i].eng, scores[i].math,
                 scores[i].sum, scores[i].aver));
        
        }
    }
}