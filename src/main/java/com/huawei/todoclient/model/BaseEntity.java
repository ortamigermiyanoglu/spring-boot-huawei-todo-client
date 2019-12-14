package com.huawei.todoclient.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

/**
 * @author sumutella
 * @time 10:01 AM
 * @since 12/14/2019, Sat
 */
@Setter
@Getter
@ToString
public class BaseEntity implements Serializable {
    private Integer id;
}
