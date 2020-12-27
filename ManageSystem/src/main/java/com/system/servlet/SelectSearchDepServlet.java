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

public class SelectSearchDepServlet extends HttpServlet {
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
		
		String select = request.getParameter("select");
 		
 		String Input =request.getParameter("Input");
		System.out.println(Input + ":"+select);
		DepartmentDao dao = new DepartmentDaoImplement();
 
		if(select.equals("1")){
		
			List<Department> deps = dao.findById(Integer.parseInt(Input));			
			request.setAttribute("deps", deps);
			request.getRequestDispatcher("departbrower.jsp").forward(request, response);
		}else if(select.equals("2")){
			List<Department> deps = dao.findByName(Input);
			System.out.println(deps);

			request.setAttribute("deps", deps);
			request.getRequestDispatcher("departbrower.jsp").forward(request, response);
		}else if(select.equals("3")){			
			List<Department> deps = dao.findByLeader(Input);
			request.setAttribute("deps", deps);
			request.getRequestDispatcher("departbrower.jsp").forward(request, response);
		}else{
			List<Department> deps = dao.findAllDeparte();
 			request.setAttribute("deps", deps);
 			request.getRequestDispatcher("departbrower.jsp").forward(request, response);
		}	
 	}
}
