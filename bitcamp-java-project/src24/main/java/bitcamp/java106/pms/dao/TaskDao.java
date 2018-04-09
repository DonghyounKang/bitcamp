
package bitcamp.java106.pms.dao;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.sql.Date;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import bitcamp.java106.pms.annotation.Component;
import bitcamp.java106.pms.domain.Member;
import bitcamp.java106.pms.domain.Task;
import bitcamp.java106.pms.domain.Team;

@Component
public class TaskDao extends AbstractDao<Task> {
    
    public TaskDao() throws Exception{
        load();
    }
    
    public void load() throws Exception {
        Scanner in = new Scanner(new FileReader("data/task.csv"));
        while (true) {
            // 저장된 데이터를 한 줄 읽는다.
            // 한 줄에 한 개의 게시물 데이터가 있다.
            // 데이터 형식은 다음과 같다.
            // "번호,제목,내용,등록일"
            //
            try {
                String[] arr = in.nextLine().split(",");
                Task task = new Task(null);
                task.setNo(Integer.parseInt(arr[0]));;
                task.setTitle(arr[1]);
                task.setStartDate(Date.valueOf(arr[2]));
                task.setEndDate(Date.valueOf(arr[3]));
                task.setState(Integer.parseInt(arr[4]));
                task.setTeam(new Team(arr[5]));
                task.setWorker(new Member(arr[6]));
                this.insert(task);
            } catch (Exception e) { // 데이터를 모두 읽었거나 파일 형식에 문제가 있다면,
                //e.printStackTrace();// exception error표시
                break; // 반복문을 나간다.
            }
        }
        in.close();
    }
    
    public void save() throws Exception {
        PrintWriter out = new PrintWriter(new FileWriter("data/task.csv"));
        
        Iterator<Task> tasks = this.list();
        
        // List에 보관된 데이터를 board.csv 파일에 저장한다.
        // 기존에 저장된 데이터를 덮어쓴다. 즉 처음부터 다시 저장한다.
        while (tasks.hasNext()) {
            Task task = tasks.next();
            out.printf("%d,%s,%s,%s,%d,%s,%s\n", task.getNo(), task.getTitle(), task.getStartDate(),
                    task.getEndDate(), task.getState(), task.getTeam().getName(), task.getWorker().getId());
        }
        out.close();
    }
    
    
    
    // 기존의 list() 메서드로는 작업을 처리할 수 없기 때문에 
    // 팀명으로 작업을 목록을 리턴해주는 메서드를 추가한다. 
    // => 오버로딩
    public Iterator<Task> list(String teamName) {
        ArrayList<Task> tasks = new ArrayList<>();
        for (Task task : collection) {
            if (task.getTeam().getName().equalsIgnoreCase(teamName)) {
                tasks.add(task);
            }
        }
        return tasks.iterator();
    }
    
    public int indexOf(Object key) {
        int taskNo = (Integer) key;
        for (int i = 0; i < collection.size(); i++) {
            Task task = collection.get(i);
            if (task.getNo() == taskNo) {
                return i;
            }
        }
        return -1;
    }
}

//ver 23 - @Component 애노테이션을 붙인다.
//ver 22 - 추상 클래스 AbstractDao를 상속 받는다.
//ver 19 - 우리 만든 ArrayList 대신 java.util.LinkedList를 사용하여 목록을 다룬다. 
//ver 18 - ArrayList 클래스를 적용하여 객체(의 주소) 목록을 관리한다.
// ver 17 - 클래스 생성





