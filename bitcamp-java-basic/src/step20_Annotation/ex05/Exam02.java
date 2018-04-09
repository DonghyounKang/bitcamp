//Annotation property 배열 값 추출
package step20_Annotation.ex05;

public class Exam02 {
    public static void main(String[] args) {
        Class clazz = MyClass2.class;
        MyAnnotation2 obj = (MyAnnotation2) clazz.getAnnotation(MyAnnotation2.class);
        
        System.out.println(obj.v1()[0]);// 배열객체 주소의 0번째 값 
        System.out.println(obj.v2()[0]);
        System.out.println(obj.v3()[0]);
        
    }
}
