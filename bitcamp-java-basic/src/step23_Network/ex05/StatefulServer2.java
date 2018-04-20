//stateless와 stateful의 비교 - multi thread 적용
package step23_Network.ex05;

import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;
import java.util.Scanner;

//stateful방식의 특징
// => 클라이언트와 계속 연결을 유지하기 때문에 작업 결과를 계속 서버에 유지할 수 있다.
public class StatefulServer2 {
    public static void main(String[] args) throws Exception {
        System.out.println("서버 실행 중.....");
        //합계를 계사나하는 서버를 만들어보자
        ServerSocket ss = new ServerSocket(8888);

        while(true) {
            Socket socket = ss.accept();
            System.out.println("클라이언트 연결 승인 및 작업 처리 중...");
            //processRequest(socket);

            //클라이언트 요청을 처리할 담당자 준비
            MyThread requestHandler = new MyThread(socket);

            //그 담당자에게 작업을 실행하게 한다.
            requestHandler.start();

        }
    }

    //클라이언트 요청 처리를 담당할 객체이다.
    // => thread로서 독립적으로 수행한다.
    static class MyThread extends Thread {
        Socket socket;

        public MyThread(Socket socket) {
            this.socket = socket;
        }

        //외부에서 start()를 호출하면 내부의 run 실행
        @Override
        public void run() {
            //여기에 이 작업자가 독립적으로 실행할 코드를 둔다.
            try (
                Socket socket2 = socket;
                PrintStream out = new PrintStream(socket.getOutputStream());
                Scanner in = new Scanner(socket.getInputStream());
                ) {
                //클라이언트와의 연결을 끊을 때까지 계속 계산결과를 서버에 유지한다.
                // => "stateful"방식이라 부른다.

                int sum = 0;
                while(true) {
                    String str = in.nextLine();
                    if(str.equals(""))
                        break;
                    sum += Integer.parseInt(str);
                }

                out.println("결과 = " + sum);
            } catch(Exception e) {
                System.out.println("클라이언트 요청처리중 오류 발생");
            }
        }
    }
}
