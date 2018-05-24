package ca.alibahrani.tutorial;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/serverletexample")
public class ServerletExample extends HttpServlet implements Servlet {
	private static final long serialVersionUID = 1L;
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		if(request.getParameter("firstname") == null || request.getParameter("lastname") == null) {
			
			getServletContext().getRequestDispatcher("/index.jsp").forward(request, response);
			return;
		}
		
		String firstname = request.getParameter("firstname");
		String lastname = request.getParameter("lastname");
		
		request.setAttribute("firstname", firstname);
		request.setAttribute("lastname", lastname);
		
		getServletContext().getRequestDispatcher("/output.jsp").forward(request, response);
		
		
	}

}
