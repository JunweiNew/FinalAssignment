package com.system.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.system.admin.entry.Admin;
import com.system.dao.UserDao;
import com.system.dao.implement.UserDaoImplement;

public class AddAdminServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		resp.setCharacterEncoding("utf-8");
		System.out.println("Enter the administrator add interface");
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		
		Admin admin = new Admin();
		admin.setUsername(username);
		admin.setPassword(password);
		
		UserDao dao = new UserDaoImplement();
		if(dao.insertAdmin(admin)){
			System.out.println("add administrator sucess");
			List<Admin> admins = dao.findAllAdmin();
			req.setAttribute("admins", admins);
			req.getRequestDispatcher("/admin/broweradmin.jsp").forward(req, resp);
		}
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		this.doGet(req, resp);
	}
}
