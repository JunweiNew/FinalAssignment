package com.system.dao;

import java.util.List;

import com.system.department.entry.Department;

public interface DepartmentDao {
	
	public boolean insertDepart(Department dep);
	
	public boolean updataDepart(Department dep);
	
	public List<Department> findAllDeparte();
	
	public boolean deleteDepart(int id);
	
	public List<Department> findById(int id);
	
	public List<Department> findByName(String name);
	
	public List<Department> findByLeader(String name);	
}
