package ru.javalux.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import ru.javalux.domain.Task;
import ru.javalux.service.TaskService;

import java.util.List;

@Controller
@RequestMapping("/tasks")
public class TaskController {
    @Autowired
    private TaskService taskService;

    @RequestMapping(value = "/new", method = RequestMethod.GET)
    public String getNewForm(ModelMap model) {
        List<Task> tasks = this.taskService.findAll();
        model.put("tasks", tasks);
        return "index";
    }

    @RequestMapping(method = RequestMethod.GET)
    public String showAllTask(ModelMap model) {
        List<Task> tasks = this.taskService.findAll();
        model.put("tasks", tasks);
        return "index";
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public String showTask(@PathVariable Long id, ModelMap model) {
        Task task = this.taskService.find(id);
        model.put("task", task);
        return "show";
    }
}
