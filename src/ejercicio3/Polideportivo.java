package ejercicio3;

public class Polideportivo extends Edificio implements Iinstalación {

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
		return 1;
	}

	@Override
	public String toString() {
		return "Polideportivo [getNombre()=" + getNombre() + ", getTipoDeInstalacion()=" + getTipoDeInstalacion()
				+ ", getAncho()=" + getAncho() + ", getLargo()=" + getLargo() + ", getSuperficieEdificio()="
				+ getSuperficieEdificio() + "]";
	}

	

	

	
}
