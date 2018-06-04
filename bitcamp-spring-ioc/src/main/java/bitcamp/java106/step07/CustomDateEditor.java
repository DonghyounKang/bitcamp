//사용자 정의 프로퍼티 에디터 만들기

package bitcamp.java106.step07;

import java.beans.PropertyEditorSupport;
import java.sql.Date;

//Property Editor만드는 방법
// => java.beans.PropetyEditor 인터페이스를 구현하면 된다.
// => 그러나 이 인터페이스 직접 구현시 많은 method를 모두 구현해야한다.
//    번거롭다
// => 그래서 자바는 PropetyEditor를 미리 구현한 PropertyEditorSupport라는 클래스를 제공한다.
//    따라서 인터페이스를 직접구현하지 말고 이 클래스를 상속받아서 사용

//1) java.beans.PropertyEditorSupports를 상속 받는다.
public class CustomDateEditor extends PropertyEditorSupport {

    //이 메서드는 Spring IOC Container가 String 타입의 프로퍼티 값을 다른 타입의 값으로 바꿀 때 호출하는 method
    @Override
    public void setAsText(String text) throws IllegalArgumentException {
        System.out.println("CustomDateEditor.setAsText() 호출");
        //parameter로 넘어온 String type의 property 값을
        //원하는 타입(java.sql.Date)의 값으로 바꿔 내부에 저장 
        // => 그러면 Spring IOC Container는 이 값을 꺼내서 객체에 주입할 것이다. 
        this.setValue(Date.valueOf(text));
    }
    // 언제 어떤 메서드가 호출되는지 확인하기 위해 상속받은 method를 overriding
    @Override
    public void setValue(Object value) {
        //이 메서드는 단지 호출되었을 때 표시하기 위해 overriding
        System.out.println("CustomDateEditor.setValue() 호출");
        super.setValue(value);//원래 하던 일을 수행
    }
    
    @Override
    public Object getValue() {
        //이 메서드는 단지 호출되었을 때 표시하기 위해 overriding
        System.out.println("CustomDateEditor.getValue() 호출");
        return super.getValue();//원래 하던 일을 수행
    }
}
