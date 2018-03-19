//클래스 변수와 인스턴스 변수 응용
package step08;

public class Exam01_5 {
    static class Student{
        //모든 인스턴스가 공유하는 값은 클래스 변수를 사용한다.
        static int count; 
        
        //인스턴스마다 개별적으로 관리해야 할 값은 인스턴스 변수에 저장한다.
        String name;
        int age;
    }
    
    public static void main(String[] args) {
        Student.count = 0;
        
        Student s1 = new Student();
        s1.name = "홍길동";
        s1.age = 10;
        Student.count ++;
        
        Student s2 = new Student();
        s2.name = "임꺽정";
        s2.age = 20;
        Student.count ++;
        
        Student s3 = new Student();
        s3.name = "유관순";
        s3.age = 30;
        Student.count ++;
        
        System.out.printf("%d, %s, %d\n", Student.count, s1.name, s1.age);
        System.out.printf("%d, %s, %d\n", Student.count, s2.name, s2.age);
        System.out.printf("%d, %s, %d\n", Student.count, s3.name, s3.age);
        
        //인스턴스 주소를 통해 클래스 변수를 사용할 수는 있다.
        // => 인스턴스에 count 변수가 없으면 클래스에서 찾기 때문
        // => but 이렇게 사용하면 안됨 => 다른 개발자가 코드를 본다면 count를 인스턴스 변수로 착각 -> 바람직한 작성법이 아니다.
        // "클래스 변수는 클래스 이름을 사용하여 접근하라."
        /*
        System.out.println(s1.count);//문법적 오류는 없지만 사용지양
        System.out.println(s2.count);
        System.out.println(s3.count);
        */
    }
}
