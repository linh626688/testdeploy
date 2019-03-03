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
        return "1196346994";
    }

    @RequestMapping(value = "/helloWorld", method = RequestMethod.GET)
    public String helloWorld (){
        return "1196346994";
    }


    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }
}