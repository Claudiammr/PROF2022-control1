package examen;

import java.util.Vector;

public class Matricula {

	static Vector<Asignatura> vectorAsignaturas;
	Matricula(Vector<Asignatura> vectorAsignaturas) {
		Matricula.vectorAsignaturas = vectorAsignaturas;
	}

	public static double getImporte() throws Exception {
		double importe = 0.0;

		if(vectorAsignaturas == null)
			throw new Exception();

		for(Asignatura i : vectorAsignaturas) {
			importe += i.getImporte();
		}

		return importe;

	}

}
