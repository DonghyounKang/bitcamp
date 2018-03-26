package step11.ex13;


public class Customer3 {
    //외부에서 인스턴스 변수에 직접 접근하지 못하도록 막는다.
    private String name;
    private int age;
    private int weight;
    private int height;
    
    // 외부에서 인스턴스 변수의 직접 접근이 불가하므로 값을 넣거나 조회할 수 없다.
    // 그렇기 때문에 이를 가능하게 하는 수단/방법(method) 정의 할 것
    // 보통 메서드 명은 set으로 시작
    // => 이 메서드를 "셋터(setter)"라고 부른다.
    
    // 인스턴스 변수 name값을 넣는 메서드
    public void setName(String name) {
        
        //이 메서드에서 이름값이 유효한지 검사
        if(name == null) {
            this.name ="이름없음";
            return;
        }
        
        if(name.length() < 2) {
            this.name ="이름없음";
            return;
        }
        //이름은 최대 5자까지
        if(name.length() > 5) {
            this.name = name.substring(0, 5);
        } else {
            this.name = name;
        }
    }
    
    // 인스턴스 변수 age에 값을 넣는 메서드
    // 나이 값이기 때문에 1~ 120
    public void setAge(int age) {
        if(age < 1 || age > 120) {
            this.age = 0;
            return;
        }
        this.age = age;
    }
    
    // 인스턴스 변수 weight에 값을 넣는 메서드
    // 몸무게는 0~ 200
    public void setWeight(int weight) {
        if(weight < 1 || weight > 120) {
            this.weight = 0;
            return;
        }
        this.weight = weight;
    }
    
    // 인스턴스 변수 height에 값을 넣는 메서드
    // 키이기 때문에 1~ 300
    public void setHeight(int height) {
        if(height < 1 || height > 300) {
            this.height = 0;
            return;
        }
        this.height = height;
    }
    
    
    
    //외부에서 인스턴스 변수의값을 조회할 수 있는 메서드를 제공
    // => 보통 메서드의 이름을 get으로한다.
    // => 그래서 "겟터(getter)"라 부른다.
    public String getName() {
        return this.name;
    }
    
    public int getAge() {
        return this.age;
    }
    
    public int getWeight() {
        return this.weight;
    }
    
    public int getHeight() {
        return this.height;
    }
    
    
}
  