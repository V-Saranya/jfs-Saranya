package com.makerchecker.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.makerchecker.model.Users;

@Repository
public interface UserRepository extends JpaRepository<Users, Long>{

	void delete(Users customer);

    List<Users> findAll();

    Users save(Users customer);
	
}
