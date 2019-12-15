package com.huawei.todoclient.model;

import lombok.*;

import java.io.Serializable;

/**
 * @author sumutella
 * @time 10:01 AM
 * @since 12/14/2019, Sat
 */
@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class BaseEntity implements Serializable {
    private Integer id;
}
