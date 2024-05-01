package fr.controllers;

import fr.Services.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    private final TestService testService;

    public TestController(TestService testService) {
        this.testService = testService;
    }


    @GetMapping("/testegt")
    @CrossOrigin(origins = "*", allowedHeaders = "*")
    public String TestGet(){

        return this.testService.hello();
    }

}
