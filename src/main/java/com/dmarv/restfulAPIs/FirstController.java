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

    @PostMapping("/api/post/record")
    public String postRecord(@RequestBody OrderRecord order){
        return "Request Accepted and the Order is: " + order.toString();
    }

//    getParams from the URL
    @GetMapping("/api/hello/{userName}")
    public String pathVariable(@PathVariable("userName") String userName){
        return "My URL variable: " + userName;
    }
//    get multiple Params from the url as shown below
//    http://127.0.0.1:8080/api/multiple/variables?username=owinymarvin&lastname=timothy
    @GetMapping("/api/multiple/variables")
    public String multipleParams(
            @RequestParam("username") String userName,
            @RequestParam("lastname") String userLastName
    ){
        return "My values: username: " + userName + "  lastname: " + userLastName;
    }
}
