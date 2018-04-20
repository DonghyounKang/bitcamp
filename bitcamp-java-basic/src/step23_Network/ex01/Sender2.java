//client + keyboard 입력 
package step23_Network.ex01;

import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

public class Sender2 {
    public static void main(String[] args) throws Exception {
        
        Scanner keyScan = new Scanner(System.in);
        
        Socket socket = new Socket("192.168.0.14", 8888);
        
        
        PrintStream out = new PrintStream(socket.getOutputStream());
        Scanner in = new Scanner(socket.getInputStream());
        
        //keyboard입력을 받아서 상대(서버)에게 전송한다.
        System.out.print("입력> ");
        String input = keyScan.nextLine();
        
        out.println(input);
        
        //서버가 보낸 데이터를 수신한다.
        String str = in.nextLine();
        System.out.println(str);
        
        in.close();
        out.close();
        
        socket.close();
        keyScan.close();
    }
}
