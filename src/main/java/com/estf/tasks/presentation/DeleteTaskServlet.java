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
 * Servlet implementation class DeleteTaskServlet
 */
@WebServlet("/delete")
public class DeleteTaskServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("delete");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		Task[] tasks = (Task[]) DefaultServices.getInstance().allTasks().toArray();
		for (Task task : tasks) {
			if(task.getId() == id)
				DefaultServices.getInstance().deleteTask(task);
		}
		response.sendRedirect("list");
	}

}
