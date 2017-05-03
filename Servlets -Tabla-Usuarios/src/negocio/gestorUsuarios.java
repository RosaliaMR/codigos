package negocio;

import entidades.Usuarios;

public class gestorUsuarios {
	

	public boolean validarUsuario(Usuarios usuario){
		boolean validado = false;
		
		if(usuario.getNombre().equalsIgnoreCase("pepe")){
			validado= true;
		}
		return validado;

	}

}

