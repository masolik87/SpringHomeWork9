package ru.HomeWork5.HomeWork5.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.HomeWork5.HomeWork5.model.Task;
import ru.HomeWork5.HomeWork5.model.TaskStatus;

import java.util.List;

public interface TaskRepository extends JpaRepository<Task, Long> {
    List<Task> findAllByStatus(TaskStatus status);

}
