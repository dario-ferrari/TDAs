package codigoPrincipal;

import implementacion.ColaPrioridadEstatica;
import interfaces.ColaPrioridadTDA;

public class AppColaPrioridadEstatica {

	public static void main(String[] args) {
		ColaPrioridadTDA dada;
		dada=new ColaPrioridadEstatica();
		dada.inicializarCola();
		
		dada.acolarPrioridad(771, 7);
		dada.acolarPrioridad(852, 1);
		dada.acolarPrioridad(250, 30);
		dada.acolarPrioridad(39, 15);
		
		System.out.println("Prioridad: " +dada.prioridad()+" - Dato: "+dada.primero());
		System.out.println("Fin");

	}

}
