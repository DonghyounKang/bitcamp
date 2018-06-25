//람다(lambda) - argument로 람다 표현식 바로 사용하기
package step27;

public class Exam03 {
    static interface Player {
        void play();
    }
    
    static void testPlayer(Player player) {
        player.play();
    }

    public static void main(String[] args) {
        //간단한 인터페이스 구현체조차 다음과 같이 별도로 정의하여 사용하면 매우 불편하다.
        /*        
        Player player = new Player(){

            @Override
            public void play() {
                System.out.println("실행~");

            }
        };
        */
        //다음과 같이 argument 부분에 바로 익명클래스를 정의하면 코드를 해석하기 편하다
        testPlayer(new Player(){

            @Override
            public void play() {
                System.out.println("실행~");

            }
        });
        
        //람다 표현식도 argument 자리에 바로 넣으면 편하다
        testPlayer(() -> System.out.println("실행~"));
    }

}
