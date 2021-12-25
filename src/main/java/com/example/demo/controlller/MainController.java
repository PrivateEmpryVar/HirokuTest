package com.example.demo.controlller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {
    @GetMapping("/")
    public String getMainPage(@RequestParam(defaultValue = "VALUE") String message, Model model) {
    model.addAttribute("message", "Hello, " + message + "!");
    return "index";
    }
}
