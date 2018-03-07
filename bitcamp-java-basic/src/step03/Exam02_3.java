//클래스 - 레퍼런스 배열과 반복문 결합
package step03;

public class Exam02_3{
    public static void main(String[] args) {

        class Score{
            String name;
            int kor;
            int eng;
            int math;
            int sum;
            float aver;
        }

            // => 레퍼런스 배열 준비(인스턴스 배열이 아님)
            Score[] arr = new Score[3];
            
            //반복문을 이용하여 레퍼런스 배열의 인스턴스 주소를 저장
            for (int i =0; i < arr.length; i++){

                arr[i] = new Score();
            }

            //값은 일일이 지정
            arr[0].name = "홍길동";
            arr[1].name = "유관순";
            arr[2].name = "임꺽정";

            //반복문을 사용하면 배열의 인스턴스 값을 꺼내기 쉽다.
            for(int i = 0; i < arr.length; i++){

            System.out.printf("이름: %s\n", arr[i].name);
            }   
    }
}
/*
배열은 반복문과 함께 쓸 때 유용
*/