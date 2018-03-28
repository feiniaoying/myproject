package com.zkzj.myproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @description: pc controller
 * @author: chenwt
 * @create: 2018-03-26 00:06
 **/
@Controller
@RequestMapping("/student/")
public class StudentController {
    @RequestMapping("home")
    public String home (Model model){
        model.addAttribute("menuSelected1", "home");
        return "student/home";
    }

    @RequestMapping("studentInfo")
    public String studentInfo (Model model){
        model.addAttribute("menuSelected1", "studentInfo");
        return "student/studentInfo";
    }
}
