package com.applicationspringboot.autoformation.service;

import com.applicationspringboot.autoformation.dao.Taskrepository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class TaskService {
    private final Taskrepository taskrepository;

    public TaskService(Taskrepository taskrepository) {
        this.taskrepository = taskrepository;
    }
}
