package ar.edu.unlam.pb2;

import static org.junit.Assert.*;

import java.util.TreeSet;

import org.junit.Test;

public class TreeSetTest {

	@Test
	public void queSePuedaIngresarObjetosAlTreeSet() {
		TreeSet<Empleado> empleadosOrdenados = new TreeSet<Empleado>();
		assertNotNull(empleadosOrdenados);

		Empleado german = new Empleado(34888555, "German", "X");
		assertNotNull(german);

		empleadosOrdenados.add(german);
		assertNotNull(empleadosOrdenados);
		
		final Integer RESULTADO_ESPERADO=1;
		
		assertEquals(RESULTADO_ESPERADO, (Integer)empleadosOrdenados.size());
		assertEquals(german, empleadosOrdenados.first());
		assertEquals(german, empleadosOrdenados.last());

		assertTrue(empleadosOrdenados.contains(german));
		assertFalse(empleadosOrdenados.isEmpty());
	}
	
	@Test
	public void queTreeSetNoAgreguePorMismaInstanciaNiPorMismoDni(){
		TreeSet<Empleado> empleadosOrdenados = new TreeSet<Empleado>();
		assertNotNull(empleadosOrdenados);

		Empleado german = new Empleado(34888555, "German", "X");
		assertNotNull(german);

		Empleado german2 = new Empleado(34888555, "s", "w"); 
		assertNotNull(german2);

		empleadosOrdenados.add(german);
		assertNotNull(empleadosOrdenados);
		
		//agregando el 2do: MISMA INSTANCIA- MISMA POSICION DE MEMORIA
		empleadosOrdenados.add(german); //LO RECHAZA
		
		//agregando el 2do: OTRA INSTANCIA- DIFERENTE POSICION DE MEMORIA - MISMO DNI
		empleadosOrdenados.add(german2); //LO RECHAZA
		
		final Integer RESULTADO_ESPERADO=1;
		
		assertEquals(RESULTADO_ESPERADO, (Integer)empleadosOrdenados.size());
		assertEquals(german, empleadosOrdenados.first());
		assertEquals(german, empleadosOrdenados.last());

		assertTrue(empleadosOrdenados.contains(german));
		assertFalse(empleadosOrdenados.isEmpty());
	}
	
	@Test
	public void queTreeSetOdeneDeMenorAMayorPorDni(){
		TreeSet<Empleado> empleadosOrdenados = new TreeSet<Empleado>();
		assertNotNull(empleadosOrdenados);

		Empleado pedro = new Empleado(340, "pedro", "X");
		assertNotNull(pedro);

		Empleado cintia = new Empleado(1, "cintia", "w"); 
		assertNotNull(cintia);
		
		Empleado veronica = new Empleado(99999999, "veronica", "w"); 
		assertNotNull(veronica);
		
		Empleado JOSE = new Empleado(500, "JOSE", "w"); 
		assertNotNull(JOSE);

		empleadosOrdenados.add(pedro);
		empleadosOrdenados.add(cintia);
		empleadosOrdenados.add(veronica);
		empleadosOrdenados.add(JOSE);

		final Integer RESULTADO_ESPERADO=4;
		
		assertEquals(RESULTADO_ESPERADO, (Integer)empleadosOrdenados.size());
		assertEquals(cintia, empleadosOrdenados.first());
		assertEquals(veronica, empleadosOrdenados.last());

		assertTrue(empleadosOrdenados.contains(pedro));
		assertFalse(empleadosOrdenados.isEmpty());
	}

}
