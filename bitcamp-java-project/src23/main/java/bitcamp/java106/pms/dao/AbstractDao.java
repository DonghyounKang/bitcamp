//generalization(Inheritance), abstractClass, generic(타입파라미터 변수 E), abstractMethod 적용
package bitcamp.java106.pms.dao;

import java.util.Iterator;
import java.util.LinkedList;

public abstract class AbstractDao<E> {// 무슨 타입을 받아서 사용할 지 정해지지 않은 상태 'E'라 선언
    protected LinkedList<E> collection = new LinkedList<>(); //접근 범위 -> sub클래스에 직접 Access
    
    public void insert(E value) {
        collection.add(value);
    }
    
    /*public Object[] list() {
        return collection.toArray();
    }*/
    
    public Iterator<E> list() {
        return collection.iterator();
    }
    
    
    public E get(Object key) {
        int index = this.indexOf(key);
        if(index == -1)
            return null;
        return collection.get(index);
    }
    
    public void update(int index, E value) {
        collection.set(index, value);
    }
    
    public  void delete(Object key) {
        int index = this.indexOf(key);
        if(index == -1)
            return;
        collection.remove(index);
       
    }
    
    
    //subclass 생성시 반드시 다음 메서드를 정의할 것을 강제
    //왜냐하면 이 메서드는 get(), update(), delete()에서 사용하기 때문에
    //반드시 정의되어 있어야 한다. 
    public abstract int indexOf(Object key); // 찾는 방법이 다르기 때문에 추상메서드 사용(member는 id, team은 name, board는 no, 등등..)
    
}
