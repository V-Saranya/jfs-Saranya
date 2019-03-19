package com.makerchecker.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.makerchecker.exception.CustomException;
import com.makerchecker.model.CustomerMaster;
import com.makerchecker.model.CustomerTemp;
import com.makerchecker.repository.CustomerMasterRepository;
import com.makerchecker.repository.CustomerTempRepository;
@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	CustomerTempRepository repository;
	
	@Autowired
	CustomerMasterRepository masterRepository;
	
	
	@Override
	public CustomerTemp create(CustomerTemp customer,String loginId) {
		customer.setCreated_by(loginId);
		customer.setModified_by(loginId);
		customer.setRecord_status("N");
		customer.setIs_enabled("I");
		return repository.save(customer);
	}

	@Override
	public Optional<CustomerTemp> delete(long id) {
		 Optional<CustomerTemp> cust = repository.findById(id);
	        if(cust != null){
	            repository.delete(cust.get());
	        }
	        return cust;
	}

	
	@Override
	public List<CustomerTemp> findAll() {
		return repository.findAll();
	}

	
	@Override
	public CustomerTemp update(CustomerTemp customer, String loginId) {
		customer.setCreated_by(loginId);
		customer.setModified_by(loginId);
		customer.setRecord_status("M");
		customer.setIs_enabled("I");
		 return repository.save(customer);
	}

	@Override
	public CustomerTemp findById(Long id) {
		return repository.findById(id).orElseThrow(CustomException::new);
	}
	
	public CustomerMaster approve(CustomerMaster customer, Long id, String loginId) {
		delete(id);
		customer.setCreated_by(loginId);
		customer.setModified_by(loginId);
		customer.setRecord_status("A");
		customer.setIs_enabled("A");
		return masterRepository.save(customer); 
	}
	
}
