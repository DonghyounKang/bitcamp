//non-static nested class == inner class
package step17_nestedClass.ex03_nonStaticNestedClass;

public class Exam01 {

    int value;
    
    
    //인스턴스 메서드에서는 인스턴스 변수에 접근가능
    //인스턴스 메서드는 this라는 내장변수에 호출될때 넘겨 받은 인스턴스주소를 보관한다.
    
    public void setValue(int value) {
        this.value = value;
    }
    
    public int getValue() {
        return this.value;
    }
    
    public static void main(String[] args) {
        Exam01 obj = new Exam01();
        obj.setValue(100);
        
        System.out.println(obj.getValue());
        
    }
}
