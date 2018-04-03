package bitcamp.java106.pms.dao;

import java.util.LinkedList;

import bitcamp.java106.pms.domain.Classroom;

public class ClassroomDao {
    private LinkedList<Classroom> collection = new LinkedList<>();
    
    public void insert(Classroom classroom) {
        this.collection.add(classroom);
    }
    
    public Classroom[] list() {
        Classroom[] arr = new Classroom[this.collection.size()]; //(값을 넣을 수 있는 빈 )배열을 만들어서
        return this.collection.toArray(arr); // toArray()를 통해 그 배열에 값을 넣는다. & 리턴
    }
    
   public Classroom get(int classoomNo) {
        int index = this.getClassroomIndex(classoomNo);
        if (index < 0) 
            return null;
        return collection.get(index);
    }
   
   private int getClassroomIndex(int classroomNo) {
       for (int i = 0; i < collection.size(); i++) {
           if (collection.get(i).getNo() == classroomNo) {
               return i;
           }
       }
       return -1;
   }
    
    public void update(Classroom classroom) {
        int index = this.getClassroomIndex(classroom.getNo());
        if (index < 0) 
            return;
        collection.set(index, classroom);
    }
    
    
   public void delete(int classNo) {
        int index = this.getClassroomIndex(classNo);
        if (index < 0) 
            return;
        collection.remove(index);
    }
    
}
//ver.20 클래스 추가




