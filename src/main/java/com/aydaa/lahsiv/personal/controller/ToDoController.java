package com.aydaa.lahsiv.personal.controller;

import com.aydaa.lahsiv.personal.dto.ToDo;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/todo")
public class ToDoController {

    @ResponseStatus(value = HttpStatus.OK)
    @GetMapping(value = "/{username}")
    public List<ToDo> getListOfTodos(@PathVariable("username") String user) {
        List<ToDo> toDos = new ArrayList<>();
        toDos.add(new ToDo("bobB", "Remind to Remind", "Remind me to Remind to put a reminder", false, new Date()));
        toDos.add(new ToDo("bobB", "Remind to Remind2", "Remind me to Remind to put a reminder2", false, new Date()));
        return toDos;
    }
}
