package com.learn.jpa.dao;

import org.springframework.data.repository.CrudRepository;

import com.learn.jpa.entities.UserEntities;

public interface Opration extends CrudRepository<UserEntities, Integer> {

}
