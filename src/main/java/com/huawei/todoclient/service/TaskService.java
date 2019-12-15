package com.huawei.todoclient.service;

import com.huawei.todoclient.model.Task;

import java.util.List;

/**
 * @author sumutella
 * @time 11:13 AM
 * @since 12/14/2019, Sat
 */
public interface TaskService {
    List<Task> showAllTasks(Integer id);
    Task saveTask(Task task);
}
