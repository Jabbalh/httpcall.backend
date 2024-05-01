package fr.controllers;

import fr.Services.UserService;
import fr.dtos.UserProfile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class ProfileController {

    @Autowired
    private UserService userService;

    @GetMapping("/user/profile")
    public UserProfile getUserProfile(String email) {
        return this.userService.getUserByEmail(email);
    }

    @PostMapping("/user/profile")
    public void save(@RequestBody UserProfile userProfile){
        this.userService.save(userProfile);
    }
}
