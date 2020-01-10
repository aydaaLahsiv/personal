package com.aydaa.lahsiv.personal.dto;

public class MyInfo {

    String userName;

    String password;

    String name;

    String city;

    public MyInfo(String userName, String password, String name, String city) {
        this.userName = userName;
        this.password = password;
        this.name = name;
        this.city = city;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
