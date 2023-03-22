package com.estf.tasks.dao;

import java.util.List;

import com.estf.tasks.beans.Task;

public interface TaskDao {
	void addTask(Task task);
	void deleteTask(Task task);
	void toTop();
	void toBottom();
	List<Task> allTasks();
}
