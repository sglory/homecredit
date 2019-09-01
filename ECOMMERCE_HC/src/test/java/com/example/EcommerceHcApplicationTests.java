package com.example;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.controller.UserModuleController;
import com.example.entity.Module;
import com.example.entity.UserModule;
import com.example.entity.User;
import com.example.repository.ModulesRepository;
import com.example.repository.UsersRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EcommerceHcApplicationTests {

	@Autowired
	UsersRepository userRepo;
	@Autowired
	UserModuleController controller;
	@Autowired
	ModulesRepository moduleRepo;
	
	@Test
	public void getUserModuleTest() {
		User userA = new User("UserD");
		Module moduleA = new Module("CategoryCard");
		Module moduleB = new Module("FlashSaleCard");
		
		UserModule userModule = new UserModule();
		userModule.setUsers(userA);
		userModule.setModules(moduleA);
		userModule.setModuleOrder(2);
		userA.getUserModule().add(userModule);
		moduleRepo.save(moduleA);
		userRepo.save(userA);
		
		UserModule userModuleB = new UserModule();
		userModuleB.setUsers(userA);
		userModuleB.setModules(moduleB);
		userModuleB.setModuleOrder(1);
		userA.getUserModule().add(userModuleB);
		moduleRepo.save(moduleB);
		userA = userRepo.save(userA);
		
		List<Module> modulesResult = controller.getUserModule(userA.getId());
		
		assertThat(modulesResult.get(0).getModuleOrder()).isEqualTo(1);
		assertThat(modulesResult.get(1).getModuleOrder()).isEqualTo(2);
		assertThat(modulesResult.get(0).getModuleName()).isEqualTo("FlashSaleCard");
		assertThat(modulesResult.get(1).getModuleName()).isEqualTo("CategoryCard");
		assertThat(modulesResult.size()).isEqualTo(2);
	}
}
