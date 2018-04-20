//Thread의 생명주기(life cycle) - 우선순위 설정
package step24.ex04;

public class Exam06 {
    public static void main(String[] args) throws Exception {
        class MyThread extends Thread {
            public MyThread(String name) {
                super(name);
            }
            public void run() {
                long startTime = System.currentTimeMillis();
                for(int i = 0; i < 100000000; i++) 
                    Math.asin(38.567);
                long endTime = System.currentTimeMillis();
                System.out.printf("main = %d\n", endTime - startTime);
            }
        }
        Thread.currentThread().setPriority(1);

        MyThread t1 = new MyThread("t1");

        //Thread의 운선순위 설정
        t1.setPriority(10);


        //UNIX 계열의 OS의 경우 scheduling에서 우선 순위를 고려하여 CPU를 배분한다.
        // 그러나 WIDOWS OS는 우선순위를 덜 고려하여 CPU를 배분한다.
        // 그러다보니 우선 순위를 조정하여 작업을 처리하도록프로그램을 작성하게 되면
        // UNIX계열의 경우 의도한대로 동작하지만
        // WINDOW OS에서는 의도대로 동작하지 않을 것이다.
        // => 프로그램을 만들 때 Thread에 우선순위를 조정하는 방법에 의존하지 말것

        System.out.printf("main 스레드 우선 순위: %d\n",
                Thread.currentThread().getPriority());

        System.out.printf("%s 스레드 우선 순위: %d\n",
                t1.getName(), t1.getPriority());

        t1.start();

        long startTime = System.currentTimeMillis();
        for(int i = 0; i < 100000000; i++) 
            //System.out.printf("%s %d\n", this.getName(), i);
            Math.asin(38.567);
        long endTime = System.currentTimeMillis();

        System.out.printf("MyThread = %d\n", endTime - startTime);

    }
}
