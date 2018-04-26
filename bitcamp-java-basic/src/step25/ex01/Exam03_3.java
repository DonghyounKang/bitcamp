// JDBC 프로그래밍 개요 - DBMS에 SQL문 보내기 : select
package step25.ex01;

import java.sql.Connection;
import java.sql.DriverManager;

public class Exam03_3 {

    public static void main(String[] args) throws Exception {
        // 1) JDBC 드라이버 로딩 
        Class.forName("com.mysql.cj.jdbc.Driver");
        
        System.out.println("JDBC Driver loading & register complete!");
        
        // 2) DBMS에 연결하기
        java.sql.Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/java106db?serverTimezone=UTC&useSSL=false",// serverTimeZone 설정(UTC)
                "java106","1111");
        System.out.println("DBMS Connection Complete");

        // 3) SQL문을 server에 보낼 객체를 얻는다.
        java.sql.Statement stmt = con.createStatement();
        
        // 4) statement 객체를 사용하여 DBMS에 SQL문을 보낸다.
        //      => 리턴 값: 서버에서 데이터를 가져오는 역할을 하는 객체를 리턴
        java.sql.ResultSet rs = stmt.executeQuery("select bno,titl,cont,rdt from ex_board");
        //아직 서버에서 결과를 가져오지 못했다.
        
        // 5) ResultSet객체를 사용하여 server에서 select한 결과를 한 record(row)를 가져온다.
        //용어정리
        //record(레코드) : select를 실행한 후, 생성된 결과를 말한다.
        boolean isReceived = rs.next(); // 가져왔다면 true, 가져올것이 없다면 false
        
        if(isReceived) {
            //서버에서 한개의 레코드 값을 가져온 후 column값을 꺼낼 때 
            //select문에 나열한 순서대로 번호를 지정하면 된다.
            //단,번호는 0부터가 아닌 1부터 지정
            //그런데 column의 번호를 지정하여 값을 꺼내면
            //소스코드를 일긍ㄹ 때 매우 불편한다.
            //즉, 해당 번호가 어떤 컬럼을 가리키는지 알려면 select문을 살펴봐야하는 번거로움이 있다.
            // 그래서 실무에서는 가능한 번호대신 column의 이름을 사용한다.
            System.out.printf("%d, %s, %s, %s\n",
                    rs.getInt("bno"), 
                    //rs.getString("bno"),    
                    rs.getString("titl"), 
                    rs.getString("cont"), 
                    rs.getDate("rdt")/*java.sql.date 객체 리턴*/); 
                    //rs.getString("rdt"));
            
            //DBMS에 설정된 타입에 따라 .getXXX()호출
            //int, number => getInt()
            //char, varchar, text => getString()
            //date, dateTime => getDate()
            //float => getFloat()
            // 등....
            // 물론 column의 타입과 상관없이 getString()으로 값을 꺼낼 수 있다.
            
        } else {
            System.out.println("could not get the record from Server");
        }
        
        //자원해제
        // => File과 마찬가지로 DBMS 연결 이후 더이상 사용하지 않으면 자원해제 할 것
        rs.close();
        stmt.close();
        con.close();
        
        
    }
}







