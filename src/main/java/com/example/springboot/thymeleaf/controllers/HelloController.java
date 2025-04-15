package com.example.springboot.thymeleaf.controllers;

import com.example.springboot.thymeleaf.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Arrays;
import java.util.List;

@Controller
public class HelloController {

    @RequestMapping("/hello")
    public String hello(){
        return "Hello";
    }

    @RequestMapping("/sendData")
    public ModelAndView sendData(){
        ModelAndView mav = new ModelAndView("data");
        mav.addObject("message","Hello Sandeep, how are you??");

        return mav;
    }

    @RequestMapping("/student")
    public ModelAndView student(){
        ModelAndView mav = new ModelAndView("student");
        Student std = new Student();
        std.setName("Sandeep");
        std.setScore(100);

        mav.addObject("scorecard",std);

        return mav;


    }
    @RequestMapping("/students")
    public ModelAndView students(){
        ModelAndView mav = new ModelAndView("studentList");
        Student std1 = new Student();
        std1.setName("Sandeep");
        std1.setScore(100);

        Student std2 = new Student();
        std2.setName("Srinivas");
        std2.setScore(99);

        List<Student> students = Arrays.asList(std1, std2);

        mav.addObject("scorecards",students);

        return mav;


    }

    @RequestMapping("/studentForm")
    public ModelAndView studentForm(){
        ModelAndView mav = new ModelAndView("studentForm");
        Student std = new Student();
        std.setName("Sandeep");
        std.setScore(100);

        mav.addObject("scorecard",std);

        return mav;


    }
    @RequestMapping("/saveStudent")
    public ModelAndView saveStudent(@ModelAttribute Student student){
        ModelAndView mav = new ModelAndView("result");

        mav.addObject("savedScoreCard", student);
        return mav;
    }
}
