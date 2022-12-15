<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="domaine.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Epargne | Résultats</title>
<link rel="stylesheet" href="./bootstrap.min.css">
</head>
<body>
	<%@ include file="menu.html" %>
	<div class="container">
		<div class="container-fluid">
		
			<h1 class="h1 mt-2 mb-2">Sortie</h1>
			<h1 class="text-success mt-4 mb-2">Résultats</h1>
			
			<% Epargne epargne = (Epargne) request.getAttribute("epargne"); %>
			
			<h2>Données Saisies</h2>			
			<div>Montant du souhaité : <%= epargne.getMS() %> FCFA</div>
			<div>Nombre d'années : <%= epargne.getNa() %> an(s)</div>
			<div>Taux : <%= epargne.getTia() %> %</div>
			
			<h2>Résultats du simulateur</h2>
			<div><b>Montant à déposer : <i><%= epargne.getMDEP() %> FCFA</i></b></div>
		</div>
	</div>
</body>
</html>