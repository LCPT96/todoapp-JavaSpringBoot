package com.lcpt96.todoapp.persistence.repositories;

import com.lcpt96.todoapp.persistence.entities.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {
}
