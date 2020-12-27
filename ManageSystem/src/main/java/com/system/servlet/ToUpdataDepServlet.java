package com.system.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//import org.omg.CORBA.Request;

import com.system.department.entry.Department;
import com.system.dao.DepartmentDao;
import com.system.dao.implement.DepartmentDaoImplement;

public class ToUpdataDepServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

protected void doGet(HttpServletRequest req, HttpServletResponse resp)
		throws ServletException, IOException {

	
	System.out.println("Welcome to the modify interface");
	req.setCharacterEncoding("utf-8");
	resp.setCharacterEncoding("utf-8");
	
	String id = req.getParameter("id");
	System.out.println(id);
	DepartmentDao dao = new DepartmentDaoImplement();
	List<Department> deps = dao.findById(Integer.parseInt(id));
	req.setAttribute("deps", deps);

	req.getRequestDispatcher("/department/departupdate.jsp").forward(req, resp);
}
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		this.doGet(req, resp);
	}
}
