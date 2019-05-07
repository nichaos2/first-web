package com.in28minutes.login;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.in28minutes.todo.TodoService;

import sqlite.connect.LoginModel;

@WebServlet(urlPatterns = "/login.do")
public class LoginServlet extends HttpServlet {

	private LoginService userValidationService = new LoginService();
	private TodoService todoService = new TodoService();

	private LoginModel login = new LoginModel();

	// handle the get method
	protected void doGet(HttpServletRequest request, HttpServletResponse respone) throws ServletException, IOException {

		// add attribute to the jsp; EL dynamically picks it and puts it in the context
		request.setAttribute("name", request.getParameter("name"));
		request.setAttribute("password", request.getParameter("password"));

		// the attribute with the name "param" shows all the parameters from any method
		request.setAttribute("param", request.getParameter(""));

		// redirect to jsp file; home folder is the webapp
		request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request, respone);

		// write html content type
		/*
		 * PrintWriter out = respone.getWriter(); out.println("Dummy");
		 */
	}

	// handle the get method
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// redirect to jsp file; home folder is the webapp
		String name = request.getParameter("name");
		String pass = request.getParameter("password");
		request.getSession().setAttribute("name", name); // session scope to keep it from one servle to another
		request.setAttribute("password", pass);

		boolean isUserValid = userValidationService.isUserValid(name, pass);

		if (isUserValid) {

			if (login != null) {
				System.out.println("connection with database success");
			}

			// put everything in the welcome page
			// request.setAttribute("todos", todoService.retrieveTodos());
			// request.getRequestDispatcher("/WEB-INF/views/welcome.jsp").forward(request,
			// respone);

			// redirect to the todo.do Servlet
			response.sendRedirect("/todo.do");

		} else {
			request.setAttribute("errorMsg", "Invalid credentials!");
			request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request, response);

		}
	}

}
