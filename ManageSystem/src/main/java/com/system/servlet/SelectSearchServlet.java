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

public class SelectSearchServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
  		//doPost(request, response);
		// TODO Auto-generated method stub
				super.doGet(request, response);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
 
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		
		String select = request.getParameter("select");
		System.out.println(select + "......");
		String Input = request.getParameter("Input");
		System.out.println(Input + "......");
		EmployeeDao dao = new EmployeeDaoImplement();
		List<Employee> emps = dao.findAllEmployee(1,10);

		if(select.equals("1")){
			System.out.println("1");
			emps = dao.findById(Integer.parseInt(Input));			
			request.setAttribute("emps", emps);
			request.getRequestDispatcher("person.jsp").forward(request, response);
		}else if(select.equals("2")){
			emps = dao.findByName(Input);
			request.setAttribute("emps", emps);
			request.getRequestDispatcher("person.jsp").forward(request, response);
		}else if(select.equals("3")){			
			emps = dao.findByJob(Input);
			request.setAttribute("emps", emps);
			request.getRequestDispatcher("person.jsp").forward(request, response);
		}else if(select.equals("4")){
			emps = dao.findBySex(Input);
			request.setAttribute("emps", emps);
			request.getRequestDispatcher("person.jsp").forward(request, response);
 		}else{
  			List<Employee> empes = dao.findAllEmployee(1,10);
 			request.setAttribute("emps", empes);
 			request.getRequestDispatcher("person.jsp").forward(request, response);
		}	
 	}

}
