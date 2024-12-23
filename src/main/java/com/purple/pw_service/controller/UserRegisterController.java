package com.purple.pw_service.controller;

import com.purple.pw_service.model.UserDetailModel;
import com.purple.pw_service.service.IUserDetailsService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
@RequestMapping(path ="/api/userDetails")
public class UserRegisterController {

    @Autowired
    IUserDetailsService userService;

    @PostMapping(path = "/userSignUp",produces = "application/json")
    public ResponseEntity<UserDetailModel> saveUserDetails(@RequestBody UserDetailModel model){
        return ResponseEntity.ok(userService.saveUserDetail(model));
    }

    @PostMapping(path = "/deleteUser/{displayName}",produces = "application/json")
    public void deleteUser(@PathVariable String displayName){
        userService.deleteUser(displayName);
    }
}
