<%@page import="java.util.List"%>
<%@page import="modelo.entidades.Multiplicacion"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
		<%
			Multiplicacion multiplicacion = (Multiplicacion) //lo casteo porque se que es multiplicacion
					request.getAttribute("multiplicacion"); // request. que viene de servlets con los datos de multiplicacion
			
			List<Integer> tablaMultiplicacion = multiplicacion.getTablaMultiplicar();
			
			//podemos sacar el numero que introduce el cliente de dos sitios
			String sNumero = request.getParameter("numero");
			int iNumero = multiplicacion.getNumero();
			
		%>
		
		<table border=1 align="center">
			<tr>
				<th>Numero</th>
				<th>X</th>
				<th>Resultado</th>
			</tr>
				<%
					for (int i=1; i<tablaMultiplicacion.size();i++){
				%>
						<tr>
								<td><%=iNumero%></td><!-- con %ponemos lo que contiene iNumero -->
								<td><%=i %></td>
								<td><%=tablaMultiplicacion.get(i-1) %></td>
						</tr>
				<%
				}
				 %>
		</table>
			<a href="index.jsp">Volver</a>
</body>
</html>