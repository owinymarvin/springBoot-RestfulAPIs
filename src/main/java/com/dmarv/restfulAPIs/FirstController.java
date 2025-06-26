package com.dmarv.restfulAPIs;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
public class FirstController {
    @GetMapping
    public String welcome(){
        return "welcome message";
    }

    @GetMapping("/api/hello")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public String sayHello(){
        return "Hello from DMARV";
    }

    @PostMapping("/api/post")
    public String post(@RequestBody Order order ){
        return "Request Accepted and Order is:  " + order.toString();
    }
}
