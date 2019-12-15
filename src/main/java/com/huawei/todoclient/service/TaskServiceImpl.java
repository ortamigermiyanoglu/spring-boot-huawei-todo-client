package com.huawei.todoclient.service;

import com.huawei.todoclient.model.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author sumutella
 * @time 11:14 AM
 * @since 12/14/2019, Sat
 */
@Service
public class TaskServiceImpl implements TaskService{

    private RestTemplate restTemplate = new RestTemplate();
    private final String restURI = "http://localhost:8082/api/v1/tasks/";



    @Override
    public List<Task> showAllTasks(Integer userId) {
        ResponseEntity<Task[]> tasks =restTemplate.getForEntity(restURI+"list/"+userId,Task[].class);
        return Arrays.asList(tasks.getBody());
    }

    @Override
    public Task saveTask(Task task) {
        ResponseEntity<Task> savedTask = restTemplate.postForEntity(restURI, task, Task.class);

        return savedTask.getBody();
    }
}
