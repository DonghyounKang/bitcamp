//Thread 만들기 I - Thread 클래스 상속 받기
package step24.ex03;

public class Exam01 {
    public static void main(String[] args) {
        
        //Thread 정의 하기
        // => java.lang.Thread를 상속받아 만든다.
        class MyThread extends Thread {
            
            //기존의 thread에서 분기해서 새 thread에서 실행하고픈 코드가 있다면.
            // run() 메서드르 재정의하여 그 메서드에 해당 코드 작성
            @Override
            public void run() {
                //별도로 분리해서 병행으로 실행할 코드를 두는곳
                for (int i = 0; i < 1000; i++) {
                    System.out.println("===> " + i);
                }
            }
        }
        
        //thread 실행하기
        //start()를 호출하여 기존 thread에서 분리하여 thread 실행
        MyThread t = new MyThread();
        t.start(); // thread를 분리한 후 즉시 리턴한다.
        
        //"main"thread는 MyThread와 상관없이 병행하여 진행
        for(int i = 0; i < 100; i++) {
            System.out.println(">>>> " + i);
        }
    }

}
