package com.applicationspringboot.autoformation.dao;

import com.applicationspringboot.autoformation.modal.Task;
import org.springframework.data.repository.CrudRepository;

public interface Taskrepository extends CrudRepository<Task,Integer> {
}
