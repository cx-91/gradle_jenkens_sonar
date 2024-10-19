package com.gradleapp.gradle_jenkins_sonar.hello;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("hello")
public class helloWorld {
    @GetMapping("/hi")
    public String index() {
        return "hello 1";
    }
}
