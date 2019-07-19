package com.example.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Optional;

@Controller
public class RestController {
    @Autowired
    UserRepository userRepository;
    @RequestMapping("/")
    public String home(){
        System.out.println("Listing sample data");
        return "home";
    }
    @RequestMapping("/home")
    public ModelAndView index(){
        ModelAndView modelAndView=new ModelAndView("index");
        List<Users> users=userRepository.findAll();
        modelAndView.addObject("UserList",users);
        System.out.println("Listing sample data");
        for (Users u : userRepository.findAll()) {
            System.out.println(u);
        }
        return modelAndView;
    }

}
