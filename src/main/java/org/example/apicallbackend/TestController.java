package org.example.apicallbackend;

import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/testegt")
    @CrossOrigin(origins = "*", allowedHeaders = "*")
    public String TestGet(){

        return "Hello world xxx";
    }

}
