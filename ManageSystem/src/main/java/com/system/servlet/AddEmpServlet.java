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

public class AddEmpServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
 		System.out.println("an exception occurs");
		doPost(request, response);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
 
 		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8"); 
		
		String empName = request.getParameter("empName");
		String sex = request.getParameter("sex");
		String idCard = request.getParameter("idCard");
		String phone = request.getParameter("phone");
		String email = request.getParameter("email");
		String address = request.getParameter("address");
		String post = request.getParameter("post");
		String mobile = request.getParameter("mobile");
		String empJob = request.getParameter("duty");
		
		Employee emp = new Employee();
 		emp.setName(empName);
 		emp.setSex(sex);
 		emp.setIdCard(idCard);
 		emp.setPhone(phone);
 		emp.setEmail(email);
 		emp.setAddress(address);
 		emp.setPost(post);
 		emp.setMobile(mobile);
 		emp.setEmpJob(empJob);
 		
 		EmployeeDao dao = new EmployeeDaoImplement();
		if(dao.insertEmployee(emp)){

			request.setAttribute("errormessage", "Insert success");
			
			String errormessage = (String) request.getAttribute("errormessage");
			
			List<Employee> emps = dao.findAllEmployee(1,5);
			
			request.setAttribute("emps", emps);
 			request.getRequestDispatcher("/employee/person.jsp").forward(request, response);
			
		}else{

			request.setAttribute("errormessage", "warning,insert fail");
			
			String errormessage = (String) request.getAttribute("errormessage");
			
			System.out.println(errormessage);

			request.getRequestDispatcher("personregister.jsp").forward(request, response);

		}
	}
}
