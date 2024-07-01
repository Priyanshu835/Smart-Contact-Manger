package com.scm.SmartContactManager.contollers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class PageController {

    @RequestMapping("/home")
    public String home(Model model){
        System.out.println("Home Page Handler");
        model.addAttribute("name", "Substring Tech");
        model.addAttribute("youtubeChannel", "Shambhoo");
        model.addAttribute("githubRepository", "https://github.com/Priyanshu835/Social-Media-Blocker-chrome-Extension");
        return "home";
    }
}
