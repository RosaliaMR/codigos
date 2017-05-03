package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entidades.Usuarios;
import negocio.gestorUsuarios;

/**
 * Servlet implementation class loginServlets
 */
public class loginServlets extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public loginServlets() {
        super();

    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		//Aqui hacemos logica de controlador 
		//Recogemos parametros
		
		String nombre= request.getParameter("nombre");
		String password = request.getParameter("password");
		
		Usuarios usuario = new Usuarios();
		usuario.setNombre(nombre);
		usuario.setPassword(password);
		
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<body>");

		if (new gestorUsuarios().validarUsuario(usuario)){//si esta validado
			out.println("<p style='color:blue'>Bienvenido a nuestra pagina web " + nombre + "</p>");
		}else{
			out.println("<p style='color:red'>No existe el usuario " + nombre + " con el password " + password + "</p>");
			out.println("<a href='peticionPost.html'>Login</a>");
		}
		
		out.println("</body>");
		out.println("</htnl>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
}
}

