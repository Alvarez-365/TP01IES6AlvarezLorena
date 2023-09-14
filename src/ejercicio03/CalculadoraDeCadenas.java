package ejercicio03;

public class CalculadoraDeCadenas {
	
	private String cadena;
	public CalculadoraDeCadenas() {
		// TODO Auto-generated constructor stub
	}
	public String getCadena() {
		return cadena;
	}
	public void setCadena(String cadena) {
		this.cadena = cadena;
	}


	 public int contarVocales(String palabra) {
	        int contador = 0;
	        String palabraEnMinusculas = palabra.toLowerCase(); // Convertir la palabra a minúsculas para simplificar la comparación
	        for (int i = 0; i < palabraEnMinusculas.length(); i++) {
	            char caracter = palabraEnMinusculas.charAt(i);
	            if (caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u') {
	                contador++;
	            }
	        }
	        return contador;
	    }
}
