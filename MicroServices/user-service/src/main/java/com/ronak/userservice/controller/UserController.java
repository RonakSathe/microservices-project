package com.ronak.userservice.controller;

import com.ronak.userservice.VO.ResponseTemplateVO;
import com.ronak.userservice.entity.User;
import com.ronak.userservice.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
@Slf4j
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/")
    public User saveUser(@RequestBody User user){
        log.info("saveUser from UserController");
        return userService.saveUser(user);
    }

    @GetMapping("/{id}")
    public ResponseTemplateVO getUserWithDepartment(@PathVariable("id") Long userId){
        log.info("getUserWithDepartment from UserController");
        return userService.getUserWithDepartment(userId);
    }
}
