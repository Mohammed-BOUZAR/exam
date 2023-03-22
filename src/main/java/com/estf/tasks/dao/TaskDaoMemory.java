package com.estf.tasks.dao;

import java.util.Iterator;
import java.util.List;
import java.util.Vector;

import com.estf.tasks.beans.Task;

public class TaskDaoMemory implements TaskDao	{
	
	private List<Task> tasks;
	private int id;
	
	public TaskDaoMemory() {
		tasks = new Vector<Task>();
		id = 1;
	}

	@Override
	public void addTask(Task task) {
		task.setId(id++);
		tasks.add(task);
	}

	@Override
	public void deleteTask(Task task) {
		int i = tasks.indexOf(task);
		tasks.remove(i);
	}

	@Override
	public void toTop() {
		
	}

	@Override
	public void toBottom() {
		
	}

	@Override
	public List<Task> allTasks() {
		return tasks;
	}

}
