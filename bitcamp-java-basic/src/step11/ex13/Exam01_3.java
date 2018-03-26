// 캡슐화(encapsulation) - 셋터와 겟터

package step11.ex13;

public class Exam01_3 {
    
    public static void main(String[] args) {
        //환자 데이터 등록
        Customer3 c1 = new Customer3();
        
        //인스턴스 변수에 직접 접근 불가하기 때문에
        //메서드를 통해 값을 넣어야한다.
        // => Customer 메서드는 인스턴스 값을 설정하는 setter가 구비되어있다.
        c1.setName("홍길동");
        c1.setAge(300);
        c1.setWeight(70);
        c1.setHeight(-50);
        
        // 인스턴스변수에 직접 접근이 불가하기 때문에
        //겟터(getter)로 값을 불러온다.
        System.out.printf("%s, %d, %d, %d\n", c1.getName(), c1.getAge(), c1.getWeight(), c1.getHeight());
        
    }
}
