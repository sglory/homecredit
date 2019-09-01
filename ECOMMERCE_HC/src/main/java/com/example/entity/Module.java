package com.example.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="MODULES")
@Setter @Getter
public class Module {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@JsonIgnore
	Long id;
	String moduleName;
	
	@OneToMany(fetch = FetchType.EAGER, mappedBy = "modules", cascade = CascadeType.ALL, orphanRemoval = true)
	@JsonIgnore
	Set<UserModule> userModule;
	
	@Transient
	@JsonInclude
	int moduleOrder;
	
	public Module() {
		
	}
	
	public Module(String moduleName) {
		this.moduleName = moduleName;
	}
	
	public Module (String moduleName, int moduleOrder) {
		this.moduleName = moduleName;
		this.moduleOrder = moduleOrder;
	}
}
