package ejercicio04;
import ejercicio02.Calculadora;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		   // variable para almacenar un número entero
      
		int numero = 15; 

        // Llama al método esPar de la clase Calculadora
        
        boolean esPar = Calculadora.esPar(numero);

        // Determina si el número es par o impar y muestra el resultado
        
        if (esPar) {
            int triple = numero * 3;
            System.out.println("El número es par. El triple es: " + triple);
        } else {
            int doble = numero * 2;
            System.out.println("El número es impar. El doble es: " + doble);
        }
    }

}


