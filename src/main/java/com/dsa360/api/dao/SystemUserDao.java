package com.dsa360.api.dao;

import com.dsa360.api.security.CustomUserDetail;
/*
 * 
 * Author :- Abhay
 * 
 * */
public interface SystemUserDao {
	public CustomUserDetail loadUserByUserId(String userId);

	//public SystemUser loginUser(SystemUser user);

}
