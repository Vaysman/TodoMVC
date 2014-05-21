package ru.javalux.service;

import org.springframework.data.repository.CrudRepository;
import ru.javalux.domain.Task;

public interface TaskRepository extends CrudRepository<Task, Long> {
}
