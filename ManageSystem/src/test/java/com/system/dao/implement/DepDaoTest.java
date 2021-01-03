package com.system.dao.implement;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.system.department.entry.Department;

public class DepDaoTest {

	DepartmentDaoImplement DepDao;
	@Before
	public void create(){
		DepDao= new DepartmentDaoImplement();
	}
	
	@Test
	public void test() {
		Department newdep = new Department("purchasing department","08","010-5562348","12345366321","ghftr@tarena.com","Tom");
		boolean ret;
		List<Department> deplist;
		int newdep_id;

		ret = DepDao.insertDepart(newdep);
		assertTrue(ret);

		deplist = DepDao.findAllDeparte();
		assertNotNull(deplist);

		deplist = DepDao.findByName(newdep.getDepName());		
		assertNotNull(deplist);
		newdep_id = deplist.get(0).getDepId();

		deplist = DepDao.findByLeader(newdep.getDepLeader());
		assertNotNull(deplist);
		
		deplist = DepDao.findById(newdep_id);
		assertNotNull(deplist);

		newdep.setDepNumber("09");
		ret = DepDao.updataDepart(newdep);
		assertTrue(ret);

		ret = DepDao.deleteDepart(newdep_id);
		assertTrue(ret);
	}
}
