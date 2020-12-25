package com.system.dao.implement;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.system.dao.DepartmentDao;
import com.system.employee.util.DBUtil;

import com.system.department.entry.Department;


public class DepartmentDaoImplement implements DepartmentDao {

	
	public boolean deleteDepart(int id) {
		
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		String sql = "delete from tb_dep where depId ="+id;
		int ret = 0;	
		
		try{	
			con = DBUtil.getConnection();
			ps = con.prepareStatement(sql);
			ret = ps.executeUpdate();
	
					
		}catch(Exception e){
			e.printStackTrace();
			System.out.println("EmployeeDaoImpl:deleteDepart() error!");
		}finally{
			
			DBUtil.close(rs, ps, con);
		}	
	
	
		if(ret > 0){
			return true;
		}else{
			return false;
		}
	}
	
	
	public List<Department> findAllDeparte() {

		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		String sql = "select * from tb_dep ";
		List<Department> list = new ArrayList<Department>();
				
		try{	
	
			con = DBUtil.getConnection();
			ps = con.prepareStatement(sql);
			
			rs = ps.executeQuery();
			while(rs.next()){
				
				Department dep = new Department();
				dep.setDepId(rs.getInt("depId"));
				dep.setDepName(rs.getString("depName"));
				dep.setDepNumber(rs.getString("depNumber"));
				dep.setDepPhone(rs.getString("depPhone"));
				dep.setDepMobile(rs.getString("depMobile"));
				dep.setDepEmail(rs.getString("depEmail"));
				dep.setDepLeader(rs.getString("depLeader"));
		 		
				list.add(dep);
				
			}		
		}catch(Exception e){
			e.printStackTrace();
			System.out.println(" findAllDeparte(int currentPage, int pageSize) sucess!");
		}finally{
			
			DBUtil.close(rs, ps, con);
			
		}
		return list;	
	}	
	
	
	public boolean insertDepart(Department dep) {

		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		String sql = "insert into tb_dep(depName,depNumber,depPhone,depMobile,depEmail,depLeader)" +
				"values(?,?,?,?,?,?)"; 
		int i = 0;
		try{	
			con = DBUtil.getConnection();
			ps = con.prepareStatement(sql);
			ps.setString(1, dep.getDepName());
			ps.setString(2, dep.getDepNumber());
			ps.setString(3, dep.getDepPhone());
			ps.setString(4, dep.getDepMobile());
			ps.setString(5, dep.getDepEmail());
			ps.setString(6, dep.getDepLeader());
		
			i  = ps.executeUpdate();
 		}catch(Exception e){
			e.printStackTrace();
			System.out.println("insertDepart()fail!");
		}finally{
			
			DBUtil.close(rs, ps, con);
			
		}
		if(i==0){
		return false;
		}else{
			return true;
		}
	}	
	
	public boolean updataDepart(Department dep) {
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
  		String sql = "Update tb_dep set" +
 					" depName = '" + dep.getDepName() + "', " +
 					" depNumber = '" + dep.getDepNumber() + "', " +
 					" depPhone = '" + dep.getDepPhone() + "', " +
 					" depMobile = '" + dep.getDepMobile() + "', " +
 					" depEmail = '" + dep.getDepEmail() + "', " +
 					" depLeader = '" + dep.getDepLeader() + "' " +
 					" where depId = " + dep.getDepId();
		int ret = 0;
		try{	
			con = DBUtil.getConnection();
			ps = con.prepareStatement(sql);
			ret  = ps.executeUpdate();
 		}catch(Exception e){
			e.printStackTrace();
			System.out.println("updataDepart() fail!");
		}finally{
			
			DBUtil.close(rs, ps, con);
			
		}
		
		if(ret==0){
			return false;
		}else{
			return true;
		}
	}	

	
	public List<Department> findById(int id) {
		
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs =
				null;
		String sql = "select * from tb_dep where depId =" + id;
		List<Department> list = new ArrayList<Department>();
				
		try{	
	
			con = DBUtil.getConnection();
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			while(rs.next()){
				
				Department dep = new Department();
				dep.setDepEmail(rs.getString("depEmail"));
				dep.setDepId(rs.getInt("depId"));
				dep.setDepLeader(rs.getString("depLeader"));
				dep.setDepMobile(rs.getString("depMobile"));
				dep.setDepName(rs.getString("depName"));
				dep.setDepNumber(rs.getString("depNumber"));
				dep.setDepPhone(rs.getString("depPhone"));
				
				list.add(dep);
				
			}
				
		}catch(Exception e){
			e.printStackTrace();
			System.out.println("findById fail!");
		}finally{
			
			DBUtil.close(rs, ps, con);
			
		}
		return list;
	}
	
	public List<Department> findByLeader(String name) {


		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		String sql = "select * from tb_dep where depLeader like ? order by depId";
		List<Department> list = new ArrayList<Department>();
				
		try{	
	
			con = DBUtil.getConnection();
			ps = con.prepareStatement(sql);
	
			ps.setString(1, "%" + name + "%");
			
			rs = ps.executeQuery();
			while(rs.next()){
				
				Department dep = new Department();
				dep.setDepEmail(rs.getString("depEmail"));
				dep.setDepId(rs.getInt("depId"));
				dep.setDepLeader(rs.getString("depLeader"));
				dep.setDepMobile(rs.getString("depMobile"));
				dep.setDepName(rs.getString("depName"));
				dep.setDepNumber(rs.getString("depNumber"));
				dep.setDepPhone(rs.getString("depPhone"));
		 
				
				list.add(dep);
				
			}
			
			
		}catch(Exception e){
			e.printStackTrace();
			System.out.println("findByLeader()fail!");
		}finally{
			
			DBUtil.close(rs, ps, con);
			
		}
		return list;	
	}	
	

	public List<Department> findByName(String name) {

		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		String sql = "select * from tb_dep where depName like ? order by depId";
		List<Department> list = new ArrayList<Department>();
				
		try{	
	
			con = DBUtil.getConnection();
			ps = con.prepareStatement(sql);
	
			ps.setString(1, "%" + name + "%");
			
			rs = ps.executeQuery();
			while(rs.next()){
				
				Department dep = new Department();
				dep.setDepEmail(rs.getString("depEmail"));
				dep.setDepId(rs.getInt("depId"));
				dep.setDepLeader(rs.getString("depLeader"));
				dep.setDepMobile(rs.getString("depMobile"));
				dep.setDepName(rs.getString("depName"));
				dep.setDepNumber(rs.getString("depNumber"));
				dep.setDepPhone(rs.getString("depPhone"));
		 
				
				list.add(dep);
				
			}
			
			
		}catch(Exception e){
			e.printStackTrace();
			System.out.println("findByLeader()fail!");
		}finally{
			
			DBUtil.close(rs, ps, con);
			
		}
		return list;
	}	

}
