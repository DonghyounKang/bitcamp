//IOC Container 객체를 저장할 때 클래스 이름으로 저장하기, 클래스 이름으로 객체 꺼내기/의존객체 자동으로 주입하기
package step19.ex07;

import java.io.File;
import java.util.List;

public class Exam10 {
    int value;
    
    public Exam10() {
        this.value = 200;
    }
    
    public void print() {
        System.out.printf("value = %d\n",this.value);
    }
    
    public static void main(String[] args) throws Exception {
        ApplicationContext8 appContext = new ApplicationContext8("step19.ex07");
        Exam10 obj = (Exam10) appContext.getBean("step19.ex07.Exam10");
        obj.print();
    }
}

//빈(bean)?
// => 인스턴스(instance), 객체(object)와 같은의미로 사용
// => 다만 자바문법에서 정한 나름의 규칙에 따라 만든 클래스의 인스턴스를 얘기한다.
// => 그러나 현업에서는 인스턴스 또는 객체와 같은 의미로 사용한다.
// = >bean = instance = object

//빈 컨테이너(bean container)?
// => 위의 ApplicationContext8과 같이 인스턴스를 생성, 보관하고 필요시 리턴해주는 
//    역할을 하는 객체를 말한다.
// => container는 객체의 '생성, 실행, 소멸' 즉 생명주기(Life-Cycle)를 관리한다.
// => 대표적 라이브러리 "Spring IOC Container""

//IOC Container(Inversion Of Control 컨테이너)?
//=> IOC컨테이너 = 빈 컨테이너(bean) + 의존 객체 자동 주입(Dependency Injection)
//