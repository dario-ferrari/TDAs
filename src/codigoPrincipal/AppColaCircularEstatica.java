package codigoPrincipal;

import implementacion.ColaCircularEstatica;
import interfaces.ColaTDA;

public class AppColaCircularEstatica {

	public static void main(String[] args) {
		ColaTDA cola=new ColaCircularEstatica();
		cola.inicializarCola();
		cola.acolar(1);
		cola.acolar(2);
		cola.acolar(3);
		cola.acolar(4);
		cola.acolar(5);
		while(!cola.colaVacia()) {
			System.out.print(cola.primero()+" - ");
			cola.desacolar();
		}
	}

}
