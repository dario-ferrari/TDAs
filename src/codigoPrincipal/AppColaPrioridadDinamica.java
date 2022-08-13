package codigoPrincipal;

import implementacion.ColaPrioridadDinamica;
import interfaces.ColaPrioridadTDA;

public class AppColaPrioridadDinamica {

	public static void main(String[] args) {
		ColaPrioridadTDA dada;
		dada=new ColaPrioridadDinamica();
		dada.inicializarCola();
		
		dada.acolarPrioridad(771, 7);
		
		System.out.println("Prioridad: " +dada.prioridad()+"Dato: "+dada.primero());
		System.out.println("Fin");
	}

}
