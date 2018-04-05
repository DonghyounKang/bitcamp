//디자인 패턴과 추상 클래스 - 템플릿 메서드 패턴
package step15.ex03;

//수퍼클래스에서 추상적으로 표현하고 서브클래스에서 구체적인 내용을 결정하는 설계 방식
// 즉, 수퍼 클래스에서 전체적인 논리 흐름을 정의 후
// 서브클래스에서 각 흐름에 따라 구체적인 동작을 정의한다. 
public abstract class Building {
    
    //다음과 같이 일반 메서드에서 전체적인 논리흐름(명령어처리의 흐름)을 정의한다.
    //서브클래스들은 이 메서드를 그대로 상속받기 때문에 재정의하지 않는 이상 
    // 모든 서브클래스들이 건물을 지을 때 동일한 방식으로 작업할 것이다.
    public void build() {
        System.out.println("건축 시작");
        startEffect();
        System.out.println("건축 완료");
        endEffect();
        
    }
    //템플릿 메서드
    // => 아직 구체적으로 어던 명령을 실행할지 정의되지 않은 상태
    //    즉, 틀만 갖춘 상태
    // => 추상메서드를 사용하여 템플릿 메서드를 선언한다.
    public abstract void startEffect();
    public abstract void endEffect();
}
