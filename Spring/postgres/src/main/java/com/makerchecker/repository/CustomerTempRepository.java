package com.makerchecker.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.makerchecker.model.CustomerTemp;

@Repository
public interface CustomerTempRepository extends JpaRepository<CustomerTemp, Long>{

	void delete(CustomerTemp cust);

    List<CustomerTemp> findAll();

    CustomerTemp save(CustomerTemp customer);
	
}
