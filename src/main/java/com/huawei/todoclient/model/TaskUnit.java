package com.huawei.todoclient.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

/**
 * @author sumutella
 * @time 10:00 AM
 * @since 12/14/2019, Sat
 */
@Getter
@Setter
@NoArgsConstructor
@ToString
public class TaskUnit extends BaseEntity {
    private String name;
    private String description;
    private Date deadline;
    private String status;

    private TaskUnit task;
}
