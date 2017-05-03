package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HolaMundoServlet
 */
public class HolaMundoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
	
	
	
    public HolaMundoServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

    
    // Solo se ejecuta una vez y es cuando se hace la primera petición al servidor (en principio)
	@Override
	public void init() throws ServletException {
			System.out.println("Arrancando el servlet");
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    
    //metodo doGet las peticiones que vengan con Get se tratan con este metodo
    
    //REQUEST contiene toda la informacion del cliente
    //RESPONSE todo lo que devolvemos al cliente (nos permite modificar el body de respuesta http del servidor)
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter(); // va a escribir sobre el body html
		
		
		//decimos que queremos mandar un html (MIME /type --> text/html) para ello cambiamos el atributo ContentType del mensaje http
		response.setContentType("text/html");
		out.println("<html>"); //Escribimos en el body del http
		out.println("<head");
		out.println("<title>Bienvenidos a nuestra pagina</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<p style='color:red'>Hola Mundo </p>");
		Date date = new Date(); //creamos la hora del servidor
		out.println("<p style='color:blue'>" + date + "</p>");
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
