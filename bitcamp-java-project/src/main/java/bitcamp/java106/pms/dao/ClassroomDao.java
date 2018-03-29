package bitcamp.java106.pms.dao;

import bitcamp.java106.pms.domain.Classroom;
import bitcamp.java106.pms.util.ArrayList;

public class ClassroomDao {
    private ArrayList collection = new ArrayList();
    
    public void insert(Classroom classroom) {
        this.collection.add(classroom);
//        this.classrooms[this.classroomIndex++] = classroom;
    }

    private int count(String title) {
        
        int cnt = 0;
        for (int i = 0; i < collection.size(); i++) {
            Classroom classroom = (Classroom)collection.get(i);
            if(classroom.getTitle().toLowerCase().equals(title.toLowerCase())) {
                cnt++;
            }
        }
        return cnt;
    }
    
    public Classroom[] list(String title) {
        Classroom[] arr = new Classroom[this.count(title)];
        for (int i = 0, x = 0; i < collection.size(); i++) {
            Classroom classroom = (Classroom) collection.get(i);
            if(classroom.getTitle().toLowerCase().equals(title.toLowerCase())) {
                arr[x++] = classroom;
            }
        }
        return arr;
    }

    public Classroom get(int classroomNo) {
        int index = this.getClassroomIndex(classroomNo);
        if( index < 0) {
            return null;
        }
        return (Classroom)collection.get(index);
//        for (int i = 0; i < classroomIndex; i++) {
//            if(classrooms[i]== null) continue;
//            if(classrooms[i].getTeam().getName().toLowerCase().equals(title) &&
//                    classrooms[i].getNo()==classroomNo) {
//                return classrooms[i];
//            }
//        }
//        return null;
    }

    public void update(Classroom classroom) {
        int index = this. getClassroomIndex(classroom.getNo());
        if(index < 0)
            return;
        collection.set(index, classroom);
    }

    public void delete(int classroomNo) {
        int index = this. getClassroomIndex(classroomNo);
        if(index < 0)
            return;
        collection.remove(index);
    }

    
    private int getClassroomIndex(int classroomNo) {
        for (int i = 0; i < this.collection.size(); i++) {
            Classroom classroom = (Classroom) collection.get(i);
            if (classroom.getNo() == classroomNo) {
                return i;
        }
        }
        return -1;

    }

}

//
// ver 17 - 클래스 생성
// ver 16 - Classroom 인스턴스 변수를 직접 사용하는 대신 겟터, 셋터 사용
// ver 14 - ClassroomController로부터 데이터 관리 기능을 분리하여 ClassroomDao 생성.




