package ar.edu.unlam.pb2;

public class Persona  {
	
	private Integer dni;
	private String nombre;

	public Persona(Integer dni, String nombre) {
		this.dni=dni;
		this.nombre=nombre;
	}
	
	//NO NECESITAMOS SOBREESCRIBIR NI EQUALS NI HASCODE PORQUE UTILIZAMOS COMPARABLE

	public Integer getDni() {
		return dni;
	}

	public void setDni(Integer dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	
}
