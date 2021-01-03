package com.system.dao.implement;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.system.admin.entry.Admin;

public class AdminDaoTest {

	UserDaoImplement UserDao;
	@Before
	public void create(){
		UserDao= new UserDaoImplement();
	}
	
	@Test
	public void test() {
		boolean ret;
		Admin newuser = new Admin("new","123456");
		Admin userfind;
		List<Admin> userlist;
		
		//insert
		ret = UserDao.insertAdmin(newuser);
		assertTrue(ret);
		
		//find user
		userfind = UserDao.findUser("new");
		assertSame("123456", userfind.getPassword());
		
		//list all user
		userlist = UserDao.findAllAdmin();
		assertNotNull(userlist);

		//update a user
		newuser.setPassword("654321");
		ret = UserDao.updatePassword(newuser);
		assertTrue(ret);	
		
		//delete a user
		ret = UserDao.delUser("new");
		assertTrue(ret);
	}
}
