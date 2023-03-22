package com.estf.tasks.business;

import java.util.List;

import com.estf.tasks.beans.Task;

public interface Sevices {
	void addTask(Task task);
	void deleteTask(Task task);
	void toTop();
	void toBottom();
	List<Task> allTasks();
}
