package com.example.Spring_Security;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    private HomeService homeService;
    private UserService userService;
    private AdminService adminService;

    public HomeController(HomeService homeService, UserService userService, AdminService adminService) {
        this.homeService = homeService;
        this.userService = userService;
        this.adminService = adminService;
    }

    @GetMapping("/public-data")
    public String getPublic() {
        return "user";
    }

    @GetMapping("/private-data")
    public String getPrivate() {
        return "admin";
    }

    @GetMapping("/")
    public String mainPage() {
        return "redirect:/login";
    }
}
