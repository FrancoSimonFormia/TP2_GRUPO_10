package ejercicio3;

public class Edificio {
	
    private double ancho;
    private double largo;

	public Edificio(){
		this.ancho = 0;
		this.largo = 0;
	};
	
	public Edificio(double ancho, double largo) {
		this.ancho = ancho;
		this.largo = largo;
	}
	
	
	@Override
	public String toString() {
		return "Este edificio tiene un ancho de " + ancho + "m, un largo de " + largo + 
				"m, y una superficie de " + getSuperficieEdificio() + " metros cuadrados.";
	}

	public double getAncho() {
		return ancho;
	}
	public void setAncho(double ancho) {
		this.ancho = ancho;
	}
	public double getLargo() {
		return largo;
	}
	public void setLargo(double largo) {
		this.largo = largo;
	}
	
	public double getSuperficieEdificio()
	{
		double superficie = ancho * largo;
		return superficie;
	};
}
