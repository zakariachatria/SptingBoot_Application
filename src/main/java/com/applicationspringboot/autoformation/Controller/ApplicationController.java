package com.applicationspringboot.autoformation.Controller;

import com.applicationspringboot.autoformation.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ApplicationController {
    @Autowired
    private TaskService taskService;

    @GetMapping("/")
    public String home(){
        return "index";
    }
}
