package ru.HomeWork5.HomeWork5.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import ru.HomeWork5.HomeWork5.model.Task;
import ru.HomeWork5.HomeWork5.model.TaskStatus;
import ru.HomeWork5.HomeWork5.repositories.TaskRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class TaskService {
    private final TaskRepository tasksRepository;

    public List<Task> getAllTasks() {
        return tasksRepository.findAll();
    }

    public Task addTask(Task task) {
        return tasksRepository.save(task);
    }

    public List<Task> getTasksByStatus(TaskStatus status) {
        return tasksRepository.findAllByStatus(status);
    }

    public Task updateTaskStatus(Long id) {
        Task task = tasksRepository.findById(id).orElse(null);
        if (task != null && !(task.getStatus().equals(TaskStatus.COMPLETED))) {
            task.setStatus(TaskStatus.values()[task.getStatus().ordinal() + 1]);
        }
        return tasksRepository.save(task);
    }

    public void deleteTaskById(Long id) {
        tasksRepository.deleteById(id);
    }
}
