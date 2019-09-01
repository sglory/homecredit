package com.example.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="USERS")
@Setter @Getter
public class User {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	Long id;
	String userName;
	
	@OneToMany(fetch = FetchType.EAGER, mappedBy = "users", cascade = CascadeType.ALL, orphanRemoval = true )
	@JsonIgnore
	Set<UserModule> userModule;
	
	public User (String userName) {
		this.userName = userName;
		this.userModule = new HashSet<>();
	}
	
	public User() {
		this.userModule = new HashSet<>();
	}

}
