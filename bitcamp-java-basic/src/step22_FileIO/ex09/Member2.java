package step22_FileIO.ex09;


// 인스턴스의 값을 바이트 배열로 자동 변환(Serialize)할 수 있도록 허가한다.
// => java.io.Serializable 인터페이스를 구현
// => Serializable 인터페이스는 아무런 메서드가 정의되어있지 않다.
// => 단지 Serialize를 활성화 시키는 기능을 수행
// => 이 이인터페이스를 구현한 객체 만 ObjectInput/OutputStream에서
//    입출력할 수 있다.
public class Member2 implements java.io.Serializable{
    String name;
    int age;
    boolean gender; //true: W / false: M
    
    //Exam02_4를 실행하기 전에 다음 변수를 추가하고 toString 수정
    String tel;
  

    @Override
    public String toString() {
        return "Member [name=" + name + ", age=" + age + ", gender=" + gender + ", tel=" + tel + "]";
    }
    
}
