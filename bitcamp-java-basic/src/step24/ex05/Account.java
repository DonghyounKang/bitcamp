package step24.ex05;

public class Account {
    String accountId;
    long balance;

    public Account(String accountId, long balance) {
        this.accountId = accountId;
        this.balance = balance; 

    }
    
    //한번에 한 thread만 호출할 수 있도록 접근을 제한하고 싶다면 메서드 전체를 동기화 블록으로 선언하라
    // method 앞에 synchronized를 붙인다.
    // => 이 메서드 철럼 여러 thread가 접근했을 때 문제가 발생하는 critical section이 아니면
    //    synchronized 사용을 자제할 것
    // 왜? 
    // 성능이 떨어진다.
    synchronized public long withdraw(long money) {
        long b = this.balance;
        for (int i = 0; i < 10000; i++)Math.asin(45.765);//CPU 뺏길 기회를 제공
        
        b -= money;
        for (int i = 0; i < 10000; i++)Math.asin(45.765);//CPU 뺏길 기회를 제공

        if(b < 0)
            return 0;
        for (int i = 0; i < 10000; i++)Math.asin(45.765);//CPU 뺏길 기회를 제공
        
        this.balance = b;
        for (int i = 0; i < 10000; i++)Math.asin(45.765);//CPU 뺏길 기회를 제공
        
        return money;
    }
}
//withdraw()메서드를 atomic하게 만들어 주면 값이 일치하지 않는 문제를 해결해줄 수 있다. => synchronizing

