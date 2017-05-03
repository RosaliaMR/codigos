package modelo.negocio;

import modelo.entidades.Pizza;

public class GestorPizza {
	
	/**
	 * Esta funcion calcula el precio de una pizza en base
	 * a su tamaño y a la lista de ingredientes
	 * 
	 * @param pizza representa la pizza la cual queremos calcular
	 * su precio. Debe de tener el tamaño y la lista de
	 * ingredientes rellenas
	 * @return el precio calculado en euros
	 */
	public double calcularPrecio(Pizza pizza){
		double precioBase = 0;
		
		switch (pizza.getTamaño()) {
		case "pequenio":
			precioBase = 5;
			break;

		case "mediano":
			precioBase = 10;
			break;
		case "grande":
			precioBase = 15;
			break;
		}
		
		int numeroIngredientes = pizza.getListaIngredientes().size();
		double precioTotal = precioBase + numeroIngredientes;
		return precioTotal;
	}
}
