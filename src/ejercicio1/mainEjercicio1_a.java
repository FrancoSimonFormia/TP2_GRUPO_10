package ejercicio1;

import java.util.ArrayList;
import java.util.ListIterator;

public class mainEjercicio1_a {

	public static void main(String[] args) {
		
		ArrayList<Profesor> profesores = new ArrayList<Profesor>();
		
		profesores.add(new Profesor("Dwight", 40,"Ayudante", 1));
		profesores.add(new Profesor("Jim", 35, "Docente", 5));
		profesores.add(new Profesor("Pam", 32, "Docente", 6));
		profesores.add(new Profesor("Andrew", 37, "Jefe TP", 3));
		profesores.add(new Profesor("Michael", 42, "Jefe de cátedra", 10));
		
		ListIterator it = profesores.listIterator();
		
		

	}

}
