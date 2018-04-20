//stateless와 stateful의 비교 - 식별번호 적용
package step23_Network.ex05;

import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;
import java.util.Scanner;

//stateless방식의 특징
// => 요청할 때마다 서버와 연결한다. 응답받은후 서버와 연결을 끊는다.
// => 요청자를 구분할 수 없어 클라이언트의 작업을 구분할 수 없다.
public class StatelessServer2 {
    
    static int countClient = 0;
    static HashMap<Integer, Integer> sessionMap = new HashMap<>();
    
    
    public static void main(String[] args) throws Exception {
        System.out.println("서버 실행 중.....");
        //합계를 계산하는 서버를 만들어보자
        ServerSocket ss = new ServerSocket(8888);
        
        while(true) {
            Socket socket = ss.accept();
            System.out.println("클라이언트 연결 승인 및 작업 처리 중...");
            processRequest(socket);
            
        }
    }

    private static void processRequest(Socket socket) throws Exception{
        try (
            Socket socket2 = socket;
            PrintStream out = new PrintStream(socket.getOutputStream());
            Scanner in = new Scanner(socket.getInputStream());
            ) {

            String str = in.nextLine(); // 값
            int clientId = Integer.parseInt(in.nextLine()); // 식별코드

            //클라이언트가 다음에 데이터를 보냈을 때 
            // (CRLF)
            // 123(CRLF)  => "\n123\n" : 123번 클라이언트의 결과를 달라는 의미
            if(str.equals("")) {
                out.println("결과 = " + sessionMap.get(clientId));
                return;
            }

            //클라이언트 아이디가 0일때, 아직 서버로부터 클라이언트 식별번호를 발급받지 않은 상태이기 때문에
            // 새번호를 발급한다.
            // 클라이언트가 다음과 같은 데이터를 보냈다면
            // "100\n0\n"
            if (clientId == 0) {
                clientId = ++countClient;
                sessionMap.put(clientId, 0); // 새 클라이언트 식별번호 발급시 합계를 0으로 설정
            }
            
            // 클라이언트가 다음의 데이터를 보냈을 때
            //"100\n123\n
            int value =  Integer.parseInt(str);
            
            //클라이언트 아이디로 기존값을 꺼낸다.
            int sum = sessionMap.get(clientId);
            
            //기존값에 새값을 더하여 저장한다.
            sessionMap.put(clientId, sum + value);

            //작업 수행 후 클라이언트에게 식별 번호를 보낸다.
            out.printf("%d\n", clientId);
            
        }
    }
}
