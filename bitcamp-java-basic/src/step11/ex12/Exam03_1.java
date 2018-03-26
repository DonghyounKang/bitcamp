//overriding - 응용 예
package step11.ex12;

public class Exam03_1 {
    
    
    
    static class Member /*extends Object*/{
        String name;
        int age;
        public Member(String name, int age) {
            this.name = name;
            this.age = age;
        }
        
    }
    
    public static void main(String[] args) {
        
        Member m1 = new Member("홍길동", 20);
        Member m2 = new Member("홍길동", 20);
        
        if (m1 == m2) {
            System.out.println("m1 == m2");
        } else {
            System.out.println("m1 != m2");
        }
        
        System.out.println(m1.equals(m2));
        // Member 클래스에것 equals를 적용한 적이 없다 -> 컴파일 오류가 발생하지 않는 이유 
        
        // => 클래스를 만들 때 수퍼 클래스를 지정하지 않으면
        //    자동으로 Object를 상속받게 된다.
        //    따라서 자바의 모든 클래스는 Object의 자손이다.
        // => 그래서 자바의 모든 클래스는 Object의 메서드를 사용할 수 있다.
        // => equals()는 Object로부터 상속받은 메서드 중 하나이다.
        
        //상속받은 메서드 중에서 equals()메서드를 살펴보자
        //equals()는 String 클래스에서 문자열 비교에 사용했던 메서드이다.
        //두 문자열의 인스턴스가 달라도 내용이 같은 경우 true리턴
        
        //위의 실행결과의 경우 비록 인스턴스는 다르지만 내용이 같기 때문에 true를 리턴할 것이라고 예상
        // 실제 리턴 값을 확인시 false 리턴
        
        //why?
        // => Object클래스에서 상속받아 쓰는 equals()의 경우 원래 내용물을 비교하는 것이 아닌
        //    인스턴스가 같은지를 비교하는 메서드이다.
        // => m1, m2인스턴스가 다르기 때문에 그 결과도 false
        
        //Member의 내용이 같은지 비교하고 싶은 경우
        // => 이럴 때 Overriding 사용
        // => Object로 부터 상속받은 메서드가 Member클래스와 맞지 않다.
        // => Member클래스에 맞게끔 재정의하면 되는 것이다.
        
        // Exam09_2
        
        //System.out.println(m1.toString());
        //System.out.println(m1.hashCode());
        
        
        
        
    }
}

// 추상화??
// 어떤 사물이나 개념을 데이터화 시키는 것
// 병원(환자) : 실체
// 병원관리 : 환자를 데이터화(이름, 나이, 병명 등...)

// Class를 통해 사용자 정의 데이터 타입을 만들고 추상화를 한다.
// 추상화를 기반으로 코드 재사용율을 높이고 효율적인 개발을 하기위해서 '상속'
// 상속
// 상위 개념은 하위 개념을 가리킬수 있다.(유연성)
// 
// 캡슐화
// 추상화가 무너지지 않게 접근을 제어한다.