package ru.javalux.service;

import ru.javalux.domain.Task;

import java.util.List;


public interface TaskService {
    Task find(Long id);

    List<Task> findAll();

    void save(Task task);
}


