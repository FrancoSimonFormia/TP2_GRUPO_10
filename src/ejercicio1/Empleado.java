package ejercicio1;

public class Empleado {
	
	//atributos
	
		private static int contadorId = 1000; 	
		
		private final int id; 
		
		private String nombre;
		
		private int edad;
		
		
		//constructor vacio
		public Empleado() {
	        this.id = contadorId++; 
	        this.nombre = "sin nombre";
	        this.edad = 99;

	    }

		//constructor que recibe nombre y edad como parametros
		
		public Empleado(String nombre, int edad ) {
		this.id = contadorId++; 
		this.nombre = nombre;
		this.edad = edad;
			
		}
		
		//métodos
		
		//Version int del metodo
		/*
		public static int devuelveProximoId()
		{
			return contadorId;
		}
		*/
		
		//Version String del metodo, con el formato del enunciado
		public static String devuelveProximoId()
		{
			return "El proximo ID sera el " + contadorId;
		}
		
		
		@Override
		public String toString() {
		    return "Empleado: " +
		            "id=" + id +
		            ", nombre='" + nombre + '\'' +
		            ", edad=" + edad +
		            '.';
		}
		
		
		//Getters y Setters
		
		 public int getId() {
		        return id;
		    }
		

		  public String getNombre() {
		        return nombre;
		    }

		  public void setNombre(String nombre) {
		        this.nombre = nombre;
		    }

		public int getEdad() {
			return edad;
		}

		public void setEdad(int edad) {
			this.edad = edad;
		}

}
