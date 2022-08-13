package implementacion;

import interfaces.ColaTDA;
import interfaces.ListaOrdenadaTDA;

public class ListaOrdenada implements ListaOrdenadaTDA {
	
	class Nodo {
		int dato;
		Nodo siguiente;
	};
	
	private Nodo inicio;

	
	public void inicializarLista() {
		inicio=null;
	}

	public void agregar(int x) {
		Nodo n=new Nodo();
		n.dato=x;
		if (inicio==null || x<inicio.dato) {
			n.siguiente=inicio;
			inicio=n;
		} else {
			Nodo actual=inicio; 
			Nodo anterior=null;
			while (actual!=null && x>=actual.dato) {
				anterior=actual;
				actual=actual.siguiente;
			}
		}
	}

	public void eliminarInicio() {
		if (inicio!=null) {
			inicio=inicio.siguiente;
		}
	}

	public void eliminarFinal() {
		if (inicio!=null) {
			if (inicio.siguiente==null) {
				eliminarInicio();
			}
			else {
				Nodo actual=inicio; 
				Nodo anterior=null;
				while (actual.siguiente!=null) {
					anterior=actual;
					actual=actual.siguiente;
				}
				anterior.siguiente=actual.siguiente;
			}
		}
	}

	public void eliminar(int x) {
		if (inicio!=null) {
			if(inicio.dato==x) {
				eliminarInicio();
			}
			else {
				Nodo actual=inicio;
				Nodo anterior=null;
				while(actual!=null && actual.dato!=x) {
					anterior=actual;
					actual=actual.siguiente;
				}
				if (actual!=null) {
					anterior.siguiente=actual.siguiente;
				}
			}
		}
	}

	public boolean existe(int x) {
		Nodo actual=inicio;
		while(actual!=null && actual.dato!=x) {
			actual=actual.siguiente;
		}
		return actual!=null;
	}

	public ColaTDA valores() {
		ColaTDA r=new ColaPrimeroInicioEstatica();
		r.inicializarCola();
		Nodo actual=inicio;
		while (actual!=null) {
			r.acolar(actual.dato);
			actual=actual.siguiente;
		}
		return r;
	}

	public boolean listaVacia() {
		return inicio==null;
	}

}
