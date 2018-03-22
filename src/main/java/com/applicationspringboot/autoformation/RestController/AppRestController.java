package com.applicationspringboot.autoformation.RestController;

import com.applicationspringboot.autoformation.modal.Task;
import com.applicationspringboot.autoformation.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;


@RestController
public class AppRestController {
    @Autowired
    private TaskService taskService;
    @GetMapping("/hello")
    public  String helloworld(){
        return "hello world!!!";
    }
    @GetMapping("/allTasks")
    public String allTasks(){
        return taskService.findAll().toString();
    }

}
