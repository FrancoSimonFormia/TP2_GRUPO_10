package ejercicio2;
import java.sql.Date;
public class ProductosCongelados extends Producto {

	double temperatura_recomendada;
	
	public double getTemperaturaRecomendada() {
		return temperatura_recomendada;
	}

	
	public void setTemperaturaRecomendada(double temperatura_recomendada) {
		this.temperatura_recomendada = temperatura_recomendada;
	}

	public ProductosCongelados() {
		super();
	}
		
	public ProductosCongelados(Date fecha_de_caducidad, int numero_de_lote, double temperatura_recomendada) {
	        super(fecha_de_caducidad, numero_de_lote);
	        this.temperatura_recomendada = temperatura_recomendada;
	}
	
	@Override
	public String toString() {
	    return "ProductosCongelados{" +
	            "temperatura_recomendada=" + temperatura_recomendada +
	            ", fecha_de_caducidad=" + getFecha_de_caducidad() +
	            ", numero_de_lote=" + getNumero_de_lote() +
	            '}';
	}
	
}
