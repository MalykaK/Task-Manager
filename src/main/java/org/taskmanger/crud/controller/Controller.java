package org.taskmanger.crud.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class Controller {

    @GetMapping("/task/add/{addtask}")
    public String boilWater(@PathVariable String addtask) {
        return "Your Task for the " + addtask + " is initiated ";
    }
    @GetMapping("task/update/{updateTask}")
    public String updateTask(@PathVariable String updateTask){
        return "The Temperature of the " +updateTask+ " is 100 Degrees.";
    }
    @GetMapping("/task/delete/{deleteTask}")
    public String deletetask(@PathVariable String deleteTask){
        return "Your task is Deleted. The " +deleteTask+ " is done";
    }
}
