//HashSet과 사용자 정의 데이터 타입
package step12.ex05;

import java.util.HashSet;

public class Exam03_1 {
    static class Member {
        String name;
        int age;
        
        public Member(String name, int age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public String toString() {
            return "Member [name=" + name + ", age=" + age + "]";
        }
        
        
    }
    public static void main(String[] args) {
        Member v1 = new Member("홍길동", 20);
        Member v2 = new Member("임꺽정", 30);
        Member v3 = new Member("유관순", 16);
        Member v4 = new Member("안중근", 40);
        Member v5 = new Member("유관순", 16);
        
        
        
        HashSet set = new HashSet();
        set.add(v1);
        set.add(v2);
        set.add(v3);
        set.add(v4);
        set.add(v5); 
        // 출력시 "유관순, 16" 데이터가 중복해서 저장되었음을 알수 있다.
        // 이유?
        // HashSet이 중복여부를 검사할 대 hashCode()와 equals()의 리턴값으로 판단
        //=> Member 클래스에서 hashCode()와 equals()를 오버라이딩 하지 않았기 때문에
        //   Object로 부터 상속받은 hasCode()와 equals를 그대로 사용하였고
        //   Object의 hashCode()는 인스턴스가 다르면 무조건 다른 해시값을 리턴
        //   Object의 equals()는 인스턴스 주소가 같은지 검사
        // 데이터가 같아도 인스턴스가 다르기때문에
        print(set);
        
        }
        
    static void print(HashSet set) {
        Object[] values = set.toArray();
        for(Object value : values) {
            System.out.println(value +", ");
        }
        System.out.println();
    }
}


















