package com.system.dao.implement;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


import com.system.admin.entry.Admin;
import com.system.dao.UserDao;
import com.system.employee.util.DBUtil;

public class UserDaoImplement implements UserDao {
	public boolean findUser(String username, String password) {
		// TODO Auto-generated method stub

		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		String sql = "select * from tb_user where username=? and password = ?;";
		
		try{
			
			con = DBUtil.getConnection();
			ps = con.prepareStatement(sql);
			ps.setString(1,username );
			ps.setString(2, password);
			rs = ps.executeQuery();
			if(rs.next()){
				return true;
			}
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			
			DBUtil.close(rs, ps, con);
			
		}
		
		
		return false;
	}
	
	
	public Admin findUser(String username){
		Connection con       = null;
		PreparedStatement ps = null;
		ResultSet  rs		 = null;
		String sql 			 = "select * from tb_user where username = '" +username+ "'";
		Admin admin = new Admin();
		try {
			con = DBUtil.getConnection();
			ps  = con.prepareStatement(sql);
			rs  = ps.executeQuery();
			if(rs.next()){
				admin.setUsername(admin.getUsername());
				admin.setPassword(admin.getPassword());
			}
		}catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return admin;
		
	}
	
	
	public List<Admin> findAllAdmin(){
		Connection con       = null;
		PreparedStatement ps = null;
		ResultSet  rs		 = null;
		String sql 			 = "select * from tb_user";
		List<Admin> list     = new ArrayList<Admin>();
		
		con = DBUtil.getConnection();
		try {
			ps  = con.prepareStatement(sql);
			rs  = ps.executeQuery();
			while(rs.next()){
				Admin admins = new Admin();
				admins.setUsername(rs.getString("username"));
				admins.setPassword(rs.getString("password"));
				System.out.println(admins);
				
				list.add(admins);
			}
		}catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
 	}
	
	
	public boolean delUser(String username){
		Connection con       = null;
		PreparedStatement ps = null;
		int row = 0;
		String sql 			 = "delete from tb_user where username='"+username+"'";
		con = DBUtil.getConnection();
		try {
			ps = con.prepareStatement(sql);
			row = ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		if(0 == row){
			return false;
		}else{
			return true;
		}
	}	
	
	
	public boolean insertAdmin(Admin admin) {
		Connection con       = null;
		PreparedStatement ps = null;
		ResultSet rs         = null;
		String sql = "insert into tb_user(username,password) values('" +admin.getUsername()+ "','" +admin.getPassword()+ "')";
		
		con = DBUtil.getConnection();
		int ret = 0;
		try {
			ps  = con.prepareStatement(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			ret = ps.executeUpdate();
		} catch (SQLException e) {
			System.out.println("Error inserting administrator information");
			e.printStackTrace();
		}finally{
			DBUtil.close(rs, ps, con);
		}
		if(1==ret){
			return true;
		}
		else{
			return false;	
		}
	}	
	
	public boolean updatePassword(Admin admin) {
		Connection con       = null;
		PreparedStatement ps = null;
		ResultSet rs         = null;
		String sql = "update tb_user set password=" +admin.getPassword()+ "where username=" + admin.getUsername();
		
		con = DBUtil.getConnection();
		int ret = 0;
		try {
			ps  = con.prepareStatement(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			ret = ps.executeUpdate();
		} catch (SQLException e) {
			System.out.println("Error update administrator password");
			e.printStackTrace();
		}finally{
			DBUtil.close(rs, ps, con);
		}
		if(1==ret){
			return true;
		}
		else{
			return false;	
		}
	}

}
