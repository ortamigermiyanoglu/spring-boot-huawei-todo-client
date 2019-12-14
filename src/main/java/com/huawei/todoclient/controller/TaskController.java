package com.huawei.todoclient.controller;

import com.huawei.todoclient.model.User;
import com.huawei.todoclient.service.TaskService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author sumutella
 * @time 11:14 AM
 * @since 12/14/2019, Sat
 */
@Controller
@RequestMapping("/user/")
public class TaskController {

    private final TaskService taskService;

    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }


    @RequestMapping("{userId}/tasks")
    public String showTasks(@PathVariable Integer userId, Model model){
        User  user = new User();
        user.setId(6);
        model.addAttribute("user", user);


        model.addAttribute("tasks", taskService.showAllTasks(userId));
        return "task/tasks-index";
    }

}
