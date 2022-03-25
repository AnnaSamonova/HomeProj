package by.overone.projectFirst.controller;

import by.overone.projectFirst.model.User;
import by.overone.projectFirst.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MainController {



    private UserService userService;

    @Autowired
    public MainController(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String homePage(Model model){
        Iterable<User> users = userService.findAll();
        model.addAttribute("users", users);
        return "home";
    }
}
