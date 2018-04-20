//Connectionless Client - 연결없이 데이터 송신
package step23_Network.ex06;

import java.io.PrintStream;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Scanner;

public class ConnectionlessClient {
    public static void main(String[] args) throws Exception {
        // 이 프로그램 실행 방법은
        // > java -cp bin step23_Network.ex06.ConnectionClientClient [서버주소] [메세지]
        System.out.println("client 실행");

        //Connectionless 방식으로 통신을 수행할 소켓 생성
        DatagramSocket socket = new DatagramSocket();
        
        //데이터를 받을 서버주소
        String receiver = args[0];
        int port = 8888;
        
        //보낼 데이터 바이트 배열로 실행
        byte[] bytes = args[1].getBytes("UTF-8");
        
        //보낼 데이터를 패킷에 담는다.
        // => 패킷 = 데이터 + 받는이 주소 + 포트 번호
        DatagramPacket packet = new DatagramPacket(bytes, bytes.length, InetAddress.getByName(receiver), port);
        
        //데이터 전송
        socket.send(packet);
        System.out.println("데이터 전송 완료");

        //자원해제
        socket.close();
        
        // 상대편의 네트워크 연결 여부와는 관계없이 무조건 데이터를 전송한다.
        // 만약 상대편이 연결되어있지 않다면 보낸 데이터는 상대편 네트워크에서 버려진다.
        
    }
}
