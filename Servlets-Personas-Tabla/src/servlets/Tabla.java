package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Tabla
 */
public class Tabla extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	
	List <Personas> listapersonas;
	
	
	
    @Override
	public void init() throws ServletException {
		listapersonas = new ArrayList<>();
		Personas p1 = new Personas();
		Personas p2 = new Personas();
		Personas p3 = new Personas();
		listapersonas.add(p1);
		listapersonas.add(p2);
		listapersonas.add(p3);
		
		p1.setNombre("Frodo");
		p1.setEdad(20);
		p1.setTelefono("65484556");
		
		p2.setNombre("Gandalf");
		p2.setEdad(70);
		p2.setTelefono("548781750");
		
		p3.setNombre("Sam");
		p3.setEdad(23);
		p3.setTelefono("689485151");
		
	}

	/**
     * @see HttpServlet#HttpServlet()
     */
    public Tabla() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		out.println("<html>"); //Escribimos en el body del http
		out.println("<head");
		out.println("<title>Bienvenidos a nuestra tabla</title>");
		out.println("</head>");
		out.println("<body>");
		
		out.println("<table>");
		out.println("<th>Nombre</th>");
		out.println("<th>Edad</th>");
		out.println("<th>Telefono</th>");
		for (Personas p : listapersonas){
				out.println("<tr>");
				out.println("<td>" + p.getNombre()+ "</td>");
				out.println("<td>" + p.getEdad()+ "</td>");
				out.println("<td>" + p.getTelefono()+ "</td>");
				out.println("</tr>");
		}
		out.println("</table>");
		out.println("</body>");
		out.println("</html>");
		
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
