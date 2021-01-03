package com.system.servlet;

import static org.junit.Assert.*;

import java.io.IOException;

import static org.easymock.EasyMock.*;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import org.mockito.Mockito;

public class AdminServletTest extends Mockito{

	private AddAdminServlet Adminservlet;
	private HttpServletRequest mockRequest;  
    private HttpServletResponse mockResponse;
   
    @Before  
    public void setUp(){  
    	Adminservlet = new AddAdminServlet();  
          
        mockRequest = createMock(HttpServletRequest.class);
        mockResponse = createMock(HttpServletResponse.class);  
    }  
      
    @After  
    public void tearDown(){  
        verify(mockRequest);  
        verify(mockResponse);  
    }  
    
    
	@Test
	public void test() throws IOException, ServletException{
        mockRequest.getParameter("username");
        expectLastCall().andReturn("admin");  
          
        mockRequest.getParameter("password");
        expectLastCall().andReturn("123456");
        
        mockResponse.sendRedirect("login.jsp");  
          
        replay(mockRequest);
        replay(mockResponse);
        
        Adminservlet.doPost(mockRequest, mockResponse); 

/*
        try{
        	Adminservlet.doPost(mockRequest, mockResponse);
        }catch(ServletException e) {
        	e.printStackTrace();
        }catch(IOException e) {
        	e.printStackTrace();
        }
        
        assertTrue(true);
*/
	}
}
