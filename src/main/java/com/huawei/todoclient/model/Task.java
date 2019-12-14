package com.huawei.todoclient.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * @author sumutella
 * @time 10:00 AM
 * @since 12/14/2019, Sat
 */
@Getter
@Setter
@NoArgsConstructor
@ToString
public class Task extends BaseEntity {
    private String name;
    private User user;
}
