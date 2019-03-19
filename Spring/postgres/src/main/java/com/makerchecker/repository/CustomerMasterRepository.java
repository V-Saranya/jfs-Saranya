package com.makerchecker.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.makerchecker.model.CustomerMaster;
@Repository
public interface CustomerMasterRepository extends JpaRepository<CustomerMaster, Long>{

	void delete(CustomerMaster customer);

    List<CustomerMaster> findAll();

    CustomerMaster save(CustomerMaster user);
	
}
