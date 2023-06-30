package com.example.Diary.controller;


import com.example.Diary.services.UserService;
import com.example.Diary.models.User;
import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    @ModelAttribute("csrf")
    public CsrfToken csrfToken(HttpServletRequest request) {
        return (CsrfToken) request.getAttribute("_csrf");
    }

    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @GetMapping("/registration")
    public String registration() {
        return "registration";
    }


    @PostMapping("/registration")
    public String createUser(User user, Model model) {
        if (!userService.createUser(user)){
            model.addAttribute("errorMessage", "Пользователь с таким именем пользователя: " + user.getName() + " уже существует");
            return "registration";
        }

        userService.createUser(user);
        return "redirect:/login";
    }
    @GetMapping("/success")
    public String loginSuccess() {
        return "redirect:/note";
    }

    }
