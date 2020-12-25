package com.system.dao.implement;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.system.dao.EmployeeDao;
import com.system.employee.entry.Employee;
import com.system.employee.util.DBUtil;

public class EmployeeDaoImplement implements EmployeeDao{

	public boolean deleteEmployee(int id) {

		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		String sql = "delete from tb_emp where empId ="+id;
		int shan = 0;		
		try{	
			con = DBUtil.getConnection();
			ps = con.prepareStatement(sql);
	
			shan = ps.executeUpdate();
	
					
		}catch(Exception e){
			e.printStackTrace();
			System.out.println("EmployeeDaoImpl:deleteEmployee()");
		}finally{
			
			DBUtil.close(rs, ps, con);
			
		}
	
		if(shan > 0){
			return true;
		}else{
			return false;
		}
	}
	
	
	public List<Employee> findAllEmployee() {
		
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		String sql = "select * from tb_emp";
		List<Employee> list = new ArrayList<Employee>();
				
		try{	
	
			con = DBUtil.getConnection();
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			while(rs.next()){
				
				Employee emp = new Employee();
				emp.setEmpId(rs.getInt("empId"));
				emp.setName(rs.getString("empName"));
				emp.setEmpJob(rs.getString("empJob"));
				emp.setSex(rs.getString("sex"));
				emp.setPhone(rs.getString("phone"));
				emp.setMobile(rs.getString("mobile"));
				emp.setEmail(rs.getString("email"));
				emp.setIdCard(rs.getString("idCard"));
				emp.setAddress(rs.getString("address"));
				emp.setPost(rs.getString("post"));
				
				list.add(emp);
				
			}
			
			
		}catch(Exception e){
			e.printStackTrace();
			System.out.println("EmployeeDaoImpl:findAllEmployee() err!");
		}finally{
			
			DBUtil.close(rs, ps, con);
			
		}
		return list;
 	}	
	
	
	
	public List<Employee> findAllEmployee(int currentPage, int pageSize) {
		
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		String sql = "select * from tb_emp limit ?,?";
		List<Employee> list = new ArrayList<Employee>();
				
		try{	
	
			con = DBUtil.getConnection();
			ps = con.prepareStatement(sql);
			ps.setInt(1, (currentPage-1) * pageSize);
			ps.setInt(2, pageSize);
			
			rs = ps.executeQuery();
			while(rs.next()){
				
				Employee emp = new Employee();
				emp.setEmpId(rs.getInt("empId"));
				emp.setName(rs.getString("empName"));
				emp.setEmpJob(rs.getString("empJob"));
				emp.setSex(rs.getString("sex"));
				emp.setPhone(rs.getString("phone"));
				emp.setMobile(rs.getString("mobile"));
				emp.setEmail(rs.getString("email"));
				emp.setIdCard(rs.getString("idCard"));
				emp.setAddress(rs.getString("address"));
				emp.setPost(rs.getString("post"));
		 		
				list.add(emp);
				
			}		
		}catch(Exception e){
			e.printStackTrace();
			System.out.println("EmployeeDaoImpl:findAllEmployee(int currentPage, int pageSize)æ�©æ„¯î”‘é�‘æ´ªæ•Š!");
		}finally{
			
			DBUtil.close(rs, ps, con);
			
		}
			return list;		
		}

		public int findAllRows() {
	
		return 0;
	}
		
		
	public List<Employee> findById(int id) {

		
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		String sql = "select * from tb_emp where empId =" + id;
		List<Employee> list = new ArrayList<Employee>();
				
		try{	
	
			con = DBUtil.getConnection();
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			while(rs.next()){
				
				Employee emp = new Employee();
				emp.setEmpId(rs.getInt("empId"));
				emp.setName(rs.getString("empName"));
				emp.setEmpJob(rs.getString("empJob"));
				emp.setSex(rs.getString("sex"));
				emp.setPhone(rs.getString("phone"));
				emp.setMobile(rs.getString("mobile"));
				emp.setEmail(rs.getString("email"));
				emp.setIdCard(rs.getString("idCard"));
				emp.setAddress(rs.getString("address"));
				emp.setPost(rs.getString("post"));
		 
				
				list.add(emp);
				
			}
				
		}catch(Exception e){
			e.printStackTrace();
			System.out.println("findById()!");
		}finally{
			
			DBUtil.close(rs, ps, con);
			
		}
		return list;
	}		
		
		
	
	public List<Employee> findByJob(String job) {

		
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		String sql = "select * from tb_emp where empJob ="+"'"+ job+"'";
		List<Employee> list = new ArrayList<Employee>();
				
		try{	
	
			con = DBUtil.getConnection();
			System.out.print(sql);
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			while(rs.next()){
				
				Employee emp = new Employee();
				emp.setEmpId(rs.getInt("empId"));
				emp.setName(rs.getString("empName"));
				emp.setEmpJob(rs.getString("empJob"));
				emp.setSex(rs.getString("sex"));
				emp.setPhone(rs.getString("phone"));
				emp.setMobile(rs.getString("mobile"));
				emp.setEmail(rs.getString("email"));
				emp.setIdCard(rs.getString("idCard"));
				emp.setAddress(rs.getString("address"));
				emp.setPost(rs.getString("post"));
		 
				
				list.add(emp);
				
			}
			
			
		}catch(Exception e){
			e.printStackTrace();
			System.out.println("EmployeeDaoImpl:findByJob()!");
		}finally{
			
			DBUtil.close(rs, ps, con);
			
		}
		return list;
	}
	
	
	
