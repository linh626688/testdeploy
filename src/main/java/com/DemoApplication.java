package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;
import org.springframework.stereotype.*;

@Controller
@SpringBootApplication
public class DemoApplication {

    @RequestMapping("/hello")
    @ResponseBody
    String home() {
        return "Hello World!";
    }

    @RequestMapping(value = "/helloWorld", method = RequestMethod.GET)
    public String helloWorld (){
        return "helloWorld";
    }


    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }
}