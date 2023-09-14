package ejercicio01;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 //comentario
		// Inicializar las variables apellidos y nombres
        String apellidos2 = "Alvarez";
        String nombres2 = "Lorena Del Valle";

        // Crear un objeto usuario y setear los atributos
           Usuario usuario = new Usuario (apellidos2, nombres2);
         

        // Mostrar los datos del usuario por consola
        System.out.println("Datos del usuario:");
        System.out.println("Apellidos: " + usuario.getApellidos2());
        System.out.println("nombres: " + usuario.getNombres2());
    }
	
     
   
}

