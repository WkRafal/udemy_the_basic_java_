package com.example.SpringBoot001;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloExample {
    @RequestMapping("/")
    public String hello() {
        return "Hello World";
    }

    @RequestMapping("/greeting") //localhost:80808/greeting?name=Ania
    public String helloAgain(@RequestParam(value = "name",
            defaultValue = "User") String name) {
        return "Hello " + name;
    }
}
