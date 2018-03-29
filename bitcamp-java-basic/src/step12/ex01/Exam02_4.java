// java.util.ArrayList의 contains()의 동작원리 확인 

package step12.ex01;

import java.util.ArrayList;

public class Exam02_4 {
    
    //equals()를 오버라이딩한 경우
    static class Member {
        String name;
        int age;

        public Member(String name, int age) {
            this.name = name;
            this.age = age;
        
    }
    
    @Override
    public String toString() {
        return String.format("[%s, %d]",this.name, this.age);
        
    }
    

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Member other = (Member) obj;
        if (age != other.age)
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        return true;
    }

    public static void main(String[] args) {
        
        Member s1 = new Member("홍길동", 20);
        Member s2 = new Member("임꺽정", 30);
        Member s3 = new Member("유관순", 16);
        Member s4 = new Member("홍길동", 20);
        

        ArrayList list = new ArrayList();
        list.add(s1);
        list.add(s2);
        list.add(s3);
        print(list);
        

        System.out.println(list.contains(s4)); //false

    }

    static void print(ArrayList list) {
        for(int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + ", ");
        }
        System.out.println();
    }

    }
}

//Exam02_1과 Exam02_2내에서
// System.out.println(list.contains(s4)); 의 결과가 다르다!! (false / true)
// java.util.ArrayList에서는 s2와 s4가 같다고 나온다.
// s2와 s4는 인스턴스 주소는 다르지만 값이 같다.
// 
