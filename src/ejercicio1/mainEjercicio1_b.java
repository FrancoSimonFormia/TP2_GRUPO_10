package ejercicio1;

import java.util.Iterator;
import java.util.TreeSet;

public class mainEjercicio1_b {

	public static void main(String[] args) {

		TreeSet<Profesor> listaProfesores = new TreeSet<Profesor>();
		
		Profesor p1 = new Profesor("Jason",  18, "Ayudante", 1);
		Profesor p2 = new Profesor("Kimberly", 17, "Ayudante", 2);
		Profesor p3 = new Profesor("Zack",  18, "Ayudante", 4);
		Profesor p4 = new Profesor("Trini",  17, "Docente", 6);
		Profesor p5 = new Profesor("Billy", 17, "Docente", 3);
		
		listaProfesores.add(p1);
		listaProfesores.add(p2);
		listaProfesores.add(p3);
		listaProfesores.add(p4);
		listaProfesores.add(p5);
		
		Iterator<Profesor> it = listaProfesores.iterator();
		while(it.hasNext())
		{
			Profesor p = (Profesor) it.next();
			System.out.println(p.toString());
		}
	}

}
