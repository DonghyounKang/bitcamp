//Wrapper 클래스
package step10;

public class Exam02_1 {
    public static void main(String[] args) {
        /*자바는 primitive data type의 값을 기본연산자 외에 
                    좀 더 다양한 방법으로 다루기 위해 primitive data type에 
                    대응하는 클래스를 제공*/
        
        Byte b = new Byte((byte)100);                     
        Short s = new Short((short)20000);          //-> byte
        Integer i = new Integer(30000000);          //-> short
        Long l = new Long(600000000000L);           //-> long
        Float f = new Float(3.14f);                 //-> float
        Double d = new Double(3.14159);             //-> double
        Boolean bool = new Boolean(true);           //-> boolean
        Character c = new Character((char) 0x41);   //-> char
        
        /*
         *이렇게 primitive data type에 대응하여 만든 클래스를
         *primitive data를 포장하는 객체라고 하여 
         * "wrapper"클래스라고 부른다.
         */
        
        /*
         * primitive data type의 값을 객체에 담아 전달하고 싶다면
         * 언제든 wrapper클래스의 인스턴스를 만들면 된다.
         */
    }
}
