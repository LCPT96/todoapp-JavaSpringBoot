package com.lcpt96.todoapp.controllers;

import com.lcpt96.todoapp.persistence.entities.Task;
import com.lcpt96.todoapp.services.TaskServices;
import com.lcpt96.todoapp.services.dto.TaskInDTO;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/tasks")
public class TaskController {
    private final TaskServices taskServices;

    public TaskController(TaskServices taskServices) {
        this.taskServices = taskServices;
    }

    @PostMapping
    public Task createTask(@RequestBody TaskInDTO taskInDTO) {
        return this.taskServices.createTask(taskInDTO);
    }

    @GetMapping
    public List<Task> findAll() {
        return this.taskServices.findAll();
    }
}
