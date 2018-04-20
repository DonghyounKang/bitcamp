//stateless와 stateful의 비교 - 식별번호 적용
package step23_Network.ex05;

import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class StatelessClient2 {
    public static void main(String[] args) throws Exception {
        int clientId = 0; // server로부터 클라이언트 식별번호를 발급 받기 전에는 0으로 설정

        //합계 계산을 요청하는 클라이언트 만들기
        try(Scanner keyScan = new Scanner(System.in);
                ) {

            while(true) {
                System.out.print("값? "); // 키보드에서 값을 입력 받아
                String value = keyScan.nextLine();
                try(
                        Socket socket = new Socket("localhost", 8888);
                        PrintStream out = new PrintStream(socket.getOutputStream());
                        Scanner in = new Scanner(socket.getInputStream());
                        ) {
                    out.println(value);// 서버에 값을 보낸다.
                    out.printf("%d\n", clientId);
                    if(value.equals("")) { //만약에 값을 입력하지 않았으면
                        System.out.println(in.nextLine()); // 서버가 보낸 결과 출력
                        break;
                    }
                    //서버가 보낸값은 항상 클라이언트 식별번호(ID)이기 때문에
                    //받은값을 보관해야한다.
                    clientId = Integer.parseInt(in.nextLine());
                }
            }
        }
    }
}
