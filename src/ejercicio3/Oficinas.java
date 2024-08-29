package ejercicio3;

public class Oficinas extends Edificio implements Iinstalación {
	
	
	int cantidadDeOficinas;
	
	public Oficinas() {
		super();
	}
	public Oficinas(double ancho, double largo, int cantidadDeOficinas) {
		super(ancho, largo);
		this.cantidadDeOficinas= cantidadDeOficinas;
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
	@Override
	public String toString() {
		return "Oficinas [getTipoDeInstalacion()=" + getTipoDeInstalacion() + ", getCantidadDeOficinas()="
				+ getCantidadDeOficinas() + ", getAncho()=" + getAncho() + ", getLargo()=" + getLargo()
				+ ", getSuperficieEdificio()=" + getSuperficieEdificio() + "]";
	}
	
	

	
	

	
	
	
}
