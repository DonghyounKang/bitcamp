package step25.ex04;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.Set;

public class Test {
    public static void main(String[] args) throws Exception {
        //1) program argument
        // > java -cp bin step25.ex04.Test aaa bbb ccc
        // args : aaa bbb ccc
        for(String arg : args) {
            System.out.println(arg);
        }
        System.out.println("---------------------");

        //2) system argument
        // > java -D키=값 -D키=값 ...step25.ex04.Test
        // => JVM property = 기본 properties + -D옵션으로 추가한 properties
        Properties jvmProps = System.getProperties();
        Set<Object> keySet = jvmProps.keySet();
        for(Object key : keySet) {
            System.out.printf("%s=%s\n",key,jvmProps.get(key));
        }
        System.out.println("---------------------");
        
        //3) Property File에서 읽어오기
        Properties fileProps = new Properties();
        fileProps.load(new FileInputStream("jdbc.properties"));
        keySet = fileProps.keySet();
        for(Object key : keySet) {
            System.out.printf("%s=%s\n",key,fileProps.get(key));
        }
        System.out.println("---------------------");

    }
}
