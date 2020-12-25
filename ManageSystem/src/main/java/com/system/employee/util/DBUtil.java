package com.system.employee.util;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Connection;

public class DBUtil {
	private static final String DRIVERNAME = "com.mysql.jdbc.Driver";
	private static final String USERNAME = "root"; 
	private static final String PASSWORD = "123456";
	private static final String URL="jdbc:mysql://localhost:3306/mysql01";

	static {
		try {
			Class.forName(DRIVERNAME);		
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("load db fail");
		}
	}
	//connect database
	public static Connection getConnection(){
		Connection con = null;
		try {
			con =  DriverManager.getConnection(URL,USERNAME,PASSWORD);	
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("connect db fail!");
		}
		return con;
	}

	public static void close(ResultSet rs,Statement st,Connection con){
		try {
			if(rs!=null)rs.close();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("close db abnormal");
		}finally{
			try {
				if(st!=null)st.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.out.println("waring!Serious error!");
			}finally{			
				try {
					if(con!=null)con.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					System.out.println("waring!Serious error!");
				}			
			}
		}
	}
}
