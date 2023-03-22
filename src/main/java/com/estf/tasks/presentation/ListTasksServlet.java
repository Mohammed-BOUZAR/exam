package com.estf.tasks.presentation;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.estf.tasks.beans.Task;
import com.estf.tasks.business.DefaultServices;

/**
 * Servlet implementation class ListTasksServlet
 */
@WebServlet("/list")
public class ListTasksServlet extends HttpServlet {

	public ListTasksServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("list");
		List<Task> tasks = DefaultServices.getInstance().allTasks();
//		List<Task> tasks = (List<Task>) request.getAttribute("tasks");
//		if(tasks.size() == 0)
		request.setAttribute("tasks", tasks);
		request.getRequestDispatcher("/WEB-INF/ListTasks.jsp").forward(request, response);
	}
}
