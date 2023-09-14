package ejercicio02;

public class Calculadora {
	
		private int numeroA;
		private int numeroB;
		
		public Calculadora() {
			// TODO Auto-generated constructor stub
			
		}
		//metodos
		public int sumar() {
			int resultado = 0;
				resultado=	numeroA + numeroB;
			return resultado;
		}
		public int restar() {
			int resultado = 0;
				resultado=	numeroA - numeroB;
			return resultado;
		}
		
		public int multiplicar() {
			int resultado = 0;
			resultado=numeroA * numeroB;
			
			return resultado;
		}
		public String dividir() {
			double divisor = numeroB;
			double  resultado = 0;
			
			if (numeroB!=0) {
				resultado= numeroA/ divisor;
			return resultado+"";
			}else {	
		    return  "no se puede dividir por cero";
		   }
		}
		
		
		public double potencia() {
			double resultado = Math.pow(numeroA, numeroB);
			return resultado;
		}
		public double raizCuadrada() {
			double resultado = Math.sqrt(numeroA);
			return resultado;
		}
		
		// getters y setters
		
		public int getNumeroA() {
			return numeroA;
		}
		public void setNumeroA(int numeroA) {
			this.numeroA = numeroA;
		}
		public int getNumeroB() {
			return numeroB;
		}
		public void setNumeroB(int numeroB) {
			this.numeroB = numeroB;
		}
		
		  public static boolean esPar(int numero) {
		        return numero % 2 == 0;
		    }
		  public static long calcularFactorial(int numero) {
		        if (numero == 0) {
		            return 1; 
		        }

		        long factorial = 1;
		        for (int i = 1; i <= numero; i++) {
		            factorial *= i;
		        }
		        return factorial;
		    }
		  
	public static void cuentaAtrasFor() {
        for (int i = 320; i >= 160; i -= 20) {
            System.out.println(i);
        }
        }
	
	 public static void cuentaAtrasWhile() {
	        int numero = 320;
	        while (numero >= 160) {
	            System.out.println(numero);
	            numero -= 20;
	        }
	    }
	
	public static void cuentaAtrasDoWhile() {
	        int numero = 320;
	        do {
	            System.out.println(numero);
	            numero -= 20;
	        } while (numero >= 160);
	    }
	
	    
}	  

