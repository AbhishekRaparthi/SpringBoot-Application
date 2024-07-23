package com.app.sb;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping(path="/start")
    public String getStarted(){
        return "Spring Boot is Working!";   
    }
}
