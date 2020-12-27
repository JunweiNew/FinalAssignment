package com.system.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.system.department.entry.Department;
import com.system.dao.DepartmentDao;
import com.system.dao.implement.DepartmentDaoImplement;

public class DelDepServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		resp.setCharacterEncoding("utf-8");
		
		DepartmentDao dao = new DepartmentDaoImplement();
		int id = Integer.parseInt(req.getParameter("id"));
		System.out.println(id);
		if(dao.deleteDepart(id)==true){
			List<Department> deps = dao.findAllDeparte();
			req.setAttribute("deps", deps);
			req.getRequestDispatcher("/department/departbrower.jsp").forward(req, resp);
		}
		else{
			req.setAttribute("errormessage", "delete error");
			List<Department> deps = dao.findAllDeparte();
			req.setAttribute("deps", deps);
			req.getRequestDispatcher("departbrower.jsp").forward(req, resp);
		}
	}
	
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		this.doGet(req, resp);
	}
}
