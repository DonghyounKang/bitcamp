package step11.ex15;

public class Sedan {
    
    public void start() {
        System.out.println("시동");
    }
    
    public void shutdown() {
        System.out.println("정지");
    }
    
    public void run() {
        System.out.println("달려라 달렷");
    }
    
    public void doSunroof(boolean open) {
        if(open) {
            System.out.println("선루프를 연다");
        } else {
            System.out.println("선루프를 닫는다.");
        }
    }
    
    
}
