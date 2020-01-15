package com.aydaa.lahsiv.personal.dto;

import lombok.Data;

import java.util.Date;

@Data
public class ToDo {

    String username;

    String title;
    String description;

    boolean notify;

    Date reminder;

    public ToDo(String username, String title, String description, boolean notify, Date reminder) {
        this.username = username;
        this.title = title;
        this.description = description;
        this.notify = notify;
        this.reminder = reminder;
    }


}
