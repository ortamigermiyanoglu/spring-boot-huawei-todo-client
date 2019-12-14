package com.huawei.todoclient.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author sumutella
 * @time 10:00 AM
 * @since 12/14/2019, Sat
 */
@Setter
@Getter
@ToString
public class UserRegister extends BaseEntity {
    private String username;
    private String password;
    private String fullName;
}
