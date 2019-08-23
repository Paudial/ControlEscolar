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
			<h1>Actualiza Materia</h1>
		</div>
		<s:url var="action" value="/materias/saveUpdate" />
		<sf:form method="post" action="${action}" modelAttribute="materia">
			<sf:hidden path="idMateria" />
			<div class="form-group">
				<label for="nombre">Nombre</label>
				<sf:input path="nombre" class="form-control" placeholder="Nombre" />
			</div>
			<div class="form-group">
				<label for="clave">Clave</label>
				<sf:input path="clave" class="form-control"  placeholder="Clave" />
			</div>
			<div class="form-group">
				<label for="grado.idGrado">Grado</label>
				<sf:input path="grado.idGrado" class="form-control" placeholder="Grado" />
			</div>
			<sf:button class="btn btn-primary pull-right">Actualizar</sf:button>
		</sf:form>
	</div>

	<jsp:include page="../../templates/footer.jsp" />

</body>
</html>