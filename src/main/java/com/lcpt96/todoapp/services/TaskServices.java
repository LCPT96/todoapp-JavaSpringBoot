package com.lcpt96.todoapp.services;

import com.lcpt96.todoapp.mappers.TaskInDTOToTask;
import com.lcpt96.todoapp.persistence.entities.Task;
import com.lcpt96.todoapp.persistence.repositories.TaskRepository;
import com.lcpt96.todoapp.services.dto.TaskInDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskServices {

    private final TaskRepository repository;
    private final TaskInDTOToTask mapper;

    public TaskServices(TaskRepository repository, TaskInDTOToTask mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    public Task createTask(TaskInDTO taskInDto) {
        Task task = mapper.map(taskInDto);
        return this.repository.save(task);
    }

    public List<Task> findAll() {
        return this.repository.findAll();
    }
}
