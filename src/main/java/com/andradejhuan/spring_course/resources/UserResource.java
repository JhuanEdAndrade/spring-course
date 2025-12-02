package com.andradejhuan.spring_course.resources;

import com.andradejhuan.spring_course.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @GetMapping
    public ResponseEntity<User> findAll(){
        User u = new User(1L, "Jhuan", "16999638666", "jhuanconta@gmail.com", "1234");
        return ResponseEntity.ok().body(u);
    }
}
