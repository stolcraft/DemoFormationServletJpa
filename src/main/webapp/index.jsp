<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.Date"%>
<!DOCTYPE html>
<html>
<head>
<style type="text/css">
</style>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">
<script
	src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"
	integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM"
	crossorigin="anonymous"></script>
<meta charset="ISO-8859-1">
<title>Accueil</title>
</head>
<body>

	<!-- On intègre un formulaire à la page HTML -->



	<div class="card" style="width: 45rem; margin:10px">
		<h5 class="card-header">Page Principal</h5>
		<div class="card-body">
			<h5 class="card-title">Pour enregistrer une formation :</h5>
			<p class="card-text">cliquer sur le bouton !</p>
			<form id="test" action="infos" method="post">
				<button type="submit"  class="btn btn-primary btn-lg">Formation
			
				</button>
			</form>
		</div>
	</div>


</body>
</html>