//Thread 만들기 II - Runnable 인터페이스 구현 + thread
package step24.ex03;

public class Exam02 {
    public static void main(String[] args) {
        
        //Thread에서 실행할 코드를 별도의 클래스로 분리하기
        // => java.lang.Runnable 인터페이스 구현
        class MyRunnable implements Runnable {
            
            @Override
            public void run() {
                //별도로 분리해서 병행으로 실행할 코드를 두는곳
                for (int i = 0; i < 1000; i++) {
                    System.out.println("===> " + i);
                }
            }
        }
        
        //thread 실행하기
        //Runnable 구현체를 thread에 실어서 실행한다.
        //start()를 호출하여 기존 thread에서 분리하여 thread 실행
        Thread t = new Thread(new MyRunnable());
        t.start(); // thread를 분리한 후 즉시 리턴한다.
        
        //"main"thread는 Thread와 상관없이 병행하여 진행
        for(int i = 0; i < 100; i++) {
            System.out.println(">>>> " + i);
        }
    }

}
