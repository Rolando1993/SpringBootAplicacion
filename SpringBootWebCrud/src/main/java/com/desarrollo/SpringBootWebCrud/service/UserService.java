package com.desarrollo.SpringBootWebCrud.service;


import com.desarrollo.SpringBootWebCrud.entity.User;

public interface UserService {

	public Iterable<User> getAllUsers();

	public User createUser(User user) throws Exception;
	
	User getUserById(Long id) throws Exception;
	
	public User updateUser(User user) throws Exception;
}
