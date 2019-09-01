package com.example.vo;

import java.util.List;

import com.example.entity.UserModule;

public class UserModuleRequest {
	Long userId;
	List<UserModule> userModule;
	
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public List<UserModule> getUserModule() {
		return userModule;
	}
	public void setUserModule(List<UserModule> userModule) {
		this.userModule = userModule;
	}
	
	
}
