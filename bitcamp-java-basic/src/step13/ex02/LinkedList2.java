//LinkedList에 generic 적용
package step13.ex02;


public class LinkedList2<E> {
    
    protected class Bucket { 
        public E value; 
        public Bucket next; 
        public Bucket prev; 
    }
    
    protected Bucket head; 
    protected Bucket tail; 
    
    public LinkedList2() {
        head = new Bucket();
        tail = head;
    }

    public void add(E value) {
        tail.value = value;
        
        Bucket bucket = new Bucket();
        tail.next = bucket;
        
        bucket.prev = tail;
        
        tail = bucket;
        
    }

    public E get(int i) {
        Bucket cursor = head;
        int count = 0;
        
        while (cursor != tail) {
            if (count == i) 
                return cursor.value;
            count++;
            cursor = cursor.next;
        }
        return null;
    }

    public int size() {
        Bucket cursor = head;
        int count = 0;
        
        while (cursor != tail) {
            count++;
            cursor = cursor.next;
        }
        return count;
    }

    public E remove(int i) {
        Bucket cursor = head;
        
        if (i == 0) {
            if (head == tail)
                return null;
            else {
                head = head.next;
                head.prev = null;
                return cursor.value;
            }
        }
        
        int count = 0;
        
        while (cursor != tail) {
            if (count == i) {
                cursor.prev.next = cursor.next;
                cursor.next.prev = cursor.prev;
                return cursor.value;
            }
            count++;
            cursor = cursor.next;
        }
        return null;
        
    }
    
    public void add(int i, E value) {
        Bucket cursor = head;
        int count = 0;
        
        while (cursor != tail) {
            if (count == i) {
                Bucket bucket = new Bucket();
                bucket.value = value;
                bucket.prev = cursor.prev;
                cursor.prev = bucket;
                bucket.next = cursor;
                
                if (bucket.prev != null) {
                    bucket.prev.next = bucket;
                } else { 
                    head = bucket;
                }
                return;
            }
            count++;
            cursor = cursor.next;
        }
        
        if (count == i) { 
            add(value);
        }
    }
    
    public E[] toArray(E[] arr) {
        Bucket cursor = head;
        int count = 0;
        
        while (cursor != tail) {
            arr[count++] = cursor.value;
            cursor = cursor.next;
        }
        return arr; // 받은 배열을 그대로 리턴(사용시 선택/ 쓰려면 쓰고 아님 말고)
    }
}








