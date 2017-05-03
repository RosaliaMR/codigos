<%@page import="modelo.entidades.Pizza"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
		Object obj = request.getAttribute("pizza");
		Pizza pizza = (Pizza)obj;
	%>
	<h1>Resumen del pedido</h1>
	<p>Direccion: <%=pizza.getDireccion() %></p>
	<p>Nombre: <%=pizza.getNombre() %></p>
	<p>Telefono: <%=pizza.getTelefono() %></p>
	<p>Tamaño: <%=pizza.getTamaño() %></p>
	<p>Lista Ingredientes: <%=pizza.getListaIngredientes() %></p>
	<p>Precio: <%=pizza.getPrecio() %></p>
</body>
</html>