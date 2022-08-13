package implementacion;

import interfaces.ConjuntoTDA;
import interfaces.DicMultDinAltTDA;

public class DicMultDinAlt implements DicMultDinAltTDA {
	
	class Nodo {
		int clave;
		ConjuntoTDA valores=new ConjuntoDinamico();
		Nodo siguiente;
	}
	
	private Nodo inicio;
	private ConjuntoTDA conjuntoClaves=new ConjuntoDinamico();
	
	public void inicializarDiccionarioMultiple() {
		inicio=null;
		conjuntoClaves.inicializarConjunto();
	}

	public void agregar(int clave, int x) {
		if (conjuntoClaves.pertenece(clave)==false) {
			Nodo nuevo=new Nodo();
			nuevo.clave=clave;
			nuevo.valores.agregar(x);
			nuevo.siguiente=inicio;
			conjuntoClaves.agregar(clave);
			inicio=nuevo;
		} else {
			Nodo anterior=null;
			Nodo actual=inicio;
			while(actual.clave!=clave) {
				anterior=actual;
				actual=actual.siguiente;
			}
			actual.valores.agregar(x);
		}
	}

	public void eliminar(int clave) {
		if (conjuntoClaves.pertenece(clave)==true) {
			if (inicio.clave==clave) {
				inicio=inicio.siguiente;
				return;
			}
			Nodo anterior=null;
			Nodo actual=inicio;
			while(actual.clave!=clave) {
				anterior=actual;
				actual=actual.siguiente;
			}
			anterior.siguiente=actual.siguiente;
		}
	}

	public void eliminarValor(int clave, int x) {
		Nodo anterior=null;
		Nodo actual=inicio;
		while(actual.clave!=clave) {
			anterior=actual;
			actual=actual.siguiente;
		}
		actual.valores.sacar(x);
	}

	public ConjuntoTDA obtener(int clave) {
		Nodo anterior=null;
		Nodo actual=inicio;
		while(actual.clave!=clave) {
			anterior=actual;
			actual=actual.siguiente;
		}
		return actual.valores;
	}

	public ConjuntoTDA claves() {
		return conjuntoClaves;
	}

}
