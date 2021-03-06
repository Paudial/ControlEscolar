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
			<h1>Lista de Maestros</h1>
			<p>Estos son los maestros actualmente en el sistema.</p>
		</div>

		<table class="table">
			<thead>
				<tr>
					<th>Nombre</th>
					<th>Apellido Paterno</th>
					<th>Apellido Materno</th>
					<th>Sexo</th>
					<th>Acciones</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${maestros}" var="maestro">
					<tr>
						<td>${maestro.nombre}</td>
						<td>${maestro.aPaterno}</td>
						<td>${maestro.aMaterno}</td>
						<td>${maestro.sexo}</td>
						<td><a class="btn btn-sm btn-primary"
							href="<s:url value="/maestros/${maestro.idMaestro}" />"
							title="Información detallada"> ver detalle</a>
							<a class="btn btn-sm btn-success"
							href="<s:url value="/maestros/update/${maestro.idMaestro}" />"
							title="Actualizar"> actulizar</a>
							<a class="btn btn-sm btn-danger"
							href="<s:url value="/maestros/delete/${maestro.idMaestro}" />"
							title="Borrar"> borrar</a>
							</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
	
	<jsp:include page="../../templates/footer.jsp" />

</body>
</html>