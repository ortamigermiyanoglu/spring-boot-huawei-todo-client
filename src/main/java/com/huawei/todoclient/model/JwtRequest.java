package com.huawei.todoclient.model;

import lombok.*;

import java.io.Serializable;

/**
 * @time 2:21 PM
 * @since 12/14/2019, Sat
 */
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class JwtRequest implements Serializable {

    private String username;

    private String password;

}