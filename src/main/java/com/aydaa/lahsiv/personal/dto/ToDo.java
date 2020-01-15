package com.aydaa.lahsiv.personal.dto;

import java.util.Date;

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

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isNotify() {
        return notify;
    }

    public void setNotify(boolean notify) {
        this.notify = notify;
    }

    public Date getReminder() {
        return reminder;
    }

    public void setReminder(Date reminder) {
        this.reminder = reminder;
    }
}
