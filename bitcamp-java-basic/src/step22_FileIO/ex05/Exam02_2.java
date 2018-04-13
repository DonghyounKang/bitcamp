//버퍼 사용 후 - 파일 복사 및 시간측정
package step22_FileIO.ex05;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Exam02_2 {
    public static void main(String[] args) throws Exception{
        
        // 1) File로 데이터를 출력하는 객체를 준비한다.
        FileInputStream in = new FileInputStream("temp/jls8.pdf");
        FileOutputStream out = new FileOutputStream("temp/jls8_3.pdf");
        
        byte[] buf = new byte[10000]; //보통 8KB정도 메모리 준비
        int count = 0;
        
        long startTime = System.currentTimeMillis();
        
        while((count = in.read(buf)) != -1) {
            out.write(buf, 0, count);
        } //파일을 끝까지 읽는다.
        
        long endTime = System.currentTimeMillis();
        
        System.out.println(endTime - startTime);
        
        out.close();
        in.close();
        
    }
    
    
}

//데이터 읽기 시간 = average seek time + data transfer time
// 퀀텀 HDD 예) 
// ast = 0.0105초
// dtt = 0.00000005초

//1000바이트 읽기
//1) 1바이트 1000번 읽는 경우
//   0.01050005초 * 1000byte = 10.50005초
//2) 1000바이트 1번 읽는 경우
//   0.105 * 0.00000005 * 1000byte = 0.01055초

// 1바이트를 여러번 읽을 경우 매번 바이트의 위치를 찾아야 하기 때문에 평균 탐색시간이 누적되어
// 한 번에 1000바이트를 읽는 것보다 시간이 오래걸린다.

//그러면 RAM에 배열의 크기르 크게 잡으면 좋지 않겠는가?
//=>  pc처럼 소수의 프로그램이 동시에 실행될 때는 상관없지만
//    서버처럼 동시에 데이터를 읽는 코드가 수천개에서 수십만개일 때는 
//    아무리 작은 크기의 메모리라도 매우 많아지게 된다.
//    그래서 보통 8KB정도의 버퍼 크기를 유지하고 있다.