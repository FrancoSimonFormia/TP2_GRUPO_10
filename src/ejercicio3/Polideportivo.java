package ejercicio3;

public class Polideportivo extends Edificio implements Iinstalación {

	private String nombre;
	private String localidad;
	
	//constructores
	public Polideportivo() {
		super();
		this.nombre = "Sin nombre";
		this.localidad = "Desconocida";
				
	}
	
	public Polideportivo(String nombre, String localidad, double ancho, double largo) {
		super(ancho, largo);
		this.nombre = nombre;
		this.localidad = localidad;
	}
	
	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getLocalidad() {
		return localidad;
	}

	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}

	@Override
	public int getTipoDeInstalacion() {
		return 1;
	}

	@Override
	public String toString() {
		return "Polideportivo " + getNombre() + " - Localidad: " + getLocalidad() + " - Tipo de instalacion: " + getTipoDeInstalacion()
				+ " - Ancho: " + getAncho() + "m, Largo: " + getLargo() + "m, Superficie: "
				+ getSuperficieEdificio() + "m2";
	}

	

	

	
}
