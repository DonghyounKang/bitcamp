//대기열 크기 조정 - 서버에 연결을 요청한 후 대기 중인 클라이언트의 목록
package step23_Network.ex02;

import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server3 {
    public static void main(String[] args) throws Exception {
        Scanner keyScan = new Scanner(System.in);
        System.out.println("서버 실행!");
        
        keyScan.nextLine();
        // new ServerSocket(포트번호, 대기열수)
        // 대기열 개수를 초과하여 클라이언트가 연결을 요청하면 연결을 거절한다.
        ServerSocket ss = new ServerSocket(8888, 2);
        System.out.println("클라이언트 연결을 기다리는중...");

        keyScan.nextLine();
        Socket socket = ss.accept();
        System.out.println("대기 중인 클라이언트 중 한 개의 클라이언트에 대해 연결 승인!");
        
        PrintStream out = new PrintStream(socket.getOutputStream());
        Scanner in = new Scanner(socket.getInputStream());
        System.out.println("입출력 스티림 준비");
        
        keyScan.nextLine();        

        System.out.println("클라이언트 데이터 수신 중..");
        System.out.println(in.nextLine());
        
        System.out.println("클라이언트 데이터 수신 완료!");
        
        //Client에게 응답 보냄
        out.println("OK");
        
        //자원해제
        socket.close();
        System.out.println("클라이언트와 연결해제");
        ss.close();
        System.out.println("서버 종료");
        
    }
}

//Port Number
// => 0 ~ 1023 : Well-known port
//    - 특정 프로그램이 관습적으로 사용하는 포트번호
//    - 일반 프로그램을 작성할 때 가능한 이 포트 번호를 사용하지 말아야 한다.
//    - ex) 7(echo), 20(FTP데이터 포트), 21(FTP제어 포트), 23(telnet-원격제어)
//          25(SMTP), 53(DNS), 80(HTTP server), 110(POP3), 143(IMAP)
//          
// => 1024 ~ 49151 : registered port
//    - 일반적인 통신 프로그램을 작성할 때 이 범위의 포트 번호르 사용한다.
//    - 다만 이 범위의 번호 중에서 특정 프로그램이 널리 사용하는 번호가 있다. 
//    - 가능한 그 번호도 피하도록 한다.
//    - ex) 8080(proxy server), 1521(ORACLE), 3306(mySQL) 등
// => 49152 ~ 65535 : dynamic port
//    - 통신하는 프로그램은 반드시 포트번호를 가져야 한다. 그래야 OS가 해당 프로그램 구분 가능
//    - 따라서 클라이언트 프로그램도 포트 번호를 갖는데
//      프로그램에서 결정하는 것이 아니라 OS로부터 자동 발급 받는다.
//    - 이 범위의 포트 번호는 클라이언트가 OS로부터 자동 발급받는 포트 번호이다.