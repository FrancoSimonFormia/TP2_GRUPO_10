package ejercicio1;

public class Profesor extends Empleado {

	//atributos
	private String cargo;
	
	private int antiguedadDocente;

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	@Override
	public String toString() {
	    return "Profesor Id =" + getId()
	            + ", Nombre =" + getNombre()
	            + ", Edad =" + getEdad()
	            + ", Cargo " + cargo
	            + ", AntiguedadDocente=" + antiguedadDocente + "]";
	}

	public int getAntiguedadDocente() {
		return antiguedadDocente;
	}

	public void setAntiguedadDocente(int antiguedadDocente) {
		this.antiguedadDocente = antiguedadDocente;
	}

	public Profesor(String nombre,int edad, String cargo, int antiguedadDocente) {
		super(nombre, edad);
		this.cargo = cargo;
		this.antiguedadDocente = antiguedadDocente;
	}

	public Profesor() {
		super();	
	}
}
	
