//증감연산자: 전위(pre-fix) 증감연산자 응용 I

package step04;

public class Exam06_8{
    public static void main(String[] args){
        int i = 2;
        int result = ++i + ++i * ++i;
        // 1) int result = 3 + 4 * 5
        // 2) int result = 3 + 20
        // 3) int result = 23

        System.out.printf("%d, %d",i, result); // 5, 23
        
        // 주의!
        
        //1) pre-fix연산자나 post-fix연산자를 리터럴에 적용할 수 없다.
        //int x = ++100; //Compile error
        //int x = 100++; //Compile error

        //2)변수에 동시에 적용할 수 없다.
        //int y = 100;
        //++y++; //Compile error
        //(++y)++; //Compile error => 왜? : (  )안에는 값이 놓인다!!
        //++(y++); //Compile error
    }
}

