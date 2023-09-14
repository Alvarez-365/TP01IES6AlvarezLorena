package ejercicio05;
import ejercicio02.Calculadora;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//variable para contener un número entero en el rango [0, 10]
        int numero = 5; 
        
        
        // Verifica si el número está en el rango [0, 10]
        if (numero >= 0 && numero <= 10) {
           
        // Llama al método para calcular el factorial y mostrar el resultado
        	
            long factorial = Calculadora.calcularFactorial(numero);
            System.out.println(numero + "! = " + factorial);
        } else {
            System.out.println("El número ingresado no está en el rango [0, 10].");
        }
    }

}
