package ejercicio2;

import java.sql.Date;

public class mainEjercicio2 {

	public static void main(String[] args) {


		 // Creación de un objeto ProductoFresco con datos
        ProductoFresco producto1 = new ProductoFresco(
                Date.valueOf("2024-12-31"), 1001, 
                Date.valueOf("2024-08-27"), "Argentina"
        );

        // Creación de un objeto ProductosCongelados con datos
        ProductosCongelados producto2 = new ProductosCongelados(
                Date.valueOf("2025-01-15"), 1002, 
                -18.0
        );

        // Creación de un objeto ProductosRefrigerados con datos
        ProductosRefrigerados producto3 = new ProductosRefrigerados(
                Date.valueOf("2025-02-01"), 1003, 
                "AB1234"
        );
        
        System.out.println(producto1);
        System.out.println(producto2);
        System.out.println(producto3);
        
 
}
}
