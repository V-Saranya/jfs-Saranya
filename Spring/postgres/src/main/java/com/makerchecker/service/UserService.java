package com.makerchecker.service;

import java.util.List;
import java.util.Optional;

import com.makerchecker.model.Users;

public interface UserService {

	Users create(Users customer);

	Users delete(int id);

    List<Users> findAll();

    Optional<Users> findById(Long id);

    Users update(Users customer);
}
