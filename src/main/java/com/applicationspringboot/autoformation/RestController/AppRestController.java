package com.applicationspringboot.autoformation.RestController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class AppRestController {
    @GetMapping("/hello")
    public  String helloworld(){
        return "hello world!!!";
    }
}
