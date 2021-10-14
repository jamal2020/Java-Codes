package com.example;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SimpleController1 {

    @RequestMapping("/welcome")
    public String welcome()
    {
        return "welcome";
    }
}
