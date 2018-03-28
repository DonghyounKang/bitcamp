package step12.ex01;

public class ArrayList {
    protected static final int DEFAULT_CAPACITY = 5;
    // 상수 값으로 범위를 지정하여 유지보수가 쉽도록 한다.
    Object[] list;
    int cursor; //새로 삽입할 빈방을 가리킨다.
    
    public ArrayList() {
        // 자신의 다른 생성자를 호출할 수 있다.
        // => 생성자를 호출할 수 있는 경우
        //      1) new 명령을 사용하는 경우
        //      2) 생성자에서 다른 생성자를 호출할 때 
        //  그 이외에는 생성자를 호출할 수 없다.
        // 일반 메서드에서 생성자를 임으로 호출할 수 없다.
        // 다른 생성자를 호출할 때는 수퍼클래스의 생성자를 호출 할 수 없다.
        // => 둘 중 하나만 첫 문장으로 올 수 있다.
        //super();
        this(DEFAULT_CAPACITY);
    }
    
    public ArrayList(int capacity) {
        //super(); -> 항상 생성자에는 수퍼클래스의 기본 생성자를 호출하는 문장이 숨겨져있다.
        //            물론 개발자가 수퍼클래스의 생성자를 호출하겠다면 명시한다면
        //            당연히 자동으로 붙지 않는다.
        if(capacity < DEFAULT_CAPACITY) {
            list = new Object[DEFAULT_CAPACITY];
        } else {
            list = new Object[capacity];
        }
    }
    
    public void add(Object value) {
        list[cursor++] = value;
        
    }
    
    public Object get(int index) {
        return list[index];
        
    }
    
    public void set(int index, Object value) {
        list[index] = value;
    }
    
    // for(int i = index +1; i < cursor; i++) 
    //      arr[i-1] = arr[i];
    //  cursor--;
    
    public void delete(int index) {
        for(int i = index + 1; i < cursor; i++) {
            list[i-1] = list[i];
        }
         cursor--;   
    }
    
    public int size() {
        return cursor;
    }
    
}
