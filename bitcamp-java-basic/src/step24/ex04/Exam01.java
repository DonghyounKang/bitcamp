//Thread의 생명주기(life cycle)
package step24.ex04;

public class Exam01 {
    public static void main(String[] args) {
        //thread 생명주기
        //new Thread()   start()               sleep()/wait()
        //  준비 -------------------->Running ------------------> Not Runnable
        //                           ^  |    <------------------  
        //                           |  |      timeout/notify()
        // thread 실행 종료 후                          X  |
        // 다시 실행 불가                                       |  | run()메서드 종료
        //                           |  V
        //                           Dead  
        
        //Running  상태 ?
        // => CPU을 받아서 실행 중이거난 CPU를 받을 수 있는 상태
        //
        // Not Runnabele 상태?
        // => CPU를 받지 않는 상태
        //
        //run()메서드 종려후 다시 running 상태로 돌아갈 수 없다.
        // => 새로 thread를 만들어 실행하는 방법 밖에 없다!
        System.out.println("thread 실행전");
        new Thread() {
            @Override
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    System.out.println("===> " + i);
                }
            }
        }.start();
        
        System.out.println("thread 실행 후");
        //main()메서드의 호출이 끝나더라도 다른 thread의 실행이 종료 될때까지 
        //JVM은 종료되지 않는다
    }

}
