package com.example.allinone;

import com.example.allinone.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Mithilesh
 */
@RestController
public class HelloController {
    @Autowired
    private HelloService helloService;
    
    @RequestMapping("/")
    public String home(){
        return helloService.message();
    }
    
    @PostMapping("/output")
    public String testMe(@RequestBody String ok){
        System.out.println("ok -"+ ok);
        return "mith";
    }
}
