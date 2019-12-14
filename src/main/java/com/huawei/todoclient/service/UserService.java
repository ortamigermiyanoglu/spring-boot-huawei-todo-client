package com.huawei.todoclient.service;

import com.huawei.todoclient.model.JwtRequest;
import com.huawei.todoclient.model.JwtResponse;
import com.huawei.todoclient.model.UserRegister;
import org.springframework.http.ResponseEntity;

/**
 * @author sumutella
 * @time 10:26 AM
 * @since 12/14/2019, Sat
 */
public interface UserService {
    ResponseEntity<UserRegister> saveUser(UserRegister userRegister);
    ResponseEntity<JwtResponse> authenticate(JwtRequest jwtRequest);

}
