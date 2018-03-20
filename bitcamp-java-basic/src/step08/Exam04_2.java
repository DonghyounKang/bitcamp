//생성자 - 파라미터를 받는 생성자
package step08;

public class Exam04_2 {
    
    //Exam04_1 클래스조차도 기본 생성자가 자동으로 추가
    // 즉 다음의 생성자를 컴파일러가 자동으로 붙일 것이다.
    //Exam04_1(){}
    static class Score {
        String name;
        int kor;
        int eng;
        int math;
        int sum;
        float average;
        
        //생성자가 한개라도 있으면 컴파일러는 기본생성자를 만들어주지 않는다.
        Score(String name, int kor, int eng, int math) {
            System.out.println("Score(String, int, int, int) 호출");
            
            //파라미터로 받은 값을 새로 만든 인스턴스 변수에 저장
            // 이렇게 생성자는 새로 만든 인스턴스 변수를 초기화 시키는 일을 한다. 
            this.name = name;
            this.kor = kor;
            this.eng = eng;
            this.math = math;
            this.compute();
        }
        
        
        public void compute() {
            this.sum = this.kor + this.eng + this.math;
            this.average = this.sum/3f;
        }
    }
    
    public static void main(String[] args) {
        //Score 클래스에는 기본생성자가 없기 때문에 
        //아래는 컴파일 오류
        //Score s0 = new Score();//compile error
        
        //Score 인스턴스를 만든 후에는
        //생성자를 호출할 때 생성자가 원하는 값을 파라미터로 주어야 한다. 
        Score s1 = new Score("홍", 100 , 90 ,80);
        Score s2 = new Score("임", 98, 87, 76);
        
        //생성자에서 이미 계산을 완료
        //합계와 평균 계산하기 위해 따로 compute()호출 할 필요 없다.
        //이것이 생성자를 사용하는 이유
        //생성자를 사용하면 코드가 좀더 간결해진다.
        
        System.out.printf("%s, %d, %d, %d, %d, %.1f\n", 
                s1.name, s1.kor, s1.eng, s1.math, s1.sum, s1.average);
        
        System.out.printf("%s, %d, %d, %d, %d, %.1f\n", 
                s2.name, s2.kor, s2.eng, s2.math, s2.sum, s2.average);
                
    }

}

// 생성자
// => 인스턴스(객체)를 생성한 후에 사용하기 전에 유효한 값으로 초기화 시키는 작업을 수행
// 