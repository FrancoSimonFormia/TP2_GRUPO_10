package ejercicio2;

import java.sql.Date;

public class ProductoFresco extends Producto {

	//Informacion especifica 
	
	Date fecha_envasado;
	String pais_de_Origen;
	
	
	public Date getFecha_envasado() {
		return fecha_envasado;
	}
	
	public void setFecha_envasado(Date fecha_envasado) {
		this.fecha_envasado = fecha_envasado;
	}
	
	public String getPais_de_Origen() {
		return pais_de_Origen;
	}
	
	public void setPais_de_Origen(String pais_de_Origen) {
		this.pais_de_Origen = pais_de_Origen;
	}

	public ProductoFresco() {
		super();
	}

	public ProductoFresco(Date fecha_de_caducidad, int numero_de_lote, 
			Date fecha_de_envasado, String pais_de_origen) {
		super(fecha_de_caducidad, numero_de_lote);
		this.fecha_de_caducidad = fecha_de_caducidad;
		this.pais_de_Origen = pais_de_origen;
	}
	
	@Override
	public String toString() {
	    return "ProductoFresco{" +
	            "fecha_envasado=" + fecha_envasado +
	            ", pais_de_Origen='" + pais_de_Origen + '\'' +
	            ", fecha_de_caducidad=" + getFechaDeCaducidad() +
	            ", numero_de_lote=" + getNumeroDeLote() +
	            '}';
	}
	
	
	
}
