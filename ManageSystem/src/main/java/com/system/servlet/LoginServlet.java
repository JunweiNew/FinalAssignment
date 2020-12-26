package com.system.servlet;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.system.dao.UserDao;
import com.system.dao.implement.UserDaoImplement;

public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
//	public void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
			
		String username = request.getParameter("username");
		String password = request.getParameter("password");
 	
 		
		try{
 
 			
		UserDao dao = new UserDaoImplement();	
		if(dao.findUser(username, password)){			
			response.sendRedirect("employee/index.jsp");
			HttpSession session = request.getSession();
			
			if(username!= null)
			{
				session.setAttribute("username", username);
			}

		}else{
			
			request.setAttribute("errormessage", "an exception occurs");
			
			String errormessage = (String) request.getAttribute("errormessage");
			
			System.out.println(errormessage);

			request.getRequestDispatcher("login.jsp").forward(request, response);
	 		
			
		}
		}catch(Exception e){
			
			e.printStackTrace();
			System.out.println("an exception occurs!");
		} 
	}
}
