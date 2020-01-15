package com.aydaa.lahsiv.personal.dto;

import lombok.Data;

@Data
public class MyInfo {

    String userName;

    String password;

    String name;

    String city;

    MyInfo() {

    }

    public MyInfo(String userName, String password, String name, String city) {
        this.userName = userName;
        this.password = password;
        this.name = name;
        this.city = city;
    }

}
