package com.example.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.entity.User;

@Repository
public interface UsersRepository extends CrudRepository<User, Long>{
	public List<User> findAll();
	public List<User> findByUserName(String userName);
}
