//java.util.ArrayList 적용  제작한 ArrayList와 비교

package step12.ex01;

import java.util.ArrayList;

public class Exam01_2 {

    public static void main(String[] args) {

        ArrayList list = new ArrayList();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        list.add("ddd");
        
        print(list); // aaa, bbb, ccc, ddd
        
        list.remove(2);
        print(list); // aaa, bbb, ddd
        
        list.remove(0);
        print(list); // bbb, ddd
        
        //유효한 인덱스가 아니면 예외발생
        //list.remove(4); // 실행오류
        //print(list);
        
        list.add(1,"xxx"); // bbb, xxx, ddd
        list.add(1,"yyy"); // bbb, yyy, xxx, ddd
        list.add(0, "zzz"); // zzz, bbb, yyy, xxx, ddd,
        list.add(5, "ttt"); // zzz, bbb, yyy, xxx, ddd, ttt
        
        print(list);
        
        list.set(1, "aaa"); // zzz, aaa, yyy, xxx, ddd, ttt
        
        print(list);
        
        list.add("ccc"); // zzz, aaa, yyy, xxx, ddd, ttt, ccc
        list.add("eee"); // zzz, aaa, yyy, xxx, ddd, ttt, ccc, eee
        
        print(list);
    }

    static void print(ArrayList list) {
        for(int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + ", ");
        }
        System.out.println();
    }
    
}
