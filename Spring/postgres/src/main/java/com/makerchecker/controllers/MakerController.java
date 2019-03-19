package com.makerchecker.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.makerchecker.model.CustomerTemp;
import com.makerchecker.service.CustomerService;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/maker")
public class MakerController {
	
	@Autowired
	private CustomerService customerService;
	
	
	@PostMapping("/create/{loginId}")
    public CustomerTemp createCustomer(@PathVariable("loginId") String loginId,@RequestBody CustomerTemp customer){
        return customerService.create(customer,loginId);
    }

    @GetMapping(path = {"/{id}"})
    public CustomerTemp findOne(@PathVariable("id") Long id){
        return customerService.findById(id);
    }

    @PutMapping(path = {"/{id}/{loginId}"})
    public CustomerTemp updateCustomer(@PathVariable("id") long id,@PathVariable("loginId") String loginId, @RequestBody CustomerTemp customer){
        customer.setCustomer_id(id);
        return customerService.update(customer,loginId);
    }

    @DeleteMapping(path ={"/{id}"})
    public Optional<CustomerTemp> deleteCustomer(@PathVariable("id") long id) {
        return customerService.delete(id);
    }

    @GetMapping("/getUser")
    public List<CustomerTemp> findAll(){
        return customerService.findAll();
    }
	
}
