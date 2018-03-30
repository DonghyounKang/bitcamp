//java.util.Hashset 클래스 사용 - 중복저장 불가
package step12.ex05;

import java.util.HashSet;

public class Exam01_1 {
    public static void main(String[] args) {
    String v1 = new String("aaa");
    String v2 = new String("bbb");
    String v3 = new String("ccc");
    String v4 = new String("ddd");
    String v5 = new String("ccc");
    
    
    HashSet set = new HashSet();
    set.add(v1);
    set.add(v2);
    set.add(v3);
    set.add(v4);
    set.add(v5); 
    // 비록 v5와 v3는 다른 인스턴스지만
    // 두객체의 문자열  값이 같기 때문에
    // String 클래스는 인스턴스가 다르더라도 값이 같으면 
    // hashCode()의 리턴값이 같도록 오버라이딩 하였다.
    // 또한 equals()의 리턴값도 true가 되도록 오버라이딩하였다.
    
    // HashSet은 값의 중복을 검사할 때 인스턴스의 주소를 비교하지않고
    // hashCode()와 equals()의 리턴값으로 판단
    // 따라서 v5는 v3와 다른 인스턴스이지만 
    // hashCode()와 equals()의 리턴값이 같고 true가 나오기 때문에
    // 같은 값으로 간주하여 중복 저장하지 않는다.
    
    // 결론!
    // v5는 추가되지 않는다.
    print(set);
    
    }
    
    static void print(HashSet set) {
        Object[] values = set.toArray();
        for(Object value : values) {
            System.out.print(value +", ");
        }
        System.out.println();
    }
}


















