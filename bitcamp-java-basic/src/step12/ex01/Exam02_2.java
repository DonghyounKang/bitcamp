// java.util.ArrayList의 contains()와 hashCode(), equals()의 관계

package step12.ex01;

import java.util.ArrayList;

public class Exam02_2 {

    public static void main(String[] args) {
        String s1 = new String("aaa");
        String s2 = new String("bbb");
        String s3 = new String("ccc");
        String s4 = new String("bbb"); //s2 != s4
    
        ArrayList list = new ArrayList();
        list.add(s1);
        list.add(s2);
        list.add(s3);
        print(list);
        
        
        System.out.println(list.contains(s4)); //true
        
    }

    static void print(ArrayList list) {
        for(int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + ", ");
        }
        System.out.println();
    }
    
}

//Exam02_1과 Exam02_2내에서
// System.out.println(list.contains(s4)); 의 결과가 다르다!! (false / true)
// java.util.ArrayList에서는 s2와 s4가 같다고 나온다.
// s2와 s4는 인스턴스 주소는 다르지만 값이 같다.
// 
