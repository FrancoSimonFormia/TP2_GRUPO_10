package ejercicio2;

import java.sql.Date;

public abstract class Producto {
	
	//fecha de caducidad y número de lote
	
	Date fecha_de_caducidad; 
	int numero_de_lote;
	
	//get y sett.
	
	public Date getFecha_de_caducidad() {
		return fecha_de_caducidad;
	}
	public void setFecha_de_caducidad(Date fecha_de_caducidad) {
		this.fecha_de_caducidad = fecha_de_caducidad;
	}
	public int getNumero_de_lote() {
		return numero_de_lote;
	}
	public void setNumero_de_lote(int numero_de_lote) {
		this.numero_de_lote = numero_de_lote;
	}
	
	//constructores
	public Producto(Date fecha_de_caducidad, int numero_de_lote) {
		this.fecha_de_caducidad = fecha_de_caducidad;
		this.numero_de_lote = numero_de_lote;
	}

	public Producto() {
			
    }
	
	
}
