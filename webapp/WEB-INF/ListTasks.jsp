<%@page import="com.estf.tasks.beans.Task"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">

<head>
<meta charset="ISO-8859-1">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Tasks</title>
<script src="js/main.js" type="module"></script>
<link rel="stylesheet" href="css/main.css">
</head>

<body>
	<header>
		<h1>Tasks</h1>
		<!-- <button id="refresh">Refresh</button> -->
		<a href="add">Add Task</a>
	</header>
	<main>
		<section id="sectionTasks">
			<h2>List</h2>
			<div id="tasks">
				<%
				List<Task> tasks = (List<Task>) request.getAttribute("tasks");
				%>
				<%
				for (Task task : tasks) {
				%>
				<div>
					<p><%=task.getTitle()%></p>
					<a id="delete" href="delete?id=<%=task.getId()%>">X</a>
				</div>
				<div id="btnsOd">
					<a id="top" href="top?id=<%=task.getId()%>">top</a>
					<a id="bottom" href="bottom?id=<%=task.getId()%>">bottom</a>
				</div>

				<%
				}
				%>
			</div>
		</section>
	</main>
	<footer></footer>
</body>

</html>