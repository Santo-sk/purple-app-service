package com.purple.pw_service.controller;

import com.purple.pw_service.model.UserDetailModel;
import com.purple.pw_service.service.IUserDetailsService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
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

    @GetMapping(path = "/checkUserNameExist/{displayName}",produces = "application/json")
    public Boolean checkUserNameExist(@PathVariable String displayName){
        return userService.checkUserNameExist(displayName);
    }

    @GetMapping(path = "/checkMailExist/{mail}",produces = "application/json")
    public Boolean checkMailExist(@PathVariable String mail){
        return userService.checkMailExist(mail);
    }

    @GetMapping(path = "/checkContactNoExist/{contactNo}",produces = "application/json")
    public Boolean checkContactNoExist(@PathVariable String contactNo){
        return userService.checkContactNoExist(contactNo);
    }
}
