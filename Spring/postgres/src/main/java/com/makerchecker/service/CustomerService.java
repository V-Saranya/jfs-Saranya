package com.makerchecker.service;

import java.util.List;
import java.util.Optional;

import com.makerchecker.model.CustomerMaster;
import com.makerchecker.model.CustomerTemp;

public interface CustomerService {

	CustomerTemp create(CustomerTemp customer,String loginId);

	Optional<CustomerTemp> delete(long id);

    List<CustomerTemp> findAll();

    CustomerTemp findById(Long id);

    CustomerTemp update(CustomerTemp customer, String loginId);
    
    CustomerMaster approve(CustomerMaster customerMaster, Long id, String loginId);
}
