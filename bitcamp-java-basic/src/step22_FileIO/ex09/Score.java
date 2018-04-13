package step22_FileIO.ex09;

import java.io.Serializable;

public class Score implements Serializable{

    private static final long serialVersionUID = 1L;
    
    //인스턴스 변수의 구분
    
    //1) 사용자가 입력한 값을 저장한 변수
    String name;
    int kor;
    int eng;
    int math;
    
    //2) 위의 변수를 계산하여 그 결과를 저장하는 변수
    // => 다른 인스턴스 변수의 값을 가지고 계산 결과를 저장하는 변수의 경우
    //    Serialize 대상에서 제외해야한다.
    // 왜? ==> 값의 왜곡을 막기 위함이다.
    // 그렇다면 sum, aver의 처리 방식
    // => serialize 데이터를 읽는 쪽에서 데이터를 다 읽은 후
    //    계산을 수행하여 값을 처리해야한다.
    //    그래야만 데이터 왜곡을 막을 수 있다.
    
    // * 데이터 왜곡?
    //   kor, eng, math에 저장된 값과
    //   sum, aver에 저장된 값이 일치하지 않는경우
    // 이런 변수들은 serialize 대상에서 제외해야하는데, 
    // 그 명령어가 "transient(일시적인)"이다.
    // serialize 되지 않도록 원래의 성질을 변경한다.
    // modifier: 원래의 성질을 틀어버림
    transient int sum;
    transient float aver;
    
    public Score() {
        System.out.println("Score()");
        
    }
    
    public void compute() {
        this.sum = this.kor + this.eng + this.math;
        this.aver = this.sum / 3f;
    }

    @Override
    public String toString() {
        return "Score [name=" + name + ", kor=" + kor + ", eng=" + eng + ", math=" + math + ", sum=" + sum + ", aver="
                + aver + "]";
    }
    
    
    
}
