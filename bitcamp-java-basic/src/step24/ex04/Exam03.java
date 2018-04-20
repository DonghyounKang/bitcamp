//Thread의 생명주기(life cycle) - sleep()
package step24.ex04;

public class Exam03 {
    public static void main(String[] args) throws Exception {
       
        System.out.println("thread 실행전");
        new Thread() {
            @Override
            public void run() {
                    System.out.println("HELLO");
            }
        }.start();
        
        //3초동안 NotRunnable상태로 만든다.
        // => 3초동안 cpu가 놀고 있더라도 cpu를 사용하지 않는다.
        // => 3초가 지나면(timeOut) 다시 "main"Exam02.javaThread는 CPU르 받아 실핼 할 수 있다. 
        Thread.currentThread().sleep(3000);
        System.out.println("thread 실행 후");
        
    }

}
