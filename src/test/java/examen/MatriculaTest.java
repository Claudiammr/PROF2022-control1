package examen;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.times;


import java.util.Vector;

import org.junit.jupiter.api.Test;



class MatriculaTest {

	// Test para el paso 7
	@Test
	public void getImporte_Throws_Exception() throws Exception {
		Matricula mt = new Matricula(null);
        assertThrows(Exception.class, ()->mt.getImporte());
	}
	
	//Test para el paso 8
	@Test
	public void getImporteTest() throws Exception {
		//Mockeamos Asignatura
		Asignatura asignatura = mock(Asignatura.class);
    	Vector<Asignatura> vectorAsignaturas = new Vector<>();

    	//Añadimos la asignatura
    	vectorAsignaturas.add(asignatura);

    	//Creamos la matrícula
    	Matricula mt = new Matricula(vectorAsignaturas);

    	when(asignatura.getImporte()).thenReturn(1.0);

        assertEquals(1.0, mt.getImporte(),1.0);
	}
	
	//Test para el paso 9
	@Test
	public void getImporteTestVerify() throws Exception {
		//Mockeamos esta vez 2 asignatura
		Asignatura asignatura1 = mock(Asignatura.class);
		Asignatura asignatura2 = mock(Asignatura.class);
    	Vector<Asignatura> vectorAsignaturas = new Vector<>();

    	//Añadimos varias asignaturas al vector
    	vectorAsignaturas.add(asignatura1);
    	vectorAsignaturas.add(asignatura2);

    	//Creamos la matrícula
    	Matricula mt = new Matricula(vectorAsignaturas);

    	//Verify
    	mt.getImporte();
    	verify(asignatura1,times(1)).getImporte();
    	verify(asignatura1,times(1)).getImporte();
	}
}
