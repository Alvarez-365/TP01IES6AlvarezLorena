package ejercicio09;
import ejercicio01.Usuario;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String apellidos = "Alvarez";
        String nombres = "Lorena Del Valle";
        String mail= "valhe365@gmail.com";
        int edad= 35;
        double ingresosMensuales = 2500.50;
        double gastosMensuales= 1200;
		
		Usuario usuario = new Usuario("ApellidoUsuario", "NombreUsuario", "usuario@mail.com", 25, 3000.0, 2500.0);

        //  datos del usuario
		
		 {
	        System.out.println("Apellidos: " + apellidos);
	        System.out.println("Nombres: " + nombres);
	        System.out.println("Mail: " + mail);
	        System.out.println("Edad: " + edad);
	        System.out.println("Ingresos Mensuales: " + ingresosMensuales);
	        System.out.println("Gastos Mensuales: " + gastosMensuales);
	    }
        

        // Determina si el usuario es mayor o menor de edad
        
        if (usuario.esMayorDeEdad()) {
            System.out.println("El usuario es mayor de edad.");
        } else {
            System.out.println("El usuario es menor de edad.");
        }

        // Determina si el usuario puede ahorrar
        if (usuario.puedeAhorrar()) {
            System.out.println("El usuario puede ahorrar.");
        } else {
            System.out.println("El usuario no puede ahorrar debido a sus gastos elevados.");
        }
    }


	}


