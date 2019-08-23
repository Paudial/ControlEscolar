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
<title>Spring forms :: Materias</title>

<!-- Bootstrap -->
<link
	href="//maxcdn.bootstrapcdn.com/bootstrap/3.3.1/css/bootstrap.min.css"
	rel="stylesheet">

</head>
<body>
	<jsp:include page="../../templates/header.jsp" />
	
	<div class="container">
		<div class="jumbotron">
			<h1>Detalle de la Materia </h1>
			<p>Ver esta información del alumno.</p>	
		</div>
		
		<c:choose>
			<c:when test="${not empty materia}">
				<table class="table">
					<thead>
						<tr>
							<th>Nombre</th>
							<th>Clave</th>
							<th>Grado</th>
						</tr>
					</thead>
					<tbody>
						<tr>
							<td>${materia.nombre}</td>
							<td>${materia.clave}</td>
							<td>${materia.grado.grado}</td>
						</tr>
					</tbody>
				</table>
			</c:when>
		</c:choose>
	</div>
	
	<jsp:include page="../../templates/footer.jsp" />

</body>
</html>