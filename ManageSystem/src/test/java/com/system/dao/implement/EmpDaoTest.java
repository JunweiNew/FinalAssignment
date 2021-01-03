package com.system.dao.implement;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.system.employee.entry.Employee;

public class EmpDaoTest {
	
	EmployeeDaoImplement empDao;
	@Before
	public void create(){
		empDao= new EmployeeDaoImplement();
	}
	
	@Test
	public void test() {
		boolean ret;
		Employee empFind = null;
		List<Employee> empList;
		Employee newEmployee = new Employee();
		newEmployee.setName("Kate");
		newEmployee.setEmpJob("software engineer");
		newEmployee.setSex("Female");
		newEmployee.setPhone("0351-5252348");
		newEmployee.setMobile("13653663216");
		newEmployee.setEmail("abcd@gmail.com");
		newEmployee.setIdCard("140121198502127356");
		newEmployee.setAddress("Chaoyang District, number 107");
		newEmployee.setPost("030000");
		
		
		ret = empDao.insertEmployee(newEmployee);
		assertTrue(ret);
		
		newEmployee.setPost("050103");
		ret = empDao.updataEmployee(newEmployee);		
		assertTrue(ret);
		
		empFind = empDao.findByPhone("0351-5252348");
		assertNotNull(empFind);
		
		empList = empDao.findAllEmployee();
		assertNotNull(empList);
		
		empList = empDao.findById(empFind.getEmpId());
		assertNotNull(empList);
		
		empList = empDao.findByJob("software engineer");
		assertNotNull(empList);
		
		empList = empDao.findByName("Kate");
		assertNotNull(empList);
		
		empList = empDao.findBySex("Female");
		assertNotNull(empList);
		
		ret = empDao.deleteEmployee(empFind.getEmpId());
		assertTrue(ret);
	}
}
