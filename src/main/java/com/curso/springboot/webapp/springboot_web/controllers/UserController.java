package com.curso.springboot.webapp.springboot_web.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import com.curso.springboot.webapp.springboot_web.models.User;

@Controller
public class UserController {

    @GetMapping("/details")
    public String details(Model model) {

        User user = new User("Marcelo", "Rodriguez");
        user.setEmail("marcelo@correo.com");
        model.addAttribute("title", "Hola Mundo Spring Boot");
        model.addAttribute("user", user);
        return "details";
    }

    @GetMapping("/list")
    public String list(ModelMap model) {
        List<User> users = Arrays.asList(
            new User("Pepa", "Gonzales"),
            new User("Lalo", "Perez", "lalo@correo.com"),
            new User("Juanita", "Bonita", "@correo.com"),
            new User("Andres", "Hurtado")
        );

        model.addAttribute("users", users);
        model.addAttribute("title", "Listado de usuarios!");

        return "list";
    }

}
