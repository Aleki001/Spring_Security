package com.alexkinyua.security_app.user;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/users")
@RequiredArgsConstructor
public class UserController {
    private IUserService userService;

    @GetMapping
    public String getUsers(Model model){
        model.addAttribute("user", userService.getAllUsers());
        return "users";
    }

}
