package ejercicio3;

public class Oficinas extends Edificio implements Iinstalación {
	
	int cantidadDeOficinas;
	int cantidadDePisos;
	
	public Oficinas() {
		super();
		this.cantidadDeOficinas = 0;
	}
	public Oficinas(double ancho, double largo, int cantidadDeOficinas, int cantidadDePisos) {
		super(ancho, largo);
		this.cantidadDeOficinas = cantidadDeOficinas;
		this.cantidadDePisos = cantidadDePisos;
	}
	
	@Override
	public int getTipoDeInstalacion() {
		return 0;
	}
	
	public int getCantidadDeOficinas() {
		return cantidadDeOficinas;
	}
	public void setCantidadDeOficinas(int cantidadDeOficinas) {
		this.cantidadDeOficinas = cantidadDeOficinas;
		
	}
	public int getCantidadDePisos() {
		return cantidadDePisos;
	}
	public void setCantidadDePisos(int cantidadDePisos) {
		this.cantidadDePisos = cantidadDePisos;
	}
	@Override
	public String toString() {
		return "Oficinas - Tipo de instalacion: " + getTipoDeInstalacion() + " - Cantidad de oficinas: "
				+ getCantidadDeOficinas() + ", Cantidad de pisos: " + getCantidadDePisos()
				+ " - Superficie: " + getSuperficieEdificio() + "m2";
	}
	
	

	
	

	
	
	
}
