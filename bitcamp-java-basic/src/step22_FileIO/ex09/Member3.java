package step22_FileIO.ex09;


// 인스턴스의 값을 바이트 배열로 자동 변환(Serialize)할 수 있도록 허가한다.
// => java.io.Serializable 인터페이스를 구현
// => Serializable 인터페이스는 아무런 메서드가 정의되어있지 않다.
// => 단지 Serialize를 활성화 시키는 기능을 수행
// => 이 이인터페이스를 구현한 객체 만 ObjectInput/OutputStream에서
//    입출력할 수 있다.
public class Member3 implements java.io.Serializable{
    
    //java.io.Serializable 인터페이스를 구현하는 모든 클래스는
    //반드시 시리얼 데이터의 버전을 식별할 번호를 지정해야 한다.
    // 버전 정보는 private static final long serialVersionUID 변수에 저장
    //만약 클래스에 그변수가 없다면 컴파일러가 자동부여한다.
    //
    private static final long serialVersionUID = 7L;
    
    String name;
    int age;
    boolean gender; //true: W / false: M
    
    //Exam03_2를 실행하기 전에 다음 변수를 추가하고 toString 수정
    String tel;
  

    @Override
    public String toString() {
        return "Member [name=" + name + ", age=" + age + ", gender=" + gender + ", tel=" + tel  + "]";
    }
    
}
