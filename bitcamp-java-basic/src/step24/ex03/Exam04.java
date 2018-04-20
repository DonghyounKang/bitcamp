//Thread 만들기 II - Runnable 인터페이스 구현 - 익명 클래스로 구현하기
package step24.ex03;

public class Exam04 {
    public static void main(String[] args) {



        //thread 실행하기
        //Runnable 구현체를 thread에 실어서 실행한다.
        //start()를 호출하여 기존 thread에서 분리하여 thread 실행
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    System.out.println("===> " + i);
                }
            }
        }).start(); // thread를 분리한 후 즉시 리턴한다.

        //"main"thread는 Thread와 상관없이 병행하여 진행
        for(int i = 0; i < 100; i++) {
            System.out.println(">>>> " + i);
        }
    }

}
