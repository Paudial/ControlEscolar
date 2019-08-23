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
<title>Spring forms :: Alumnos</title>

<!-- Bootstrap -->
<link
	href="//maxcdn.bootstrapcdn.com/bootstrap/3.3.1/css/bootstrap.min.css"
	rel="stylesheet">

</head>
<body>
	
	<jsp:include page="../../templates/header.jsp" />
	
	<div class="container">
		<div class="jumbotron">
			<h1>Nuevo Alumno</h1>
			<p> Ver esta información del usuario </p>
		</div>
		<s:url var="action" value="/alumnos/new" />
		<sf:form method="post" action="${post_alumno}" modelAttribute="alumno">
			<sf:hidden path="idAlumno" />
			<div class="form-group">
				<label for="nombre">Nombre</label>
				<sf:input path="nombre" class="form-control" placeholder="Nombre" />
			</div>
			<div class="form-group">
				<label for="aPaterno">Apellido Paterno</label>
				<sf:input path="aPaterno" class="form-control"  placeholder="Apellido Paterno" />
			</div>
			<div class="form-group">
				<label for="aMaterno">Apellido Materno</label>
				<sf:input path="aMaterno" class="form-control" placeholder="Apellido Materno" />
			</div>
			<div class="form-group">
				<label for="sexo">Sexo</label>
				<sf:input path="sexo" class="form-control" placeholder="Sexo" />
			</div>
			<div class="form-group">
				<label for="direccion">Dirección</label>
				<sf:input path="direccion" class="form-control" placeholder="Dirección" />
			</div>
			<div class="form-group">
				<label for="telefono">Teléfono</label>
				<sf:input path="telefono" class="form-control" placeholder="Teléfono" />
			</div>
			<div class="form-group">
				<label for="email">Email</label>
				<sf:input path="email" class="form-control" placeholder="Email" />
			</div>
			<div class="form-group">
				<label for="noControl">Número de Control</label>
				<sf:input path="noControl" class="form-control" placeholder="Número de Control" />
			</div>
			<sf:button class="btn btn-primary pull-right">Create</sf:button>
		</sf:form>
	</div>

	<jsp:include page="../../templates/footer.jsp" />

</body>
</html>