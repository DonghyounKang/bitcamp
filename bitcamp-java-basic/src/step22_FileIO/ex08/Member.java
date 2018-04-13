package step22_FileIO.ex08;

import java.io.Serializable;

public class Member {
    String name;
    int age;
    boolean gender; //true: W / false: M
    
  

    @Override
    public String toString() {
        return "Member [name=" + name + ", age=" + age + ", gender=" + gender + "]";
    }
    
}
