//non-static nested class == inner class 객체 사용
package step17_nestedClass.ex03_nonStaticNestedClass;

import step17_nestedClass.ex03_nonStaticNestedClass.ArrayList.MyIterator;

public class Exam04 {

    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("홍길동");
        list.add("유관순");
        list.add("임꺽정");
        
        //ArrayList가 보유한 inner클래스의 객체를 얻는다.
        //list객체가 MyIterator를 낳는다.
        //그래서 MyIterator는 list객체를 알고 있다.
        // 즉 MyIterator를 통해 list에 저장된값을 꺼내보자
        MyIterator iterator = list.iterator();
        
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
