// 패키지 클래스 - 이렇게 별도의 파일로 클래스를 정의한 클래스를 "패키지 클래스"
//즉 패키지에 직접 소속된 클래스라는 의미이다..
//이전에 만든 Score클래스는 main(){}블록안에 정의
//main(){} 블록안에 정의한 클래스는 해당 블록안에서만 사용할 수 있다.
//이렇게 별도의 파일로 정의한 클래스는 다른 클래스에서도 사용할 수 있다.
package step03;

public class Score{
    public String name;
    public int kor;
    public int eng;
    public int math;
    public int sum;
    public float aver;
}
//public - modifier : 원래의 특징을 바꾸는 특별한 명령어
//다른 파일에서도 접근 가능하도록 접근 범위를 바꾸는 것