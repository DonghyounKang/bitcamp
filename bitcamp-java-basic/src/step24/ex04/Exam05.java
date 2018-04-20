//Thread의 생명주기(life cycle) - 우선순위 조회
package step24.ex04;

public class Exam05 {
    public static void main(String[] args) throws Exception {

        class MyThread extends Thread {
            public MyThread(String name) {
                super(name);
            }

            public void run() {
                for (int i = 0; i < 1000; i ++) {
                    System.out.printf("%s %d\n", this.getName(), i);
                }
            }
        }
        MyThread t1 = new MyThread("홍길동==>");
       
        //Thread의 운선순위 범위
        System.out.printf("우선순위 범위: %d ~ %d\n", 
                Thread.MIN_PRIORITY, Thread.MAX_PRIORITY); //우선순위 범위: 1 ~ 10
        
        System.out.printf("우선순위 기본값: %d\n", 
                Thread.NORM_PRIORITY); //우선순위 기본값: 5
        
        //"main"thread 우선순위 보기
        System.out.printf("main thread 우선순위: %d\n",
                Thread.currentThread().getPriority()); //main thread 우선순위: 5
        
        //"t1" thread의 우선순위 조회
        // => main thread를 실행하는 동안 만든 thread는 "main"의 자식 thread라 부른다.
        // => child thread는 parent thread의 우선순위와 같은 값을 갖는다.
        //    따라서 t1 thread의 우선순위는 "main"thread의 우선순위와 같다.
        System.out.printf("%s main thread 우선순위: %d\n",
                t1.getName(), t1.getPriority()); //홍길동==> main thread 우선순위: 5
    }
}
