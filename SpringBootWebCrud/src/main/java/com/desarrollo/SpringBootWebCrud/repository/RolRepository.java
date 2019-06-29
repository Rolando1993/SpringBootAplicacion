package com.desarrollo.SpringBootWebCrud.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.desarrollo.SpringBootWebCrud.entity.Role;

@Repository
public interface RolRepository extends CrudRepository<Role, Long> {

}
