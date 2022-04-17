package com.practice.controller;

import com.practice.dto.Person;
import org.springframework.web.bind.annotation.*;

@RestController
public class MainController {

    @GetMapping("/event/{person}")
    public String personPath(@PathVariable Person person) {
        return String.valueOf(person.getAge());
    }

    @GetMapping("/mainframe")
    @PostMapping("/mainframe")
    public String mainFrame(@RequestBody String body) {
        return body;
    }



}
