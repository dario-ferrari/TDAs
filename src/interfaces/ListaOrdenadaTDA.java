package interfaces;

/**
 * 
 * @author Dario Ferrari
 * @Lista es una colección de nodos, que a su vez son una agrupación de datos
 * y elementos de control. Estos nodos se recorren de forma secuencial, y la cantidad
 * de nodos está limitada por la capacidad de la memoria del equipo ejecutando el programa.
 *
 */

//Esta lista es igual a la lista normal, sólo que tiene un sólo método de "agregar", y ordena los elementos de menor
//a mayor. La lista normal tiene varios métodos para agregar elementos a la lista (agregar al principio, al final y
//agregar en general).

public interface ListaOrdenadaTDA {
	/**
	 * @Tarea Inicializa la lista.
	 */
	void inicializarLista();
	/**
	 * @Tarea Agrega el elemento "x" al inicio de la lista.
	 * @Precondición la lista debe estar inicializada.
	 * @param x
	 */
	void agregar(int x);
	/**
	 * @Tarea Agrega el elemento en la lista en forma ascendente.
	 * @Precondición la lista debe estar inicializada.
	 * @param x
	 */
	void eliminarInicio();
	/**
	 * @Tarea elimina el último elemento de la lista.
	 * @Precondición la lista debe estar inicializada.
	 */
	void eliminarFinal();
	/**
	 * @Tarea elimina un elemento dado de la lista.
	 * @Precondición la lista debe estar inicializada.
	 * @param x
	 */
	void eliminar(int x);
	/**
	 * @Tarea devuelve True si un elemento dado está en la lista.
	 * @Precondición la lista debe estar inicializada.
	 * @param x
	 * @return
	 */
	boolean existe(int x);
	/**
	 * @Tarea devuelve una cola con todos los elementos de la lista, en el orden que se encuentran.
	 * @Precondición La lista debe estar inicializada.
	 * @return
	 */
	ColaTDA valores();
	/**
	 * @Tarea devuelve True si la lista está vacía.
	 * @Precondición la lista debe estar inicializada.
	 * @return
	 */
	boolean listaVacia();

}
