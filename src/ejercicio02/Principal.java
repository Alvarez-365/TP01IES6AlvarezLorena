package ejercicio02;
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int primero=64;
		int segundo=8;
	Calculadora unaCalculadora = new Calculadora();
	
	
	unaCalculadora.setNumeroA(primero);
	unaCalculadora.setNumeroB(segundo);
	System.out.println(unaCalculadora.sumar());
	System.out.println(unaCalculadora.restar());
	System.out.println(unaCalculadora.multiplicar());
	System.out.println("elresultado de dividir es " + unaCalculadora.dividir());
	System.out.println("el resultado de la potencia es " + unaCalculadora.potencia());
	System.out.println("el resultado de la raiz cuadrada es " + unaCalculadora.raizCuadrada());
	}
} 