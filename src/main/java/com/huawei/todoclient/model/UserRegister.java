package com.huawei.todoclient.model;

import lombok.*;

/**
 * @author sumutella
 * @time 10:00 AM
 * @since 12/14/2019, Sat
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class UserRegister extends BaseEntity {
    private String username;
    private String password;
    private String fullName;
}
