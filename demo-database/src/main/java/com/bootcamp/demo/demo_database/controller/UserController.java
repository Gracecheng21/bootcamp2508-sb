package com.bootcamp.demo.demo_database.controller;

import java.util.Arrays;
import java.util.List;
import com.bootcamp.demo.demo_database.model.User;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
public class UserController {
  private static final String userURL = "https://jsonplaceholder.typicode.com/users";

  @GetMapping(value = "/users")
  public List<User> getUser() {
    // getForObject() -> auto-deserialization
    User[] users = new RestTemplate().getForObject(userURL, User[].class);
    // Array -> ArrayList
    return Arrays.asList(users);
  }

  @PostMapping("path")
  public String postMethodName(@RequestBody String entity) {
      //TODO: process POST request
      
      return entity;
  }
  
  
}
