package com.em.dao;

import org.springframework.data.repository.CrudRepository;

import com.em.Entity.Department;

public interface DepRepository extends CrudRepository<Department, Integer> {

}
