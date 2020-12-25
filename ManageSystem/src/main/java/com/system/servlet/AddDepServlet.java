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


public class AddDepServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doGet(request, response);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		
		System.out.println("addep");
		
		
		String depName = request.getParameter("depName");
		String depNumber = request.getParameter("depNumber");
		String depPhone = request.getParameter("depPhone");
		String depMobile = request.getParameter("depMobile");
		String depEmail = request.getParameter("depEmail");
		String depLeader = request.getParameter("depLeader");
	
		Department dep = new Department();
 		dep.setDepName(depName);
 		dep.setDepNumber(depNumber);
 		dep.setDepPhone(depPhone);
 		dep.setDepMobile(depMobile);
 		dep.setDepEmail(depEmail);
 		dep.setDepLeader(depLeader);
 	
 		DepartmentDao dao = new DepartmentDaoImplement();
		if(dao.insertDepart(dep)){
			
			request.setAttribute("errormessage", "succeed");
			
			String errormessage = (String) request.getAttribute("errormessage");
			
			List<Department> deps = dao.findAllDeparte();
			
			request.setAttribute("deps", deps);
 			request.getRequestDispatcher("departbrower.jsp").forward(request, response);
			
		}else{
			request.setAttribute("errormessage", "warning");
			
			String errormessage = (String) request.getAttribute("errormessage");
			
			System.out.println(errormessage);
			
			request.getRequestDispatcher("departregister.jsp").forward(request, response);

		}
 
	}
	

}
