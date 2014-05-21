package ru.javalux.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@Controller
public class Example {
    @Value("${application.message:Hello World}")
    private String message = "Hello, World!";

    @RequestMapping("/")
    String home(ModelMap model) {
        model.put("time", new Date());
        model.put("message", this.message);
        return "welcome";
    }
}
