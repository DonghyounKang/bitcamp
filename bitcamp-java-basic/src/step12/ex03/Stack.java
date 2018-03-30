//Stack
package step12.ex03;

import step12.ex02.LinkedList;

public class Stack extends LinkedList {
    
    public void push(Object value) {
        this.add(value);
    }
    
    public Object pop() {
        if(this.head == this.tail) 
            return null;
            
            Bucket removedBucket = this.tail.prev;
            //Bucket 객체의 접근제한자의 범위를 변경하여 사용할 수 있도록 처리
            if (this.tail.prev.prev != null) {              // 리스트에서 중간 Bucket제거할 때
                this.tail.prev.prev.next = tail; 
                this.tail.prev = this.tail.prev.prev;
            } else {                                        //리스트에서 맨 처음 Bucket을 제거할 때
               this.head = this.tail; 
               this.head.prev = null;
            }
            return removedBucket.value;
            //처음부터 맨 끝까지 반복문 반복 후 처리 -> 메모리 낭비
            //LinkedList의 tail활용
    }
    
}
