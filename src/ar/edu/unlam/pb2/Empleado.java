package ar.edu.unlam.pb2;

public class Empleado extends Persona  implements Comparable{

	private String empresa;

	public Empleado(Integer dni, String nombre, String empresa) {
		super(dni,nombre);
		this.empresa=empresa;
	}

	@Override
	public int compareTo(Object o) { // TODO Auto-generated method stub
		
		//1RO casteo el Object o que me manda por default este medodo compareTo de la interfaz Comparable que implemente
		Empleado comparable = (Empleado)o;
		
		//EN ESTE CASO VOY A COMPARAR POR INTEGER (EJ.DNI)
		if(this.getDni() > comparable.getDni()) return +1;
		else if(this.getDni()< comparable.getDni()) return -1;
		else return 0;
	}

}
