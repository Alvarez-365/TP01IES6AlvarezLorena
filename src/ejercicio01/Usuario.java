package ejercicio01;

public class Usuario {
	private String apellidos2;
	private String nombres2;
	private String apellidos;
    private String nombres;
    private String mail;
    private int edad;
    private double ingresosMensuales;
    private double gastosMensuales;
    
    // Constructor
    public Usuario(String apellidos, String nombres,String mail, int edad, double ingresosMensuales, double gastosMensuales) {
        this.apellidos = apellidos;
        this.nombres = nombres;
        this.mail = mail;
        this.edad = edad;
        this.ingresosMensuales = ingresosMensuales;
        this.gastosMensuales = gastosMensuales;
        
    }
    public Usuario(String apellidos2, String nombres2) {
		// TODO Auto-generated constructor stub
    	
    	this.apellidos2= apellidos2;
    	this.nombres2= nombres2;

     }
	
	
	public boolean esMayorDeEdad() {
        return edad >= 18;
    }
    public boolean puedeAhorrar() {
        return ingresosMensuales > gastosMensuales;
    }
    
  
    // getters y setters
    
    public String getApellidos2() {
		return apellidos2;
	}
	public void setApellidos2(String apellidos2) {
		this.apellidos2 = apellidos2;
	}
	public String getNombres2() {
		return nombres2;
	}
	public void setNombres2(String nombres2) {
		this.nombres2 = nombres2;
	}
    
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public String getNombres() {
		return nombres;
	}
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public double getIngresosMensuales() {
		return ingresosMensuales;
	}
	public void setIngresosMensuales(double ingresosMensuales) {
		this.ingresosMensuales = ingresosMensuales;
	}
	public double getGastosMensuales() {
		return gastosMensuales;
	}
	public void setGastosMensuales(double gastosMensuales) {
		this.gastosMensuales = gastosMensuales;
	}

}
