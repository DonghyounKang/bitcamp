package bitcamp.java106.pms.dao;

import bitcamp.java106.pms.domain.Board;

public class BoardDao extends AbstractDao<Board> {
    
    public int indexOf(Object key) {
        
        /*Integer intObj = (Integer)key;
        int no = intObj.intValue();*/
        
        int no = (Integer) key; //Integer ==> int : autoUnboxing  -< ((Integer) key).intValue(); >- primitive type이므로 autoUnboxing적용
        for (int i = 0; i < collection.size(); i++) {
            Board originBoard = collection.get(i);
            if (originBoard.getNo() == no) {
                return i;
            }
        }
        return -1;
    }
}

//ver 22 - 추상 클래스 AbstractDao를 상속 받는다.

//ver 18 - LinkedList를 이용하여 인스턴스(의 주소) 목록을 다룬다. 
// ver 16 - 인스턴스 변수를 직접 사용하는 대신 겟터, 셋터 사용.
// ver 14 - BoardController로부터 데이터 관리 기능을 분리하여 BoardDao 생성.




