//비트 이동 연산자 - 응용 II
package step04;

public class Exam04_6{
    public static void main(String[] args){
        /*다음 변수의 값을 조사하여 개발자가 어떤 프로그래밍 언어를 사용할 수있는지
        출력하라 
        각 비트에 해당하는 프로그래밍 언어는 다음순서를 따른다.
        c, cpp, java, js, python, php, html, css*/

        int lang =0b1110_0011;
        boolean c, cpp, java, js, python, php, html, css;
        /*lang 변수에 들어있는 각 비트 값을 조사하여
         1이면 그 변수에 해당하는 프로그래밍 이름을 출력
         if 조건문, &, == 연산자 활용
    
        실행결과
        c cpp java html css
        */

        if((lang >>> 7) == 1) System.out.print("c ");
        if(((lang >>> 6) & 0b0001) == 1) System.out.print("cpp ");
        if(((lang >>> 5) & 0b0001) == 1) System.out.print("java ");
        if(((lang >>> 4) & 0b0001) == 1) System.out.print("js ");
        if(((lang >>> 3) & 0b0001) == 1) System.out.print("python ");
        if(((lang >>> 2) & 0b0001) == 1) System.out.print("php ");
        if(((lang >>> 1) & 0b0001) == 1) System.out.print("html ");
        if((lang & 0b0001) == 1) System.out.print("css ");

        
        if((lang & 0x80) == 0x80) System.out.print("c ");
        if((lang & 0x40) > 0) System.out.print("cpp ");
        if((lang & 0x20) > 0) System.out.print("java ");
        if((lang & 0x10) > 0) System.out.print("js ");
        if((lang & 0x08) > 0) System.out.print("python "); //8
        if((lang & 0x04) > 0) System.out.print("php "); //4
        if((lang & 0x02) > 0) System.out.print("html "); //2
        if((lang & 0x01) > 0) System.out.print("css ");  //1

        if((lang & 0x80) == 0x80) System.out.print("c ");
        if((lang & 0x40) > 0) System.out.print("cpp ");
        if((lang & 0x20) > 0) System.out.print("java ");
        if((lang & 0x10) > 0) System.out.print("js ");
        if((lang & 8) > 0) System.out.print("python "); //8
        if((lang & 4) > 0) System.out.print("php "); //4
        if((lang & 2) > 0) System.out.print("html "); //2
        if((lang & 1) > 0) System.out.print("css ");  //1




        


        
    }
}

