package com.system.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import com.system.dao.EmployeeDao;
import com.system.dao.implement.EmployeeDaoImplement;
import com.system.employee.entry.Employee;

public class ToUpdataEmpServlet extends HttpServlet {
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
			
		String id = request.getParameter("id");
		
		EmployeeDao dao = new EmployeeDaoImplement();
		List<Employee> emps = dao.findById(Integer.parseInt(id));		
		request.setAttribute("emps", emps);	
		request.getRequestDispatcher("personupdate.jsp").forward(request, response);
  						
	}

}
