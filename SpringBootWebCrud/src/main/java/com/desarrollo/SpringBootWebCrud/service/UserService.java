package com.desarrollo.SpringBootWebCrud.service;

import javax.validation.Valid;

import com.desarrollo.SpringBootWebCrud.entity.User;

public interface UserService {

	public Iterable<User> getAllUsers();

	public User createUser(User user) throws Exception;
}
