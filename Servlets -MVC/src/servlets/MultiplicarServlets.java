package servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.entidades.Multiplicacion;
import modelo.negocio.GestorMultiplicacion;

/**
 * Servlet implementation class MultiplicarServlets
 */
public class MultiplicarServlets extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MultiplicarServlets() {
        super();

    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String sNumero = request.getParameter("numero"); //obtener el parametro numero
		int iNumero = Integer.parseInt(sNumero);
		
		if(iNumero != 0) { // si es distinto de 0, hacemos todo lo siguiente
			GestorMultiplicacion gm = new GestorMultiplicacion();
			List<Integer> tablaMultiplicar = gm.calcularTabla(iNumero);
			
			Multiplicacion multiplicacion = new Multiplicacion();
			multiplicacion.setNumero(iNumero);
			multiplicacion.setTablaMultiplicar(tablaMultiplicar);
			
			request.setAttribute("multiplicacion", multiplicacion); // request. Attribute para poder guardar el objeto multiplicacion
			//con los parametros que necesite
			request.setAttribute("otroAtributo", "valorDelOtroAtributo");
			
			RequestDispatcher rd = request.getRequestDispatcher("/jsp/tablaMultiplicar.jsp"); // le indicamos la ruta donde queremos ir
			rd.forward(request, response); 
			
		}else{ // Si es un 0, pasa esto
			request.setAttribute("error", true);
			RequestDispatcher rd = request.getRequestDispatcher("/jsp/index.jsp"); // le indicamos la ruta donde queremos ir
			rd.forward(request, response); 
		}
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
