
package  com.rest.clientrest.controller;

import com.rest.clientrest.model.Greetting;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController 
@RequestMapping(value = "/gretting")
public class GrettingController {
    

    @GetMapping
    public  ResponseEntity<String> olaDev(){
        
        Greetting gretting = new Greetting();
       
          return ResponseEntity.ok(gretting.getSaudacao());
     
    }

    @PostMapping("/")
    public ResponseEntity<String> saveNumber() {
        
        return null;
    }

}
      
     