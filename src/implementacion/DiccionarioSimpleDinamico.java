package implementacion;

import interfaces.ConjuntoTDA;
import interfaces.DiccionarioSimpleTDA;

public class DiccionarioSimpleDinamico implements DiccionarioSimpleTDA {
	
	class Nodo {
		int dato;
		int clave;
		Nodo siguiente;
	}
	
	private Nodo inicio;
	private ConjuntoTDA listaClaves=new ConjuntoDinamico();
	
	public void inicializarDiccionarioSimple() {
		inicio=null;
		listaClaves.inicializarConjunto();
	}

	public void agregar(int clave, int x) {
		Nodo nuevo=new Nodo();
		nuevo.clave=clave;
		nuevo.dato=x;
		nuevo.siguiente=inicio;
		if(listaClaves.pertenece(clave)==false) {
			listaClaves.agregar(clave);
			inicio=nuevo;
		}
	}

	public void eliminar(int clave) {
		if (listaClaves.pertenece(clave)==true) {
			if (inicio.clave==clave) {
				inicio=inicio.siguiente;
				return;
			}
			Nodo anterior=null;
			Nodo actual=inicio;
			while (actual.clave!=clave) {
				anterior=actual;
				actual=actual.siguiente;
			}
			anterior.siguiente=actual.siguiente;
		}
	}

	public int obtener(int clave) {
		if (listaClaves.pertenece(clave)==false) {
			return 0;
		}
		Nodo actual=inicio;
		while (actual.clave!=clave) {
			actual=actual.siguiente;
		}
		return actual.dato;
	}

	public ConjuntoTDA claves() {
		return listaClaves;
	}

}
