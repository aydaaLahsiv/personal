package com.aydaa.lahsiv.personal.controller;

import com.aydaa.lahsiv.personal.dto.MyInfo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/myinfo")
public class MyInfoController {


    @GetMapping
    public MyInfo getMyInfobyUserName(String userName) {
        MyInfo myInfo = new MyInfo("BobB", "Hcanciahn18anvkav", "Bob Johnson", "New York");

        return myInfo;
    }
}
