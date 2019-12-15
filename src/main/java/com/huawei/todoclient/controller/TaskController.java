package com.huawei.todoclient.controller;

import com.huawei.todoclient.model.Task;
import com.huawei.todoclient.model.User;
import com.huawei.todoclient.service.TaskService;
import com.huawei.todoclient.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @time 11:14 AM
 * @since 12/14/2019, Sat
 */
@Controller
@RequestMapping("/user/")
public class TaskController {

    private final TaskService taskService;
    private final UserService userService;

    public TaskController(TaskService taskService, UserService userService) {
        this.taskService = taskService;
        this.userService = userService;
    }


    @RequestMapping("{userId}/tasks")
    public String showTasks(@PathVariable Integer userId, Model model){
        User  user = new User();
        user.setId(6);
        model.addAttribute("user", user);


        model.addAttribute("tasks", taskService.showAllTasks(userId));
        return "task/tasks-index";
    }

    @RequestMapping("{userId}/tasks/add")
    public String addTask(@PathVariable Integer userId, Model model){
        User  user = userService.findById(userId).getBody();
        model.addAttribute("user", user);
        Task task = new Task();
        task.setUser(user);
        model.addAttribute("task", task);
        return "task/task-form";
    }

    @RequestMapping("{userId}/tasks/save")
    public String saveTask(@PathVariable Integer userId, @ModelAttribute Task task, Model model){
        Task savedTask = taskService.saveTask(task);
        System.out.println(savedTask.getUser().getId());


        return "redirect:/user/"+savedTask.getUser().getId()+"/tasks";
    }


}
