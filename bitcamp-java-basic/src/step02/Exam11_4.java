//변수의 범위 - 변수와 블록
package step02;

public class Exam11_4{

    public static void main(String[] args){
        int a = 100; 
        {
            //int a = 200;//컴파일 오류
                        //메서드 안에서는 변수이름 중복불가
            //안쪽 블록에서는 바깥 블록의 변수를 사용할 수 있다.
            a = 200; // 가능 -> a의 값이 200으로  변경

            int b = 300;
        }
        System.out.println(a);
        
        //바깥블록에서는 안쪽 블록의 변수를 사용할 수 없다.
        //왜?
        //안쪽 블록의 실행이 끝나면 안쪽 블록에서 선언된 모든 변수들이 자동으로 제거

        //System.out.println(b); //컴파일 오류

        {
         
            int b = 400;
        }


    }
    
}  
