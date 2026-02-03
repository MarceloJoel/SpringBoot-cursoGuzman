package com.curso.springboot.webapp.springboot_web.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import com.curso.springboot.webapp.springboot_web.models.User;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UserController {

    @GetMapping("/details")
    public String details(Model model) {
        model.addAttribute("title", "Hola Mundo Spring Boot");
        model.addAttribute("name", "Marcelo");
        model.addAttribute("lastname", "Rodriguez");
        return "details";
    }

    @GetMapping("/list")
    public String list(ModelMap model) {
        List<User> users = new ArrayList<>();

        model.addAttribute("users", users);
        model.addAttribute("title", "Listado de usuarios!");

        return "list";
    }

}
