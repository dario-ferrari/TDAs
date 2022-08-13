package implementacion;

import interfaces.ColaTDA;
import interfaces.ConjuntoTDA;
import interfaces.DiccionarioMultipleDinTDA;

public class DiccionarioMultipleDinamico implements DiccionarioMultipleDinTDA {
	
	class Nodo {
		int clave;
		NodoValor valores;
		Nodo siguiente;
	}
	
	class NodoValor {
		//Este es un subnodo dentro del nodo del diccionario que contiene los valores asociados a cada clave.
		int valor;
		NodoValor siguienteValor;
	}
	
	//El nodo "inicio" es obviamente el nodo inicial del diccionario. ConjuntoClaves es un conjunto dinámico que
	//contiene todas las claves ingresadas al diccionario.
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
			nuevo.valores=new NodoValor();
			nuevo.valores.siguienteValor=nuevo.valores;
			nuevo.valores.valor=x;
			nuevo.siguiente=inicio;
			conjuntoClaves.agregar(clave);
			inicio=nuevo;
		} else {
			while(inicio.clave!=clave) {
				inicio=inicio.siguiente;
			} if (inicio.clave==clave) {
				inicio.valores.siguienteValor=inicio.valores;
				inicio.valores.valor=x;
			}
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
		NodoValor anterior2=null;
		NodoValor actual2=actual.valores;
		while(actual2.valor!=x) {
			anterior2=actual2;
			actual2=actual2.siguienteValor;
		}
		anterior2.siguienteValor=actual2.siguienteValor;
	}

	public ColaTDA obtener(int clave) {
		ColaTDA c=new ColaPrimeroInicioDinamica();
		c.inicializarCola();
		Nodo anterior=null;
		Nodo actual=inicio;
		while (actual.clave!=clave) {
			anterior=actual;
			actual=actual.siguiente;
		}
		NodoValor actual2=actual.valores;
		while (actual2.siguienteValor!=null) {
			c.acolar(actual2.valor);
			actual2=actual2.siguienteValor;
		}
		return c;
	}

	public ConjuntoTDA claves() {
		return conjuntoClaves;
	}

}
