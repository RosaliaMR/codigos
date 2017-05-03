package servlets;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.entidades.Pizza;
import modelo.negocio.GestorPizza;

/**
 * Servlet implementation class PizzaServlet
 */
public class PizzaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PizzaServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String direccion = request.getParameter("direccion");
		String nombre = request.getParameter("nombre");
		String telefono = request.getParameter("telefono");
		String tamaño = request.getParameter("tamanio");
		
		if(tamaño == null){
			
			request.setAttribute("error", "El campo tamaño debe ir informado");
			RequestDispatcher rd = 
					request.getRequestDispatcher("/jsp/index.jsp");
			rd.forward(request, response);
			return;
		}
		
		//como son varios values asociados a el name ingredientes
		//necesitamos recogerlo en forma de array
		String[] arrayIngredientes = request.getParameterValues("ingredientes");
		//Como nosotros trabajamos con listas, debemos cambiar el tipo
		List<String> listaIngredientes = Arrays.asList(arrayIngredientes);
				
		Pizza pizza = new Pizza();
		pizza.setDireccion(direccion);
		pizza.setNombre(nombre);
		pizza.setTelefono(telefono);
		pizza.setTamaño(tamaño);
		pizza.setListaIngredientes(listaIngredientes);
		GestorPizza gp = new GestorPizza();
		double precioPizza = gp.calcularPrecio(pizza);
		pizza.setPrecio(precioPizza);
		
		request.setAttribute("pizza", pizza);
		RequestDispatcher rd = request.getRequestDispatcher("/jsp/resumen.jsp");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
