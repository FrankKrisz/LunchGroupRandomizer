package com.lunchapp.lunchgrouprandomizer.controller;

import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;
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

    @PostMapping
    public ResponseEntity<UserInfo> createDwarf(@Valid @RequestBody CreateUserCommand command) {
        log.info("Creating User with dto command...");
        UserInfo userfInfo = userService.userCreator(command);
        log.info("Dwarf created successful!");
        return new ResponseEntity<>(userInfo, HttpStatusCode.valueOf(201));
    }

}
