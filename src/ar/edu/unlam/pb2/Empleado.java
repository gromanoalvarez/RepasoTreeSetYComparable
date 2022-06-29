package ar.edu.unlam.pb2;

import java.util.Comparator;

public class Empleado extends Persona  implements Comparable, Comparator<Empleado>{

	private String empresa;

	public Empleado(Integer dni, String nombre, String empresa) {
		super(dni,nombre);
		this.empresa=empresa;
	}

	@Override
	public int compareTo(Object o) { // TODO Auto-generated method stub
		
		//1RO casteo el Object o que me manda por default este medodo compareTo de la interfaz Comparable que implemente
		Empleado comparable = (Empleado)o;
		
		//2do.  COMPARAR POR INTEGER (EJ.DNI)
		//		ordena de menor a mayor por DNI
		
				/* 1er opcion
		if(this.getDni() > comparable.getDni()) return +1;
		else if(this.getDni()< comparable.getDni()) return -1;
		else return 0;
		
				2da opcion RESUMIDA
		return this.getDni()-comparable.getDni();
*/
		//SE PUEDE RESUMIR USANDO LA MISMA LOGICA QUE USA EL "CompareTo"
		return this.getDni().compareTo(comparable.getDni());
		
		//Con compareTo incluso hace resta entre Strings!!!
		//return this.getNombre().compareTo(comparable.getNombre());

	}

	//la interfaz Comparator me permite usar el metodo compare() para establecer otro tipo de orden, en este caso ordenara por Nombre
	@Override
	public int compare(Empleado o1, Empleado o2) {
		// TODO Auto-generated method stub
				return (-1)* o1.getNombre().compareTo(o2.getNombre());
	}
	


}
