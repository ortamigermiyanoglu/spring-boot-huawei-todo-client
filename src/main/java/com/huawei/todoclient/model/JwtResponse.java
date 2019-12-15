package com.huawei.todoclient.model;


import java.io.Serializable;

/**
 * @author sumutella
 * @time 2:27 PM
 * @since 12/14/2019, Sat
 */
public class JwtResponse implements Serializable {
    private String token;
    private static final long serialVersionUID = -8091879091924046844L;


    public JwtResponse() {
    }

    public JwtResponse(String token) {
        this.token = token;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}