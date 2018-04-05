package bitcamp.java106.pms.dao;

import bitcamp.java106.pms.domain.Classroom;

public class ClassroomDao extends AbstractDao<Classroom> {
   
    public int indexOf (Object key) {
       for (int i = 0; i < collection.size(); i++) {
           int no = (Integer) key;
           Classroom classroom = collection.get(i);
           if (classroom.getNo() == no) {
               return i;
           }
       }
       return -1;
   }
    
}
//ver.20 클래스 추가




