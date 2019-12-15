package com.huawei.todoclient.service;

import com.huawei.todoclient.model.JwtRequest;
import com.huawei.todoclient.model.JwtResponse;
import com.huawei.todoclient.model.User;
import com.huawei.todoclient.model.UserRegister;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author sumutella
 * @time 10:27 AM
 * @since 12/14/2019, Sat
 */
@Service
public class UserServiceImpl implements UserService{

    private static final String restURI  = "http://localhost:8082/api/v1/users/";
    private RestTemplate restTemplate = new RestTemplate();


    @Override
    public ResponseEntity<UserRegister> saveUser(UserRegister userRegister) {
        ResponseEntity<UserRegister> savedUser =restTemplate.postForEntity(restURI+"save", userRegister, UserRegister.class);
        return savedUser;
    }

    @Override
    public ResponseEntity<JwtResponse> authenticate(JwtRequest jwtRequest) {
        ResponseEntity<JwtResponse> myToken =  restTemplate.postForEntity(restURI+"authenticate", jwtRequest, JwtResponse.class);
        return myToken;
    }

    @Override
    public ResponseEntity<User> findByUsername(String username) {
        return restTemplate.getForEntity(restURI+username,User.class);
    }

    @Override
    public ResponseEntity<User> findById(Integer userId) {
        return restTemplate.getForEntity(restURI+userId,User.class);
    }


}
