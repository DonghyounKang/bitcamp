package step11.ex13;


public class Customer4 {
    //외부에서 인스턴스 변수에 직접 접근하지 못하도록 막는다.
    private String name;
    private int age;
    private int weight;
    private int height;
    
    //alt + shift + s
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public int getWeight() {
        return weight;
    }
    public void setWeight(int weight) {
        this.weight = weight;
    }
    public int getHeight() {
        return height;
    }
    public void setHeight(int height) {
        this.height = height;
    }
    
    
    // 실무에서는 셋터에 유효값을 검증하는 코드르 잘 넣지 않는다.
    // 따로 인스턴스 변수의 값을 검증하는 메서드르 추가하여 처리
    // 그래서 실무에서 셋터 메서드는 인스턴스 변수에 그냥 값을 넣는 경우가 많다.
    // 즉 인스턴스변수에 직접 값을 넣는 것과 동일하게 동작한다. 
    // 이런 상황 때문에 셋터, 겟터의 무용성을 주장하는 개발자들이 있다.
    // 그들은 인스턴스 변수에 접근 범위를 public으로 공개하여 사용할 것을 주장
    
    // 그러나 대부분의 개발자들은 메서드를 통해 변수의 값을 설정하는 방법을 선호
    // 나중에 메서드에 기타 코드를 추가할 경우를 대비하기 위함
    // 변수의 직접 사용시 변수를 제어하는 코드를 삽입하기 어렵다.
    
    /*
    // 인스턴스 변수 name값을 넣는 메서드
    public void setName(String name) {
            this.name = name;
    }
    
    // 인스턴스 변수 age에 값을 넣는 메서드
    // 나이 값이기 때문에 1~ 120
    public void setAge(int age) {
        this.age = age;
    }
    
    // 인스턴스 변수 weight에 값을 넣는 메서드
    // 몸무게는 0~ 200
    public void setWeight(int weight) {        
        this.weight = weight;
    }
    
    // 인스턴스 변수 height에 값을 넣는 메서드
    // 키이기 때문에 1~ 300
    public void setHeight(int height) {
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
    */
    
    
    
    
}
  