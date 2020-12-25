package com.system.dao;

import com.system.admin.entry.Admin;

import java.util.List;

public interface UserDao {
	
	public boolean findUser(String username,String password);

	public List<Admin> findAllAdmin();

	public boolean insertAdmin(Admin admin);

	public boolean delUser(String username);

	public Admin findUser(String username);
}
