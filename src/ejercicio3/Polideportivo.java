package ejercicio3;

public class Polideportivo extends Edificio implements IInstalacionDeportiva {

	// FALTA DESARROLLAR
	private String nombre;
	
	//constructores
	public Polideportivo() {
		super();
	}
	
	public Polideportivo(String nombre, double ancho, double largo) {
		super(ancho, largo);
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	@Override
	public int getTipoDeInstalacion() {
		// FALTA DESARROLLAR METODO
		return 0;
	}

	@Override
	public String toString() {
		return 
				"Polideportivo nombre: " + nombre + 
				"| superficie: " + super.getSuperficieEdificio() + "mts cuadrados";
	}

	
}
