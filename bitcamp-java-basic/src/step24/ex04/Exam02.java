//Thread의 생명주기(life cycle) - join()
package step24.ex04;

public class Exam02 {
    public static void main(String[] args) throws Exception {
       
        System.out.println("thread 실행전");
        Thread t = new Thread() {
            @Override
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    System.out.println("===> " + i);
                }
            }
        };
        
        t.start();
        
        t.join(); //t thread가 종료될 때까지 "main"thread는 기다린다.
        
        //즉 t thread가 종료된후 다음 코드를 실행한다.
        System.out.println("thread 실행 후");
        
        //thread 종료후 다시시작시킨다면?
        // => IllegalThreadStateException 발생
        // => 즉, 종료된 thread는 다시 running 할 수 없다.
        t.start();
    }

}
