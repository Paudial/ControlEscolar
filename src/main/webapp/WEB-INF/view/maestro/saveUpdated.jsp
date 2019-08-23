<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="sf"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Spring forms :: Maestros</title>

<!-- Bootstrap -->
<link
	href="//maxcdn.bootstrapcdn.com/bootstrap/3.3.1/css/bootstrap.min.css"
	rel="stylesheet">

</head>
<body>

	<jsp:include page="../../templates/header.jsp" />
	
	<div class="container">
		<div class="jumbotron">
			<h1>Maestro actualizado</h1>
		</div>
		<div class="alert alert-success" role="alert">El siguiente maestro ha sido actualizado exitosamente</div>
		
		<table class="table">
			<thead>
				<tr>
					<th>Nombre</th>
					<th>Apellido Paterno</th>
					<th>Apellido Materno</th>
				</tr>
			</thead>
			<tbody>
				<tr>
					<td>${maestro.nombre}</td>
					<td>${maestro.aPaterno}</td>
					<td>${maestro.aMaterno}</td>
				</tr>
			</tbody>
		</table>
	</div>
	
	<jsp:include page="../../templates/footer.jsp" />

</body>
</html>