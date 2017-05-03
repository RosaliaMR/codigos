<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body align="center">

	<h1>Bienvenidos a nuestra tabla de multiplicar</h1>
	
	<form action ="MultiplicarServlets">
		Numero : <input type="number" name="numero" 
							required="required"
							placeholder="Introduzca numero"/>
		
		<input type="submit" value="Calcular"/>
	
	</form>
	<%
		// Si no existe "error", por tanto no se ha introducido un 0, devuelve "null"
		Object error = request.getAttribute("error");
		if(error != null){
	%>
			<h2 style="color:red">No se admite el numero 0</h2>
		<%
			}
		%>
</body>
</html>