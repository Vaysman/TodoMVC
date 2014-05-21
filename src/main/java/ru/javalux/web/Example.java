package ru.javalux.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.javalux.domain.Task;
import ru.javalux.service.TaskService;

import java.util.Date;
import java.util.List;

@Controller
public class Example {
    @Value("${application.message:Hello World}")
    private String message = "Hello, World!";

    @Autowired
    private TaskService taskService;

    @RequestMapping("/")
    String home(ModelMap model) {
        List<Task> tasks = this.taskService.findAll();
        model.put("time", new Date());
        model.put("message", this.message);
        model.put("tasks", tasks);
        return "welcome";
    }
}
