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

public class BrowerAdminServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {

		req.setCharacterEncoding("utf-8");
		resp.setCharacterEncoding("utf-8");
		System.out.println("Welcome to the administrator query interface");
		
		UserDao dao = new UserDaoImplement();
		List<Admin> admins = dao.findAllAdmin();
		System.out.println(admins);
		req.setAttribute("admins", admins);
		req.getRequestDispatcher("/admin/broweradmin.jsp").forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		this.doGet(req, resp);
	}
	public void init() throws ServletException {
		// Put your code here
	}

}
