package com.estf.tasks.presentation;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.estf.tasks.beans.Task;
import com.estf.tasks.business.DefaultServices;

/**
 * Servlet implementation class AddTaskServlet
 */
@WebServlet("/add")
public class AddTaskServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	public AddTaskServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("add");
		request.getRequestDispatcher("/WEB-INF/AddTask.jsp").forward(request, response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String title = request.getParameter("title");
		if(title.trim().length() == 0)
			request.getRequestDispatcher("/WEB-INF/AddTask.jsp").forward(request, response);
		Task task = new Task();
		task.setTitle(title);
		DefaultServices.getInstance().addTask(task);
		response.sendRedirect("list");
	}

}
