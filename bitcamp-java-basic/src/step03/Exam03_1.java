// 레퍼런스와 인스턴스 - 가비지
package step03;

public class Exam03_1{
    public static void main(String[] args) {

        class Score{
            String name;
            int kor;
            int eng;
            int math;
            int sum;
            float aver;
        }

            // Score 레퍼런스 선언
            Score s1;
            
            //인스턴스를 만들어 그 주소를 레퍼런스에 저장
            s1 = new Score();

            //새 인스턴스를 만들어 s1에 주소를 저장
            s1 = new Score();
            /*기존의 주소는 잃어 버린다
            주소를 잃어버려 사용할 수 없는 메모리를 "가비지(garbage)"라 부른다.

            가비지는 가비지 컬렉터에 의해 메모리에서 해제된다.
            가비지 컬렉터(Garbage collector)의 실행
            -메모리 부족
            -cpu가 한가할때
            -System.gc()를 호출하여 가비지 실행을 요청할때
             => 이경우에 바로 실행하는 것이 아닌 예약하는 것이다.
             빠른시간 내에 실행할 것을 종용하는것
             아무래도 원래의 시간보다는 앞당겨 청소하게 될 것이다.
            */
            

    }
}
/*

*/