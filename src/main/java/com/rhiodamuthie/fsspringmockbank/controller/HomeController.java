package com.rhiodamuthie.fsspringmockbank.controller;

import com.rhiodamuthie.fsspringmockbank.entity.User;
import com.rhiodamuthie.fsspringmockbank.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

    @Autowired
    private UserService userService;

    @GetMapping("/")
    public String home() {
        return "redirect:/index";
    }

    @GetMapping("/index")
    public String index() {
        return "index";
    }

    @GetMapping("/signup")
    public String signup(Model model) {
        User user = new User();

        model.addAttribute("user", user);

        return "signup";
    }

    @GetMapping("/signup2")
    public ModelAndView login() {
        ModelAndView mv = new ModelAndView("signup");
        return mv;
    }

    @PostMapping("/signup")
    public String signupPost(@ModelAttribute("user") User user, Model model) {

        if (userService.checkUserExists(user.getUsername(), user.getEmail())) {
            if (userService.checkEmailExist(user.getEmail())) {
                model.addAttribute("emailExist", true);
            }
            if (userService.checkUsernameExist(user.getUsername())) {
                model.addAttribute("usernameExist", true);
            }

            return "signup";
        } else {

            userService.save(user);
            return "redirect:/";
        }
    }


}
