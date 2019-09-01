package com.example;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.entity.Module;
import com.example.entity.User;
import com.example.entity.UserModule;
import com.example.repository.ModulesRepository;
import com.example.repository.UsersRepository;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class EcommerceHcApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(EcommerceHcApplication.class, args);
	}
	
	@Autowired
	ModulesRepository moduleRepo;
	@Autowired
	UsersRepository userRepo;
	
	@Override
	@Transactional
	public void run(String...strings ) throws Exception {
		//UserA
		User userA = new User("UserA");
		Module moduleA = new Module("CategoryCard");
		UserModule userModule = new UserModule();
		userModule.setUsers(userA);
		userModule.setModules(moduleA);
		userModule.setModuleOrder(2);
		userA.getUserModule().add(userModule);
		moduleRepo.save(moduleA);
		userRepo.save(userA);
		
		Module moduleB = new Module("FlashSaleCard");
		UserModule userModuleB = new UserModule();
		userModuleB.setUsers(userA);
		userModuleB.setModules(moduleB);
		userModuleB.setModuleOrder(3);
		userA.getUserModule().add(userModuleB);
		moduleRepo.save(moduleB);
		userRepo.save(userA);
		
		Module moduleC = new Module("HistoryCard");
		UserModule userModuleC = new UserModule();
		userModuleC.setUsers(userA);
		userModuleC.setModules(moduleC);
		userModuleC.setModuleOrder(4);
		userA.getUserModule().add(userModuleC);
		moduleRepo.save(moduleC);
		userRepo.save(userA);
		
		Module moduleD = new Module("NewCard");
		UserModule userModuleD = new UserModule();
		userModuleD.setUsers(userA);
		userModuleD.setModules(moduleD);
		userModuleD.setModuleOrder(5);
		userA.getUserModule().add(userModuleD);
		moduleRepo.save(moduleD);
		userRepo.save(userA);
		
		Module moduleE = new Module("PromoCard");
		UserModule userModuleE = new UserModule();
		userModuleE.setUsers(userA);
		userModuleE.setModules(moduleE);
		userModuleE.setModuleOrder(1);
		userA.getUserModule().add(userModuleE);
		moduleRepo.save(moduleE);
		userRepo.save(userA);
		
		//UserB
		User userB = new User("UserB");
		Module moduleF = new Module("CategoryCard");
		UserModule userModuleF = new UserModule();
		userModuleF.setUsers(userB);
		userModuleF.setModules(moduleF);
		userModuleF.setModuleOrder(4);
		userB.getUserModule().add(userModuleF);
		moduleRepo.save(moduleF);
		userRepo.save(userB);
		
		Module moduleG = new Module("FlashSaleCard");
		UserModule userModuleG = new UserModule();
		userModuleG.setUsers(userB);
		userModuleG.setModules(moduleG);
		userModuleG.setModuleOrder(3);
		userB.getUserModule().add(userModuleG);
		moduleRepo.save(moduleG);
		userRepo.save(userB);
		
		Module moduleH = new Module("HistoryCard");
		UserModule userModuleH = new UserModule();
		userModuleH.setUsers(userB);
		userModuleH.setModules(moduleH);
		userModuleH.setModuleOrder(5);
		userB.getUserModule().add(userModuleH);
		moduleRepo.save(moduleH);
		userRepo.save(userB);
		
		Module moduleI = new Module("NewCard");
		UserModule userModuleI = new UserModule();
		userModuleI.setUsers(userB);
		userModuleI.setModules(moduleI);
		userModuleI.setModuleOrder(2);
		userB.getUserModule().add(userModuleI);
		moduleRepo.save(moduleI);
		userRepo.save(userB);
		
		Module moduleJ = new Module("PromoCard");
		UserModule userModuleJ = new UserModule();
		userModuleJ.setUsers(userB);
		userModuleJ.setModules(moduleJ);
		userModuleJ.setModuleOrder(1);
		userB.getUserModule().add(userModuleJ);
		moduleRepo.save(moduleJ);
		userRepo.save(userB);
		
		//UserC
		User userC = new User("UserC");
		Module moduleK = new Module("CategoryCard");
		UserModule userModuleK = new UserModule();
		userModuleK.setUsers(userC);
		userModuleK.setModules(moduleK);
		userModuleK.setModuleOrder(3);
		userC.getUserModule().add(userModuleK);
		moduleRepo.save(moduleK);
		userRepo.save(userC);
		
		Module moduleL = new Module("FlashSaleCard");
		UserModule userModuleL = new UserModule();
		userModuleL.setUsers(userC);
		userModuleL.setModules(moduleL);
		userModuleL.setModuleOrder(2);
		userC.getUserModule().add(userModuleL);
		moduleRepo.save(moduleL);
		userRepo.save(userC);
		
		Module moduleM = new Module("HistoryCard");
		UserModule userModuleM = new UserModule();
		userModuleM.setUsers(userC);
		userModuleM.setModules(moduleM);
		userModuleM.setModuleOrder(5);
		userC.getUserModule().add(userModuleM);
		moduleRepo.save(moduleM);
		userRepo.save(userC);
		
		Module moduleN = new Module("NewCard");
		UserModule userModuleN = new UserModule();
		userModuleN.setUsers(userC);
		userModuleN.setModules(moduleN);
		userModuleN.setModuleOrder(4);
		userC.getUserModule().add(userModuleN);
		moduleRepo.save(moduleN);
		userRepo.save(userC);
		
		Module moduleO = new Module("PromoCard");
		UserModule userModuleO = new UserModule();
		userModuleO.setUsers(userC);
		userModuleO.setModules(moduleO);
		userModuleO.setModuleOrder(1);
		userC.getUserModule().add(userModuleO);
		moduleRepo.save(moduleO);
		userRepo.save(userC);
	}
	
}