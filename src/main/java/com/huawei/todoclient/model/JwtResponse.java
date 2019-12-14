package com.huawei.todoclient.model;

import java.io.Serializable;

/**
 * @author sumutella
 * @time 2:27 PM
 * @since 12/14/2019, Sat
 */
public class JwtResponse implements Serializable {
    private String jwttoken;

    public JwtResponse() {
    }

    public JwtResponse(String jwttoken) {
        this.jwttoken = jwttoken;
    }

    public String getJwttoken() {
        return jwttoken;
    }

    public void setJwttoken(String jwttoken) {
        this.jwttoken = jwttoken;
    }
}
