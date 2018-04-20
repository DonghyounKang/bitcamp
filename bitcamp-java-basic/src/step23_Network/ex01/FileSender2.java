//client + keyboard + 무한반복
package step23_Network.ex01;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.net.Socket;
import java.util.Scanner;

public class FileSender2 {
    public static void main(String[] args) throws Exception {
        
        File file = new File("temp/asdf.jpg");
        BufferedInputStream fileIn = new BufferedInputStream(new FileInputStream(file));
        
        Socket socket = new Socket("192.168.0.14", 8888);  
        System.out.println("서버에 연결완료");
        

        DataOutputStream out = new DataOutputStream(
                new BufferedOutputStream(socket.getOutputStream()));
        Scanner in = new Scanner(
                new BufferedInputStream(socket.getInputStream()));
        
        System.out.println("데이터 송신");
        //파일 크기
        out.writeLong(file.length());
        //파일 이름
        out.writeUTF(file.getName());
        
        int b;
        while ((b = fileIn.read()) != -1) {
            out.write(b);
        } 
        out.flush();//buffer에 남아있는 데이터 방출하기
        
        System.out.println("데이터 송신 완료");
        
        
        
        String ack = in.nextLine();
        System.out.println(ack);

        in.close();
        out.close();

        socket.close();
        fileIn.close();        

    }
}
