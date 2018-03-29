//Object 클래스의 메서드를 오버라이딩하기 - 2. hashcode()

package step11.ex12;

public class Exam02_2 {
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
        //인스턴스가 다르더라도 값이 같으면 같은 해시갑을 리턴하도록 오버라이딩
        @Override
        public int hashCode() {
            // 가장 간단한 방법: 모든 값을 문자열로 만들어 붙인다음에 
            //String 클래스에 있는 hashcode()를 사용
            // 왜? String 클래스에 있는 hashcode()는 문자열이 같은경우
            // 같은 해시값을 리턴하도록 오버라이딩 되어있기 때문
            String value = String.format("%s,%d,%d,%d,%d,%.1f",
                    this.name, this.kor,this.eng, this.math, this.sum, this.aver);
            return value.hashCode();
        }
    
    }
    
    public static void main(String[] args) {
        Score s1 = new Score("홍길동", 100, 100, 100);
        Score s2 = new Score("홍길동", 100, 100, 100);
        
      
        
        System.out.printf("%d, %d\n",s1.hashCode(),s2.hashCode());        
      
        
    }
}

