package step11.ex17;

public class Truck extends Car {
    
    
    @Override
    public void run() {
        System.out.println("덜컹덜컹 달렷");
    }
    
    public void dump() {
        System.out.println("짐을 내린다.");
    }
    
    
}
