package bitcamp.java106.pms.service;

import java.util.List;
import java.util.Map;

import bitcamp.java106.pms.domain.Photo;
import bitcamp.java106.pms.domain.PhotoBoard;

public interface PhotoService {
    List<Photo> listByGroup(Map<String, Object> map);
    List<Photo> listByDate(Map<String, Object> map);
    Photo listByOne(int no);
    void insert(PhotoBoard phoBoa, Photo[] photo);
    void update(PhotoBoard phoBoa);
    void delete(int no);
    
}
