package implementacion;

import interfaces.PilaTDA;

public class PilaTopeInicioDinamica implements PilaTDA {
	
	class Nodo {
		int dato;
		Nodo siguiente;
	}
	
	private Nodo inicio;
	
	public void inicializarPila() {
		inicio=null;
	}

	public void apilar(int x) {
		Nodo n=new Nodo();
		n.dato=x;
		n.siguiente=inicio;
		inicio=n;
	}

	public void desapilar() {
		inicio=inicio.siguiente;
	}

	public int tope() {
		return inicio.dato;
	}

	public boolean pilaVacia() {
		return inicio==null;
	}

}
