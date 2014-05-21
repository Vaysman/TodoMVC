package ru.javalux.service;

import ru.javalux.domain.Task;

import java.util.List;


public interface TaskService {
    List<Task> findAll();

    Task find(Long id);
}


