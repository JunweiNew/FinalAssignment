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
 
public class BrowerDepServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
  		doPost(request, response);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
 		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		
		DepartmentDao dao = new DepartmentDaoImplement();
		List<Department> deps = dao.findAllDeparte();
		System.out.println(deps);
		request.setAttribute("deps", deps);
 		request.getRequestDispatcher("../department/departbrower.jsp").forward(request, response);
 
			}

}
