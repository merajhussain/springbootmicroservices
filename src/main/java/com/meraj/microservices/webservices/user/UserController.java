package com.meraj.microservices.webservices.user;

 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {


    @Autowired
    private UserDaoService userService;

    @GetMapping(path="/users")
    public List<User> getUsers()
    {
        return userService.findAll();
    }

    @GetMapping(path="users/id/{id}")
    public User getUserById(@PathVariable int id)
    {

      return  userService.findById(id);


    }

    @PostMapping("/users")
    public void createUser(@RequestBody User user)
    {
        userService.save(user);
    }




}
