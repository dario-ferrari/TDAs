package implementacion;

import interfaces.ColaTDA;

public class ColaPrimeroFinalDinamica implements ColaTDA {
	
	class Nodo {
		int dato;
		Nodo siguiente;
	}
	
	private Nodo inicio;
	private Nodo fin;
	
	public void inicializarCola() {
		inicio=null;
		fin=null;
	}

	public void acolar(int x) {
		Nodo n=new Nodo();
		n.dato=x;
		n.siguiente=null;
		if (inicio==null) { 
			fin=n;
		}
		n.siguiente=inicio;
		inicio=n;
	}

	public void desacolar() {
		if (inicio!=null) {
			Nodo actual=inicio; 
			Nodo anterior=null;
			while (actual.siguiente!=null) {
				anterior=actual;
				actual=actual.siguiente;
			}
			if (inicio.siguiente==null) {
				fin=null;
				inicio=null;
			} else {
				fin=anterior;
				fin.siguiente=null;
			}
		}
	}

	public int primero() {
		return fin.dato;
	}

	public boolean colaVacia() {
		return inicio==null;
	}

}
