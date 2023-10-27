package com.example.proiectdean.Controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controllerVote {
    String data= "eu sunt de aici";
    @GetMapping("/getCandidates")
    public Candidates[] getCandidates(){
        System.out.println("gsdg");

        return Candidates.getAll();
    }

//    @PostMapping
//    public User saveUser(@Validated @RequestBody User user) {
//        // Implement
//    }

}
