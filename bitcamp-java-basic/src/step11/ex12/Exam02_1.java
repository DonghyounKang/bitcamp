//Object 클래스의 메서드를 오버라이딩하기 - 2. hashcode

package step11.ex12;

public class Exam02_1 {
    static class Score{
        String name;
        int kor;
        int eng;
        int math;
        int sum;
        float aver;
        
        public Score(String name, int kor, int eng, int math) {
            this.name = name;
            this.kor = kor;
            this.eng = eng;
            this.math = math;
            this.sum = kor + eng + math;
            this.aver = this.sum / 3f;
            
        }
    }
    
    public static void main(String[] args) {
        Score s1 = new Score("홍길동", 100, 100, 100);
        Score s2 = new Score("홍길동", 100, 100, 100);
        
        //Object에서 상속받아 사용하는 hashcode()는
        // 기본적으로 인스턴스마다 고유의 값을 리턴
        // 주의!! 인스턴스 주소가 아니다!!
        // 그래서 다음 출력은 비록 같은 값을 가지고 있지만 인스턴스가 다르기 때문에 hashcode의 값이 다르다.
        
        System.out.printf("%d, %d\n",s1.hashCode(),s2.hashCode());        
      
        
    }
}

