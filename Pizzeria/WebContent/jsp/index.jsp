<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link rel="styleSheet" href="../css/styles.css">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>PIZZA PLANET</title>
</head>
<body>

	<nav id="menu">
		<a href="#mapa" class="scrollto">OFERTAS</a> <a href="#mapa"
			class="scrollto">LOCALIZACION</a> <a href=#contenido class="scrollto">CONTACTO</a>
	</nav>

	<div id="content">
		<h1>Bienvenido a Pizza Planet</h1>
		<form action="PizzaServlet" method="post">
			<fieldset>
				<legend>SELECCIONA TU PIZZA</legend>

				<p>
					<label for="txtNombre">Nombre:</label> <input type="Text"
						required=required placeholder="Introduce tu nombre"
						name="nombre" />
				</p>


				<p>
					<label for="txtDireccion">Direccion:</label> <input type="Text"
						placeholder="Introduce tu direccion"
						name="direccion" />
				</p>


				<p>
					<label for="txtTlf">Telefono:</label> <input type="Text"
						placeholder="Introduce tu direccion"
						name="telefono" />
				</p>
<br />

				<p>
					<label for="txtSize">TAMANO DE LA PIZZA:</label><br />
					<input type="radio" name="tamanio" value="pequenio" /> Individual 
					<input type="radio" name="tamanio" value="mediano" /> Mediana 
					<input type="radio" name="tamanio" value="grande" />Familiar <br />
				</p>
				
				<%
					Object obj = request.getAttribute("error");
					if(obj != null){
						String error = (String)obj;
				%>
					<h3 style="color:red"><%=error%></h3>
				<%
					}
				%>
				<p>
					<label for="txtIngredientes">INGREDIENTES:</label> <br />
					Jamon <input type="checkbox" name="ingredientes" value="Jamon" /> <br /> 
					Bacon <input type="checkbox" name="ingredientes" value="Bacon" /> <br /> 
					Atun <input type="checkbox" name="ingredientes" value="Atun" /> <br /> 
					Cebolla <input type="checkbox" name="ingredientes" value="Cebolla" /> <br /> 
					Pimiento <input type="checkbox" name="ingredientes" value="Pimiento" /> <br />
					Salami <input type="checkbox" name="ingredientes" value="Salami" /> <br />
					Champiñones <input type="checkbox" name="ingredientes" value="Champiñones" /> <br />
					<br />
				</p>
				
				<br />

				<input type="submit" value="Realizar Pedido" />
			</fieldset>
		</form>
	</div>


	<div id="mapa">
		<iframe
			src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d3038.0683461664944!2d-3.7055806846985164!3d40.40733667936623!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0xd4227d350fcc9ff%3A0x906e4ef091cac1dd!2sCalle+Tribulete%2C+25%2C+28012+Madrid!5e0!3m2!1ses!2ses!4v1479592136354"
			height="450" frameborder="0" style="border: 0" allowfullscreen>
		</iframe>
	</div>

	<footer>
		<div class="contenido">
			<a href="tel:666355125">Tel: 666355125</a> <br> 
			<a href="mailto:vmenadelacruz@gmail.com">info@pizzaplanet.com </a>
		</div>
	</footer>
</body>
</html>