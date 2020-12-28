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

public class FindByEmpServer extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		this.doPost(req, resp);
		
	}
	
	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {

			req.setCharacterEncoding("utf-8");
			resp.setCharacterEncoding("utf-8");
			
			String select = req.getParameter("select");
			String input  = req.getParameter("input");
			System.out.println(select+input);
			if(select.equals("1")){
		 		EmployeeDao dao = new EmployeeDaoImplement();
		 		int id = Integer.parseInt(input);
		 		List<Employee> emps = dao.findById(id);
		 		req.setAttribute("emps", emps);
		 		req.getRequestDispatcher("/employee/person.jsp").forward(req, resp);
			}else if(select.equals("2")){
				EmployeeDao dao = new EmployeeDaoImplement();
		 		List<Employee> emps = dao.findByName(input);
		 		req.setAttribute("emps", emps);
		 		req.getRequestDispatcher("/employee/person.jsp").forward(req, resp);
			}else if(select.equals("3")){
				EmployeeDao dao = new EmployeeDaoImplement();
		 		List<Employee> emps = dao.findByJob(input);
		 		req.setAttribute("emps", emps);
		 		req.getRequestDispatcher("/employee/person.jsp").forward(req, resp);
			}else{
				EmployeeDao dao = new EmployeeDaoImplement();
		 		List<Employee> emps = dao.findBySex(input);
		 		req.setAttribute("emps", emps);
		 		req.getRequestDispatcher("/employee/person.jsp").forward(req, resp);
			}
	}
	
	public void init() throws ServletException {
		// Put your code here
	}

}
