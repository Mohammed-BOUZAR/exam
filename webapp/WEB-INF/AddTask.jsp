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
<link rel="stylesheet" href="./css/main.css">
</head>

<body>
	<header>
		<h1>Tasks</h1>
		<!-- <button id="refresh">Refresh</button> -->
        <a href="list">List Tasks</a>
	</header>
	<main>
		<section id="sectionForm">
			<h2>Add Form</h2>
			<form id="form" action="add" method="POST">
				<input type="text" placeholder="Title..." id="title" name="title">
				<div id="btns">
					<button type="reset" id="reset">Reset</button>
					<button type="submit" id="submit">Submit</button>
				</div>
			</form>
		</section>
	</main>
	<footer></footer>
</body>

</html>