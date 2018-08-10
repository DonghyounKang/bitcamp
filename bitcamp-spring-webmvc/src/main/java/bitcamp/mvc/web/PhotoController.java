package bitcamp.java106.pms.web.json;

import java.io.File;
import java.util.UUID;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import bitcamp.java106.pms.domain.Photo;
import bitcamp.java106.pms.domain.PhotoBoard;
import bitcamp.java106.pms.service.PhotoService;
import net.coobird.thumbnailator.Thumbnails;

@RestController
@RequestMapping("/photo")
public class PhotoController {
    
    @Autowired ServletContext sc;
    PhotoService photoService;
    
    public PhotoController(PhotoService photoService) {
        this.photoService = photoService;
    }
    
    @RequestMapping("add")
    @ResponseStatus(HttpStatus.CREATED)
    public void add(String title, MultipartFile[] files) throws Exception {
        
        String filesDir = sc.getRealPath("/files");
        PhotoBoard phoBoa = new PhotoBoard();
        phoBoa.setTitle(title);
        
        Photo[] photos = new Photo[files.length];
         
        for (int i = 0; i  < files.length; i++) {
            Photo photo = new Photo();
            String filename = UUID.randomUUID().toString();
            
            
            try {
                File path = new File(filesDir + "/" + filename);
                files[i].transferTo(path);
                
                String mainthumPho = path.getCanonicalPath() + "_100x100";
                Thumbnails.of(path)
                .size(100, 100)
                .outputFormat("jpg")
                .toFile(mainthumPho);
                
                String onethumPho = path.getCanonicalPath() + "_150x150";
                Thumbnails.of(path)
                .size(150, 150)
                .outputFormat("jpg")
                .toFile(onethumPho);
                
                photo.setMainThum(mainthumPho);
                photo.setViewThum(onethumPho);
                
                
            } catch (Exception e) {
                e.printStackTrace();
            }
            photos[i] = photo;
        }
        photoService.insert(phoBoa, photos);
          
    }
}
