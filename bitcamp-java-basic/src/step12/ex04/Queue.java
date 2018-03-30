//Queue의 구현과 사용
package step12.ex04;

import step12.ex02.LinkedList;

public class Queue extends LinkedList {
    //맨 뒤에 값을 넣는다.
    public void offer(Object value) {
        this.add(value);
    }
    
    //맨앞의 값을 꺼낸다.
    public Object poll() {
        return this.remove(0);
    }
}
