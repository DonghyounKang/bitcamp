//Building을 상속받아 startEffect와 endEffect를 구체화시킨다.
package step15.ex03;

public class Restaurant extends Building {
    @Override
    public void startEffect() {
        System.out.println("뚝딱");
        
    }
   @Override
    public void endEffect() {
       System.out.println("Wow");
        
   }
}
