package com.desarrollo.SpringBootWebCrud.repository;

import java.util.Optional;
import java.util.Set;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.desarrollo.SpringBootWebCrud.entity.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {

	//public Set<User> findByUsername(String username);
	/*
	public Optional findByUsername(String username);
	public Optional findByIdAndPassword(Long id, String password);*/
}