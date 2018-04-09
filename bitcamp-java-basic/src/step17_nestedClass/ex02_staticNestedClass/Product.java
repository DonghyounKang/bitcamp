//static nested class 활용 예
package step17_nestedClass.ex02_staticNestedClass;

public class Product {
    public static final int COMPUTER_CPU = 1;
    public static final int COMPUTER_VGA = 2;
    public static final int COMPUTER_RAM = 3;
    public static final int COMPUTER_MOUSE = 4;
    public static final int COMPUTER_KEYBOARD = 5;

    public static final int APPLIANCE_TV = 10;
    public static final int APPLIANCE_AUDIO = 11;
    public static final int APPLIANCE_DVD = 12;
    public static final int APPLIANCE_VACUUMCLEANER = 13;
    
    public static final int BOOK_POEM = 100;
    public static final int BOOK_NOVEL = 101;
    public static final int BOOK_ESSAY = 102;
    public static final int BOOK_IT = 103;
    public static final int BOOK_LANG = 104;
    
    int category;
    String name;
    String maker;
    int price;
    
}