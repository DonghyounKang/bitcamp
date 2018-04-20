//현재의 실행라인 알아내기
package step24.ex02;

public class Exam01 {
    public static void main(String[] args) {
        // 이 순간 실행 중인 흐름이 무엇인지 알고 싶은 경우
        Thread t = Thread.currentThread();
        System.out.println("실행 흐름명: " + t.getName());
        
        //실행 흐름을 전문적인 용어로 "Thread"라 부른다.
        //JVM이 실행될때
    }
}
