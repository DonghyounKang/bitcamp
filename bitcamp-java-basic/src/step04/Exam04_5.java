//비트 이동 연산자 - 응용 II
package step04;

public class Exam04_5{
    public static void main(String[] args){
        //Yes/No 또는 true/false 값을 저장할 때 비트연산자를 활용하면 메모리를
        //절약할 수 있다.
        
        /*
        비트 연산자 사용 전
        => 각 상태를 별도의 변수에 저장

        필요한 메모리 : 32바이트
        */
        boolean c, cpp, java, js, python, php, html, css;
        c = true;
        cpp = false;
        java = true;
        js = false;
        python = true;
        php = false;
        htmal = true;
        css = false; 

        /*
        배열 이용 가능
        => boolean 배열은 jvm에서 다룰 때 각 boolean에 대해 1바이트 사용
        
        필요한 메모리: 8바이트
        */
        boolean[] langs = new boolean[8];
        langs[0] = true;
        langs[1] = false;
        langs[2] = true;
        langs[3] = false;
        langs[4] = true;
        langs[5] = false;
        langs[6] = true;
        langs[7] = false;
        
        /*
        비트 연산자 사용 후 
        
        4바이트 변수 1개만 있으면 최대 32개의 데이터를 저장할 수 있다. 
        xxxx_xxxxx_xxxx_xxxx_xxxx_xxxx_xxxx_xxxx
        */
        int lang2 = 0;
        lang2 |= 0x80;  //c = true 
        //0000_0000 | 1000_0000 = 1000_0000
        
        lang2 |= 0x00; //cpp = false

        lang2 |= 0x20; // java = true
        //1000_0000 | 0010_0000 = 1010_0000
        
        lang2 |= 0x00; // js = false
        
        lang2 |= 0x08; //python = true
        //1010_0000 | 0000_1000 = 1010_1000
        
        lang2 |= 0x00; //php = false

        lang2 |= 0x02; //html = true
        //1010_1000 | 0000_0010 = 1010_1010
        lang2 |= 0x00; //css



        /*0000_00000 | 1000_0000 = 1000_0000
        0000_0000_0000_0000_0000_0000_0000_00000 | 1000_0000 = 1000_0000
        0000_0000_0000_0000_0000_0000_1000_00000
        */
        


        
    }
}

