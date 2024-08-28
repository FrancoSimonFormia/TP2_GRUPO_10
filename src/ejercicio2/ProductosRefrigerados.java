package ejercicio2;

import java.sql.Date;

public class ProductosRefrigerados extends Producto {
	
	private String codigo_supervision_alimentaria;

	public String getCodigo_supervision_alimentaria() {
		return codigo_supervision_alimentaria;
	}

	public void setCodigo_supervision_alimentaria(String codigo_supervision_alimentaria) {
		this.codigo_supervision_alimentaria = codigo_supervision_alimentaria;
	}

	public ProductosRefrigerados() {
		super();
		
	}

	public ProductosRefrigerados(Date fecha_de_caducidad, int numero_de_lote,
			String codigo_supervision_alimentaria) {
		super(fecha_de_caducidad, numero_de_lote);
		this.codigo_supervision_alimentaria = codigo_supervision_alimentaria;
	}
	
	@Override
	public String toString() {
	    return "ProductosRefrigerados{" +
	            "codigo_supervision_alimentaria='" + codigo_supervision_alimentaria + '\'' +
	            ", fecha_de_caducidad=" + getFecha_de_caducidad() +
	            ", numero_de_lote=" + getNumero_de_lote() +
	            '}';
	}

}
