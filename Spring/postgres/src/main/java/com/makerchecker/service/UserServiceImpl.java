package com.makerchecker.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.makerchecker.model.Users;
import com.makerchecker.repository.UserRepository;
@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserRepository repository;
	
	@Override
	public Users create(Users customer) {
		// TODO Auto-generated method stub
		 return repository.save(customer);
	}


	@Override
	public List<Users> findAll() {
		return repository.findAll();
	}


	@Override
	public Users update(Users customer) {
		 return repository.save(customer);
	}

	@Override
	public Optional<Users> findById(Long id) {
		return repository.findById(id);
	}


	@Override
	public Users delete(int id) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
