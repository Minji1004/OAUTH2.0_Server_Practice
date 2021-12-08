package com.example.oauth.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RequiredArgsConstructor
@Controller
@RequestMapping("/oauth/user")
public class UserApiController {


    @PostMapping("/")
    public String createUser(@RequestBody String user) {
        return "";
    }
}
