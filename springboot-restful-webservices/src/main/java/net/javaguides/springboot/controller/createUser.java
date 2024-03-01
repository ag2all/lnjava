package net.javaguides.springboot.controller;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import net.javaguides.springboot.entity.User;
import net.javaguides.springboot.service.userService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@NoArgsConstructor
public class createUser {

    @Autowired
    private userService userService;

    @PostMapping("user/create")
    public ResponseEntity<User> create(@RequestBody User user){
        User savedUser = userService.createUser(user);
        return new ResponseEntity<>(savedUser, HttpStatus.CREATED);

    }
}
