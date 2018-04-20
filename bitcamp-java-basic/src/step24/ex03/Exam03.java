//Thread 상속받기 - 익명 클래스로 구현하기
package step24.ex03;

public class Exam03 {
    public static void main(String[] args) {
        
        new Thread() {
            
            @Override
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    System.out.println("===> " + i);
                }
            }
        }.start();
        
        
        //"main"thread는 MyThread와 상관없이 병행하여 진행
        for(int i = 0; i < 100; i++) {
            System.out.println(">>>> " + i);
        }
    }

}
