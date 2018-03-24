package com.applicationspringboot.autoformation.service;

import com.applicationspringboot.autoformation.dao.Taskrepository;
import com.applicationspringboot.autoformation.modal.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class TaskService {
    @Autowired
    private final Taskrepository taskrepository;

    public TaskService(Taskrepository taskrepository) {
        this.taskrepository = taskrepository;
    }
    public List<Task> findAll(){
        List<Task> tasks =new ArrayList<>();
        for (Task task: taskrepository.findAll()) {
            tasks.add(task);
        }
        return tasks;

    }
    public void save(Task task){
    taskrepository.save(task);
    }
    public void delete(int id){
        taskrepository.deleteById(id);
    }
}
