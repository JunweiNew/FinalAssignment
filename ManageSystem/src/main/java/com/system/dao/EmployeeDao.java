package com.system.dao;

import com.system.employee.entry.Employee;
import java.util.List;

public interface EmployeeDao {
	
	public List<Employee> findAllEmployee();
	
	public List<Employee> findAllEmployee(int currentPage,int pageSize);
	
	public int findAllRows();
	
	public List<Employee> findByName(String name);
	
	public List<Employee> findById(int id);
	
	public List<Employee> findBySex(String sex);
	
	public List<Employee> findByJob(String job);
	
	public Employee findByPhone(String phone);	
	
	public boolean deleteEmployee(int id);
	
	public boolean updataEmployee(Employee emp);
	
	public boolean insertEmployee(Employee emp);
}
