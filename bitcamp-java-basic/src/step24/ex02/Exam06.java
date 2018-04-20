//System Thread 그룹의 자식 그룹
package step24.ex02;

public class Exam06 {
    public static void main(String[] args) {
        
         
        Thread main = Thread.currentThread();
        ThreadGroup mainGroup = main.getThreadGroup();
        ThreadGroup systemGroup = mainGroup.getParent();
        
        
        ThreadGroup[] groups = new ThreadGroup[100];
        int count = systemGroup.enumerate(groups, false);
        
        System.out.println("system스레드의 자식그룹");
        for (int i = 0; i < count; i++) {
            System.out.println(" ==>"+groups[i].getName());
        }
        
        //"System" 스레드 그룹
        //  => 다른 하위그룹은 없다!
        //  =>"main"thread group:
        //    => "main" thread
        //    => 하위 그룹은 없다.
        
    }
}
