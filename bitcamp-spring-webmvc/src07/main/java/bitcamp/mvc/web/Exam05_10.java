// 요청 핸들러의 파라미터 - multipart/form-data 형식으로 넘어온 값꺼내기
package bitcamp.mvc.web;

import java.io.File;
import java.io.IOException;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

@Controller 
@RequestMapping("/exam05_10") 
@ResponseBody
public class Exam05_10 {

	// 멀티파트 형식으로 넘어온 데이터를 꺼낼때는 기존의 파라미터 변수를 선언하는 방식과 동일하다.
    
    // * 주의 *
    // 반드시 Spring WebMVC에 멀티파트 처리 객체를 등록해야한다.
    //
    //mvc-servlet.xml
    //
    //<bean id="multipartResolver"
    //  class="org.springframework.web.multipart.commons.CommonsMultipartResolver">
    //      <property name="maxUploadSize" value="50000000"/>
    //</bean>
    // 또한 그 객체가 의존하는 apache-commons-fileupload라이브러리도 추가해야한다.

    @Autowired ServletContext sc;
    
	// 테스트:
	// http://localhost:8888/bitcamp-spring-webmvc/exam05_10.html
    
    @PostMapping(value="m1", produces="text/plain;charset=UTF-8") 
    @ResponseBody
    public String m1(
            String name, // <input type="text"...>
            int age,  // <input type="number"...>
            MultipartFile photo  // <input type="file"...>
            ) throws Exception {
        String filepath = sc.getRealPath("/" + photo.getOriginalFilename());
        photo.transferTo(new File(filepath));
        return String.format("m1(): name=%s, age=%d, photo=%s", name, age, photo.getOriginalFilename());
    }

}