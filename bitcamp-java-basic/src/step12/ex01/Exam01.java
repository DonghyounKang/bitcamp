package step12.ex01;

public class Exam01 {

    public static void main(String[] args) {
        //ArrayList list = new ArrayList(100);
        //list.ArrayList(4);
        //인스턴스주소로 생성자를 임의로 호출하는 것은 불가하다.
    
        ArrayList list = new ArrayList();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        list.add("ddd");
        
        print(list);
    }

    static void print(ArrayList list) {
        for(int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + ", ");
        }
        System.out.println();
    }
    
}
