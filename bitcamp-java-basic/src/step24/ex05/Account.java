package step24.ex05;

public class Account {
    String accountId;
    long balance;

    public Account(String accountId, long balance) {
        this.accountId = accountId;
        this.balance = balance; 

    }

    public long withdraw(long money) {
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

