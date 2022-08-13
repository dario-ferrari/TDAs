package implementacion;

import interfaces.ConjuntoTDA;
import interfaces.GrafoTDA;

public class GrafoDinamico implements GrafoTDA {
	
	class NodoGrafo { // nodo verde
		int nodo;
		NodoArista arista; // flecha roja
		NodoGrafo sigNodo; // flecha verde
	}

	class NodoArista { // nodo rojo
		int etiqueta;
		NodoGrafo nodoDestino; // flecha verde de trazos
		NodoArista sigArista; // flecha roja de trazos
	}
	
	private NodoGrafo origen;
	
	public void inicializarGrafo() {
		origen = null;
	}
	
	public void agregarVertice(int vertice) { // El v´ertice se inserta al inicio de la lista de nodos
		NodoGrafo aux = new NodoGrafo();
		aux.nodo = vertice;
		aux.arista = null;
		aux.sigNodo = origen;
		origen = aux;
	}
	
	private NodoGrafo Vert2Nodo(int vertice) { // Dado un valor, busca el nodo correspondiente
		NodoGrafo aux = origen;
		while (aux != null && aux.nodo != vertice)
			aux = aux.sigNodo;
		return aux;
	}
	
	public void eliminarVertice(int v) {
		if (origen.nodo == v) // Es el origen
			origen = origen.sigNodo; // Chau origen
			NodoGrafo aux = origen; // No es el origen; ¡a buscarlo!
			while (aux != null) { // Eliminamos aristas hacia v
				this.EliminarAristaNodo(aux, v);
				if (aux.sigNodo != null && aux.sigNodo.nodo == v)
					aux.sigNodo = aux.sigNodo.sigNodo; // Si es el nodo, chau nodo
				aux = aux.sigNodo; // Sigue eliminando aristas
		}
	}
	
	public void agregarArista(int v1, int v2, int peso) {
		NodoGrafo n1 = Vert2Nodo(v1); // Buscamos el nodo origen. . .
		NodoGrafo n2 = Vert2Nodo(v2); // . . . y el nodo destino
		NodoArista aux = new NodoArista(); // La arista va al inicio de la lista . . .
		aux.etiqueta = peso; // . . . de aristas salientes de v1
		aux.nodoDestino = n2;
		aux.sigArista = n1.arista;
		n1.arista = aux;
	}
	
	private void EliminarAristaNodo(NodoGrafo nodo, int v) {
		NodoArista aux = nodo.arista; // Elimina de nodo las aristas hacia v
		if (aux != null) {
			if (aux.nodoDestino.nodo == v) { // Hay que eliminar la primera arista
				nodo.arista = aux.sigArista;
			} else { // No es la primera; la buscamos
				while (aux.sigArista != null && aux.sigArista.nodoDestino.nodo != v)
					aux = aux.sigArista;
				if (aux.sigArista != null) { // Eliminamos la arista
					aux.sigArista = aux.sigArista.sigArista;
				}
			}
		}
	}
	
	public void eliminarArista(int v1, int v2) {
		NodoGrafo n1 = Vert2Nodo(v1);
		EliminarAristaNodo(n1, v2); // Listo.
	}
	
	public int pesoArista(int v1, int v2) {
		NodoGrafo n1 = Vert2Nodo(v1);
		NodoArista aux = n1.arista;
		while (aux.nodoDestino.nodo != v2)
			aux = aux.sigArista; // Buscamos la arista
			return aux.etiqueta;
	}
	
	public ConjuntoTDA vertices() {
		ConjuntoTDA c = new Conjunto();
		c.inicializarConjunto();
		NodoGrafo aux = origen;
		while (aux != null) {
			c.agregar(aux.nodo);
			aux = aux.sigNodo;
		}
		return c;
	}
	
	public boolean existeArista(int v1, int v2) {
		NodoGrafo n1 = Vert2Nodo(v1);
		NodoArista aux = n1.arista;
		while (aux != null && aux.nodoDestino.nodo != v2)
			aux = aux.sigArista; // Buscamos la arista
			return (aux != null);
	}	
}
