package com.system.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.system.admin.entry.Admin;
import com.system.dao.UserDao;
import com.system.dao.implement.UserDaoImplement;

public class UpdataAdminServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		resp.setCharacterEncoding("utf-8");
		
		System.out.println("Enter the password change interface");
		HttpSession session = req.getSession();
		
		
		String username = (String) session.getAttribute("username");
		String password = req.getParameter("password");
		System.out.println(username);
		System.out.println(password);
		
		UserDao dao = new UserDaoImplement();
		Admin admins = dao.findUser(username);
		admins.setPassword(password);
			
		System.out.println("change password success");
		req.setAttribute("admins", admins);	
		req.getRequestDispatcher("/admin/broweradmin.jsp").forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		this.doGet(req, resp);
	}
}
