package ru.HomeWork9.HomeWork9.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.HomeWork9.HomeWork9.model.Task;
import ru.HomeWork9.HomeWork9.model.TaskStatus;

import java.util.List;

public interface TaskRepository extends JpaRepository<Task, Long> {
    List<Task> findAllByStatus(TaskStatus status);

}
