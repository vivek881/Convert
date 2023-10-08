package com.personalProject.Converter.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class HomeController {
    @RequestMapping("/")
    public String baseHome(){
        return "OK";
    }
    @RequestMapping("/home")
    public String basehome2(){
        return "ok2";
    }
}
