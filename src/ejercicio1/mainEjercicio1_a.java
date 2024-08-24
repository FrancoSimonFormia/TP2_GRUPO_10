package ejercicio1;

public class mainEjercicio1_a {

	public static void main(String[] args) {
		Profesor[] profesores = new Profesor[5];
		profesores[0] = new Profesor("Dwight", 40,"Ayudante", 1);
		profesores[1] = new Profesor("Jim", 35, "Docente", 5);
		profesores[2] = new Profesor("Pam", 32, "Docente", 6);
		profesores[3] = new Profesor("Andrew", 37, "Jefe TP", 3);
		profesores[4] = new Profesor("Michael", 42, "Jefe de cátedra", 10);
		
		for (Profesor p : profesores) {
			System.out.println(p.toString());
		}

	}

}
