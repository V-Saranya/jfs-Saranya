package com.makerchecker.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.makerchecker.model.Users;
import com.makerchecker.service.UserService;


@RestController
@RequestMapping("/login/authenticate")
public class LoginController {
	
	@Autowired
	private UserService userService;

	
	/*@GetMapping(path = {"username"}/password)
    public Optional<Users> findOne(@PathVariable("username") Long customercode){
        return userService.findById(customercode);
    }*/

   

    
	
}
