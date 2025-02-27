package com.smc.smc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {

    @RequestMapping("/home")
    public String home(Model model) {
        System.out.println("home page handler");
        model.addAttribute("name","Asad Ullah");
        model.addAttribute("Course","Pondit");
        model.addAttribute("skill","c,c++");
        model.addAttribute("githubRepo","https://github.com/1005-AsadUllah");
        
        return "home";
    }

    @RequestMapping("/about")
    public String aboutpage(){

        System.out.println("About page loading...");
        return "about";
    }

    @RequestMapping("/services")
    public String servicespage(){

        System.out.println("Services page");
        return "services";
    }
    
    @RequestMapping("/login")
    public String loginspage(){

        System.out.println("Login page");
        return "login";
    }

    @RequestMapping("/singup")
    public String singppage(){

        System.out.println("Singup page");
        return "singup";
    }

    @RequestMapping("/contact")
    public String contactspage(){

        System.out.println("Contact page");
        return "contact";
    }
}
