package ejercicio3;
import java.util.ArrayList;
import java.util.Iterator;

public class mainEjercicio3 {
    public static void main(String[] args) {
    	
        ArrayList<Edificio> edificios = new ArrayList<>();
        
        // Polideportivos
        edificios.add(new Polideportivo("Hector Fillopski", "Campana", 50, 100));
        edificios.add(new Polideportivo("Club Social y Deportivo San Martín", "Burzaco", 60, 120));
        edificios.add(new Polideportivo("Polideportivo Club Laferrere", "Gregorio de Laferrere", 70, 140));
        
        // Oficinas
        edificios.add(new Oficinas(40, 55, 10, 3));
        edificios.add(new Oficinas(30, 60, 20, 5));
        
        // Iterator y recorrida de coleccion
        Iterator<Edificio> it = edificios.listIterator();
        while (it.hasNext()) {
            Edificio edificio = it.next();
            System.out.println(edificio.toString());
        }
    }
}