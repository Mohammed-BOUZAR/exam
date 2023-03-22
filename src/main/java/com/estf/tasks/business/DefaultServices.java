package com.estf.tasks.business;

import java.util.List;

import com.estf.tasks.beans.Task;
import com.estf.tasks.business.DefaultServices;
import com.estf.tasks.dao.TaskDao;
import com.estf.tasks.dao.TaskDaoMemory;

public class DefaultServices implements Sevices{
	
	private static DefaultServices instance = null;
	public static DefaultServices getInstance() {
		if(instance==null)
			instance=new DefaultServices(new TaskDaoMemory());	
		return instance;
	}
	
	private TaskDao taskDao;
	private DefaultServices(TaskDao taskDao) {
		this.taskDao=taskDao;
	}

	@Override
	public void addTask(Task task) {
		taskDao.addTask(task);
	}

	@Override
	public void deleteTask(Task task) {
		taskDao.deleteTask(task);
	}

	@Override
	public void toTop() {
		taskDao.toTop();
	}

	@Override
	public void toBottom() {
		taskDao.toBottom();
	}

	@Override
	public List<Task> allTasks() {
		return taskDao.allTasks();
	}
	
}
