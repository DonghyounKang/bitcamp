//System Thread 그룹에 소속된 자식 thread & 정리
package step24.ex02;

public class Exam07 {
    public static void main(String[] args) {
         
        Thread main = Thread.currentThread();
        ThreadGroup mainGroup = main.getThreadGroup();
        ThreadGroup systemGroup = mainGroup.getParent();
        
        
        Thread[] arr = new Thread[100];
        int count = systemGroup.enumerate(arr, false);
        
        System.out.println("system스레드에 소속된 thread들");
        for (int i = 0; i < count; i++) {
            System.out.println(" ==>"+arr[i].getName());
        }
        
        //       -------- [JVM 프로세스] ---------
        // "System" 스레드 그룹
        //  => 다른 하위그룹은 없다!
        //  =>"main"thread group:
        //      => "main" thread : main() 메서드 호출
        //      => 하위 그룹은 없다.
        //  =>"Reference Handler" thread : 인스턴스의 참조 관리
        //  =>"Finalizer" thread : garbage 관리
        //  =>"Signal Dispatcher" thread : 외부 신호 관리
        //  =>"Attach Listener" thread
        
    }
}
