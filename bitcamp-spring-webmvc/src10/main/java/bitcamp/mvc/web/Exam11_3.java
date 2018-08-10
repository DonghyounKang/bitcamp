// 파일 업로드 - JSON
package bitcamp.mvc.web;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import net.coobird.thumbnailator.Thumbnails;
import net.coobird.thumbnailator.name.Rename;

@RestController 
@RequestMapping("/adfile") 
public class Exam11_3 {
    
    @Autowired ServletContext sc;
        
    @PostMapping("upload")
    public Object upload02(
            MultipartFile[] files) {
        
        String filesDir = sc.getRealPath("/files");

        ArrayList<Map<String,Object>> jsonDataList = new ArrayList<>();
        
        for (int i = 0; i < files.length; i++) {
            HashMap<String,Object> jsonData = new HashMap<>();
            String filename = UUID.randomUUID().toString();
            jsonData.put("filename", filename);
            jsonData.put("filesize", files[i].getSize());
            jsonData.put("originname", files[i].getOriginalFilename());
            try {
                File path = new File(filesDir + "/" + filename);
                System.out.println(path);
                files[i].transferTo(path);
                jsonDataList.add(jsonData);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return jsonDataList;
    }
}







