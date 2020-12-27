package com.system.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//import org.omg.CORBA.Request;

import com.system.admin.entry.Admin;
import com.system.dao.UserDao;
import com.system.dao.implement.UserDaoImplement;

public class DelAdminServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		req.setCharacterEncoding("utf-8");
		resp.setCharacterEncoding("utf-8");
		
		UserDao dao = new UserDaoImplement();
		String username = req.getParameter("username");
		System.out.println(username);
		if(dao.delUser(username)){
			System.out.println("");
			List<Admin> admins = dao.findAllAdmin();
			req.setAttribute("admins", admins);
			req.getRequestDispatcher("/admin/broweradmin.jsp").forward(req, resp);
		}
		else{
			System.out.println("");
			req.getRequestDispatcher("/admin/broweradmin.jsp").forward(req, resp);
		}
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		this.doGet(req, resp);
	}
}
