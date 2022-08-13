package implementacion;

import interfaces.ABBTDA;

public class ArbolABB implements ABBTDA {
	
	class Nodo {
		int valor;
		ABBTDA derecho, izquierdo;
	}
	
	Nodo raiz;
	
	public void inicializarABB() {
		raiz=null;
	}

	public int raiz() {
		return raiz.valor;
	}

	public ABBTDA hijoIzquierdo() {
		return raiz.izquierdo;
	}

	public ABBTDA hijoDerecho() {
		return raiz.derecho;
	}

	public void agregar(int x) {
		if (raiz==null) {
			//Si el �rbol est� vac�o (no hay ra�z), creo un nuevo nodo y lo asigno a la ra�z. Despu�s creo 2 nuevos
			//nodos, uno para el nodo derecho del nodo ra�z, y otro para el nodo izquierdo del nodo ra�z.
			raiz=new Nodo();
			raiz.valor=x;
			raiz.derecho=new ArbolABB();
			raiz.derecho.inicializarABB();
			raiz.izquierdo=new ArbolABB();
			raiz.izquierdo.inicializarABB();
		}
		//Si ya hay elementos en el �rbol, y el valor para agregar es menor que el nodo ra�z, lo agrego a la
		//izquierda. Sino, lo agrego a la derecha.
		else if(x<raiz.valor) {
			raiz.izquierdo.agregar(x);
		} else {
			raiz.derecho.agregar(x);
		}
	}

	public void eliminar(int x) {
		//Si el valor de la ra�z es igual a X, inicio pasa a ser null (lo vac�o).
		if(raiz.valor==x && raiz.derecho.arbolVacio() && raiz.izquierdo.arbolVacio()) {
			raiz=null;
		}
		//Si el valor de la ra�z es igual a X y el hijo derecho est� vac�o, cambio el valor de inicio a el valor
		//mayor de la subrama, y despu�s elimino la subrama.
		else if (raiz.valor==x && raiz.derecho.arbolVacio()) {
			raiz.valor=mayor(raiz.izquierdo);
			raiz.izquierdo.eliminar(raiz.valor);
		}
		//Si el valor de la ra�z es igual a X, cambio el valor de la ra�z (inicio) a el valor menor de la subrama.
		//Despu�s elimino la subrama.
		else if (raiz.valor==x) {
			raiz.valor=menor(raiz.derecho);
			raiz.derecho.eliminar(raiz.valor);
		}
		//Si X es mayor al valor de inicio, elimino la subrama derecha de inicio.
		else if (raiz.valor<x) {
			raiz.derecho.eliminar(x);
		//Si X es menor al valor de inicio, elimino la subrama izquierda de inicio.
		} else {
			raiz.izquierdo.eliminar(x);
		}
		
	}
	
	//M�todo privado que usa recursividad para devolver la subrama derecha de un nodo padre (el hijo mayor).
	private int mayor(ABBTDA arbMayor) {
		if (arbMayor.hijoDerecho().arbolVacio()) {
			return arbMayor.raiz();
		} else {
			return mayor(arbMayor.hijoDerecho());
		}
	}
	
	private int menor(ABBTDA arbMenor) {
		if(arbMenor.hijoIzquierdo().arbolVacio()) {
			return arbMenor.raiz();
		} else {
			return menor(arbMenor.hijoIzquierdo());
		}
	}
	
	public boolean arbolVacio() {
		if (raiz==null) {
			return true;
		}
		return false;
	}

	public boolean pertenece(int x) {
		//Si la ra�z es null, el valor no pertenece al �rbol, ya que el �rbol est� vac�o.
		if (raiz==null) {
			return false;
		} else {
			//Si el valor est� en la ra�z:
			if (raiz.valor==x) {
				return true;
			} else {
				if(raiz.valor<x) {
					return hijoIzquierdo().pertenece(x);
				} else {
					return hijoDerecho().pertenece(x);
				} 
			}
		}
	}
}
