package com.lunchapp.lunchgrouprandomizer.controller;

import com.lunchapp.lunchgrouprandomizer.dto.CreateUserCommand;
import com.lunchapp.lunchgrouprandomizer.dto.UserInfo;
import com.lunchapp.lunchgrouprandomizer.service.UserService;
import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api/user")
@Slf4j
public class UserController {


    private UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/registration")
    public ResponseEntity<UserInfo> createUser(@Valid @RequestBody CreateUserCommand command) {
        log.info("Creating User with dto command...");
        UserInfo userInfo = userService.userCreator(command);
        log.info("User created successful!");
        return new ResponseEntity<>(userInfo, HttpStatusCode.valueOf(201));
    }

}
