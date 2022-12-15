<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Epargne | Entr&eacute;es</title>
<link rel="stylesheet" href="./bootstrap.min.css">
</head>
<body>
	<%@ include file="menu.html" %>
	<div class="container">
		<div class="container-fluid">
		
			<h1 class="h1 mt-2 mb-2">Entr&eacute;es</h1>
			<h1 class="text-info mt-4 mb-2">Simulateur de prêt (Quel Montant d&eacute;poser)</h1>
			
			<form action="Controleur" method="POST" class="form col-lg-9 col-md-6">
				<div class="form-group row">
					<label class="col-form-label col-lg-4" for="pret">Montant souhaité (FCFA): </label>
					<input class="form-control col" type="text" name="ms" value="" id="pret" required>
				</div>
				<div class="form-group row">
					<label class="col-form-label col-lg-4" for="taux">Taux d'Intérêt Annuel (%)</label>
					<input class="form-control col" type="text" name="taux" value="" id="taux" required>
				</div>
				<div class="form-group row">
					<label class="col-form-label col-lg-4" for="na">Nombre d'année</label>
					<input class="form-control col" type="text" name="na" value="" id="na" required>
					<input type="hidden" name="forme" value="forme1">
				</div>
				
				<div><input class="btn btn-success mt-4 pl-4 pr-4 h3" type="submit" value="Calculer"></div>
			</form>
			
		</div>
	</div>
</body>
</html>