	public List<Employee> findByName(String name) {
		
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		String sql = "select * from tb_emp where empName like ? order by empId";
		List<Employee> list = new ArrayList<Employee>();
				
		try{	
	
			con = DBUtil.getConnection();
			ps = con.prepareStatement(sql);
	
			ps.setString(1, "%" + name + "%");
			
			rs = ps.executeQuery();
			while(rs.next()){
				
				Employee emp = new Employee();
				emp.setEmpId(rs.getInt("empId"));
				emp.setName(rs.getString("empName"));
				emp.setEmpJob(rs.getString("empJob"));
				emp.setSex(rs.getString("sex"));
				emp.setPhone(rs.getString("phone"));
				emp.setMobile(rs.getString("mobile"));
				emp.setEmail(rs.getString("email"));
				emp.setIdCard(rs.getString("idCard"));
				emp.setAddress(rs.getString("address"));
				emp.setPost(rs.getString("post"));
		 
				
				list.add(emp);
				
			}
			
			
		}catch(Exception e){
			e.printStackTrace();
			System.out.println("EmployeeDaoImpl:findByName() err");
		}finally{
			
			DBUtil.close(rs, ps, con);
			
		}
		return list;
	}	
	
	
	public Employee findByPhone(String phone) {

		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		String sql = "select * from tb_emp where phone = ? ";
		Employee emp = new Employee();
				
		try{	
			con = DBUtil.getConnection();
			ps = con.prepareStatement(sql);
			ps.setString(1, phone);
			rs = ps.executeQuery();
				emp.setEmpId(rs.getInt("empId"));
				emp.setName(rs.getString("empName"));
				emp.setEmpJob(rs.getString("empJob"));
				emp.setSex(rs.getString("sex"));
				emp.setPhone(rs.getString("phone"));
				emp.setMobile(rs.getString("mobile"));
				emp.setEmail(rs.getString("email"));
				emp.setIdCard(rs.getString("idCard"));
				emp.setAddress(rs.getString("address"));
				emp.setPost(rs.getString("post"));
		 		
		}catch(Exception e){
			e.printStackTrace();
			System.out.println("EmployeeDaoImpl:findByPhone() err");
		}finally{
			
			DBUtil.close(rs, ps, con);
			
		}
		return emp;
	}	
	
	
	public List<Employee> findBySex(String sex) {
		
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		String sql = "select * from tb_emp where sex = ? order by empId";
		List<Employee> list = new ArrayList<Employee>();
				
		try{	
	
			con = DBUtil.getConnection();
			ps = con.prepareStatement(sql);
	
			ps.setString(1, sex);
			
			rs = ps.executeQuery();
			while(rs.next()){
				
				Employee emp = new Employee();
				emp.setEmpId(rs.getInt("empId"));
				emp.setName(rs.getString("empName"));
				emp.setEmpJob(rs.getString("empJob"));
				emp.setSex(rs.getString("sex"));
				emp.setPhone(rs.getString("phone"));
				emp.setMobile(rs.getString("mobile"));
				emp.setEmail(rs.getString("email"));
				emp.setIdCard(rs.getString("idCard"));
				emp.setAddress(rs.getString("address"));
				emp.setPost(rs.getString("post"));
		 
				
				list.add(emp);
				
			}
			
			
		}catch(Exception e){
			e.printStackTrace();
			System.out.println("EmployeeDaoImpl:findBySex() err");
		}finally{
			
			DBUtil.close(rs, ps, con);
			
		}
		return list;
	}	
	

	
	public boolean insertEmployee(Employee emp) {

		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		String sql = "insert into tb_emp(empName,empJob,sex,phone,mobile,email,idCard,address,post)" +
				"values(?,?,?,?,?,?,?,?,?)"; 
		int ret = 0;
		try{	
			con = DBUtil.getConnection();
			ps = con.prepareStatement(sql);
			ps.setString(1, emp.getName());
			ps.setString(2, emp.getEmpJob());
			ps.setString(3, emp.getSex());
			ps.setString(4, emp.getPhone());
			ps.setString(5, emp.getMobile());
			ps.setString(6, emp.getEmail());
			ps.setString(7, emp.getIdCard());
			ps.setString(8, emp.getAddress());
			ps.setString(9, emp.getPost());
			
			ret  = ps.executeUpdate();
 		}catch(Exception e){
			e.printStackTrace();
			System.out.println("EmployeeDaoImpl:insertEmployee() error");
		}finally{
			
			DBUtil.close(rs, ps, con);
			
		}
		if(ret==0){
		return false;
		}else{
			return true;
		}
	}	
	
	
	public boolean updataEmployee(Employee emp) {
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		System.out.println( emp.getEmpId() + "aaaaaaaa");
 		String sql = "Update tb_emp set" +
 					" empName = '" + emp.getName() + "', " +
 					" empJob = '" + emp.getEmpJob() + "', " +
 					" sex = '" + emp.getSex() + "', " +
 					" phone = '" + emp.getPhone() + "', " +
 					" mobile = '" + emp.getMobile() + "', " +
 					" email = '" + emp.getEmail() + "', " +
 					" idCard = '" + emp.getIdCard() + "', " +
 					" address = '" + emp.getAddress() + "', " +
 					" post = '" + emp.getPost() + "' " +
 					" where empId = " + emp.getEmpId();
		int i = 0;
		try{	
			con = DBUtil.getConnection();
			ps = con.prepareStatement(sql);
			i  = ps.executeUpdate();
 		}catch(Exception e){
			e.printStackTrace();
			System.out.println("EmployeeDaoImpl:updataEmployee() err");
		}finally{
			
			DBUtil.close(rs, ps, con);
			
		}
		if(i==0){
			return false;
		}else{
			return true;
		}
	}

	public List<Employee> findallEmployee() {
		return null;
	}	

}
