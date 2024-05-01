package fr.controllers;

import fr.Services.UserService;
import fr.dtos.UserProfile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class ProfileController {

    @Autowired
    private UserService userService;

    @GetMapping("/user/profile")
    public UserProfile getUserProfile() {
        return this.userService.getUserProfile();
    }
}