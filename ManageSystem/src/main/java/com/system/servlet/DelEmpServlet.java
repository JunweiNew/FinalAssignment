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

public class DelEmpServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

 		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		
 		System.out.println("");
		doPost(request, response);
		
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

 		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		
		EmployeeDao dao = new EmployeeDaoImplement();
		
		int id = Integer.parseInt(request.getParameter("id"));
		System.out.println(id);
 		if(dao.deleteEmployee(id)==true){

			List<Employee> emps = dao.findAllEmployee();
			request.setAttribute("emps", emps);
 			request.getRequestDispatcher("person.jsp").forward(request, response);
		}else{
 			request.setAttribute("errormessage", "delete employee error");
			List<Employee> emps = dao.findAllEmployee();			
			request.setAttribute("emps", emps);
 			request.getRequestDispatcher("person.jsp").forward(request, response);
			
		}
 	}
}
