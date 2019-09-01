package com.example.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.entity.Module;

public interface ModulesRepository extends CrudRepository<Module, Long> {
	public List<Module> findAll();
}
