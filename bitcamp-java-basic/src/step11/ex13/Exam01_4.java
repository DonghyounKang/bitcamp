// 캡슐화(encapsulation) - 셋터와 겟터

package step11.ex13;

public class Exam01_4 {
    
    public static void main(String[] args) {
        //환자 데이터 등록
        Customer4 c1 = new Customer4();
        
        //실무에서 만드는 setter는 보통 파라마터 값을 검증하지 않기 때문에
        //그냥 입력한 값 그대로 인스턴스 변수에 저장
        // 값을 꺼내 출력하면 입력된 값 그대로 출력
        c1.setName("홍길동");
        c1.setAge(300);
        c1.setWeight(70);
        c1.setHeight(-50);
        

        System.out.printf("%s, %d, %d, %d\n", c1.getName(), c1.getAge(), c1.getWeight(), c1.getHeight());
        
    }
}
