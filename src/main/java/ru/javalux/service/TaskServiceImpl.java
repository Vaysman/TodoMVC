package ru.javalux.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import ru.javalux.domain.Task;

import java.util.List;

@Component("taskService")
@Transactional
public class TaskServiceImpl implements TaskService {
    private final TaskRepository taskRepository;

    @Autowired
    public TaskServiceImpl(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    @Override
    public Task find(Long id) {
        return this.taskRepository.findOne(id);
    }

    @Override
    public List<Task> findAll() {
        return (List<Task>) this.taskRepository.findAll();
    }

    @Override
    public void save(Task task) {
        this.taskRepository.save(task);
    }
}
