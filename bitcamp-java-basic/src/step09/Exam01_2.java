// 생성자 활용 예 - 자바에서 제공하는 클래스 사용을 통해 생성자 활용 익히기
// Date
package step09;

import java.util.Date;

public class Exam01_2 {
    public static void main(String[] args) throws Exception {
        //java.util.Date 클래스는 날짜 데이터를 다루는 클래스
        
        //Date 기본 생성자는 메모리를 오늘 날짜값으로 초기화 시킨다.
        Date d1 = new Date();
        System.out.println(d1);
        
        //년,월,일 값으로 날짜 인스턴스 초기화
        Date d2 = new Date(118, 2, 20);
        System.out.println(d2);
        
        //1970.01.01 0시 0분 0초부터 측정된 밀리초를 가지고 날짜 인스턴스(객체,메모리) 초기화
        Date d3 = new Date(1000* 60 * 60 * 24 * 365 * 50);
        System.out.println(d3);
    }
}

/*
 * */
