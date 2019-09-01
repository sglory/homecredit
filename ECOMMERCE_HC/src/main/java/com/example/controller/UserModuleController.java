package com.example.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Module;
import com.example.entity.User;
import com.example.repository.ModulesRepository;
import com.example.repository.UsersRepository;

@RestController
@CrossOrigin
@RequestMapping("ecommerceHc")
public class UserModuleController {
	@Autowired
	UsersRepository usersRepo;
	@Autowired
	ModulesRepository modulesRepo;
	
	@GetMapping("userList")
	public List<User> getAllUsers () {
		return usersRepo.findAll();
	}
	
	
	@GetMapping("getUserModule")
	public List<Module> getUserModule(Long userId) {
		return usersRepo.findById(userId).get().getUserModule()
				.stream()
				.sorted((o1, o2) -> o1.getModuleOrder() - o2.getModuleOrder())
				.map(i -> {
					Module m =  i.getModules();
					m.setModuleOrder(i.getModuleOrder());
					return m;
					})
				.collect(Collectors.toList());
	}
}
