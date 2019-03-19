package com.makerchecker.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.makerchecker.model.CustomerMaster;
import com.makerchecker.model.CustomerTemp;
import com.makerchecker.service.CustomerService;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/checker")
public class CheckerController {


	@Autowired
	private CustomerService customerService;
	
	@PostMapping("/approve/{id}/{loginId}")
    public CustomerMaster approve(@PathVariable("id") long id, @PathVariable("loginId") String loginId,@RequestBody CustomerMaster customer){
        return customerService.approve(customer,id,loginId);
    }
	
	@PostMapping("/reject/{id}/{loginId}")
    public CustomerMaster reject(@PathVariable("id") long id, @PathVariable("loginId") String loginId,@RequestBody CustomerMaster customer){
        return customerService.approve(customer,id,loginId);
    }
	
}
