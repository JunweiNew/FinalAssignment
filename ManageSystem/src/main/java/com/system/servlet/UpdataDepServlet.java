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

public class UpdataDepServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("an exception occurs ");
		doPost(request, response);		
 	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("modify successfully ");
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
			
		String id = request.getParameter("depId");
		String name = request.getParameter("depName");
		String number = request.getParameter("depNumber");
		String phone = request.getParameter("depPhone");
		String mobile = request.getParameter("depMobile");
		String email = request.getParameter("depEmail");
		String leader = request.getParameter("depLeader");
		Department dep = new Department();
		
		dep.setDepId(Integer.parseInt(id));
		dep.setDepName(name);
		dep.setDepNumber(number);
		dep.setDepPhone(phone);
		dep.setDepMobile(mobile);
		dep.setDepEmail(email);
		dep.setDepLeader(leader);
		DepartmentDao dao = new DepartmentDaoImplement();
		
		if(dao.updataDepart(dep)){
			List<Department> deps = dao.findById(Integer.parseInt(id));
			request.setAttribute("deps", deps);
			request.setAttribute("errormessage", "modify successfully ");
			request.getRequestDispatcher("/department/departbrower.jsp").forward(request, response);
		}else{

			request.setAttribute("errormessage", "an exception occurs");
			
			String errormessage = (String) request.getAttribute("errormessage");
			
			System.out.println(errormessage);

			request.getRequestDispatcher("departbrower.jsp").forward(request, response);
 		}
	}
	
	public void init() throws ServletException {
		// Put your code here
		
	}

}
