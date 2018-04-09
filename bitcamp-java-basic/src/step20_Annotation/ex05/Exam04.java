//Annotation property 지정한 배열값 추출
package step20_Annotation.ex05;

public class Exam04 {
    public static void main(String[] args) {
        Class clazz = MyClass4.class;
        MyAnnotation3 obj = (MyAnnotation3) clazz.getAnnotation(MyAnnotation3.class);
        
        System.out.println(obj.v1()[0]);// 배열객체 주소의 0번째 값 
        System.out.println(obj.v2()[0]);
        System.out.println(obj.v3()[0]);
        
    }
}
