package com.example.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="USER_MODULE")
@Setter @Getter
public class UserModule {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	Long id;
	
	@ManyToOne
	@JoinColumn(name = "users_id")
	User users;
	
	@ManyToOne
	@JoinColumn(name = "modules_id")
	Module modules;
	
	int moduleOrder;
	
	public UserModule() {
		
	}

}
