package com.org.controller;

import com.org.bean.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName HelloController
 * @Description TODO
 * @Author snayi
 * @Date 2021/6/21 21:22
 * @Version 1.0
 **/
//@Controller
@RestController
public class HelloController {
    @Autowired
    Car car;
    @RequestMapping("/car")
    public Car car() {
        return car;
    }
    //    @ResponseBody
    @RequestMapping("/hello")
    public String handle01() {
        return "Hello,Spring Boot!";
    }
}
