package interfaces;

/**
 * 
 * @author Dario Ferrari
 * @Lista es una colecci�n de nodos, que a su vez son una agrupaci�n de datos
 * y elementos de control. Estos nodos se recorren de forma secuencial, y la cantidad
 * de nodos est� limitada por la capacidad de la memoria del equipo ejecutando el programa.
 *
 */

public interface ListaTDA {
	/**
	 * @Tarea Inicializa la lista.
	 */
	void inicializarLista();
	/**
	 * @Tarea Agrega el elemento "x" al inicio de la lista.
	 * @Precondici�n la lista debe estar inicializada.
	 * @param x
	 */
	void agregarInicio(int x);
	/**
	 * @Tarea Agrega el elemento al final de la lista.
	 * @Precondici�n la lista debe estar inicializada.
	 * @param x
	 */
	void agregarFinal(int x);
	/**
	 * @Tarea elimina el primer elemento de la lista.
	 * @Precondici�n la lista debe estar inicializada.
	 */
	void eliminarInicio();
	/**
	 * @Tarea elimina el �ltimo elemento de la lista.
	 * @Precondici�n la lista debe estar inicializada.
	 */
	void eliminarFinal();
	/**
	 * @Tarea elimina un elemento dado de la lista.
	 * @Precondici�n la lista debe estar inicializada.
	 * @param x
	 */
	void eliminar(int x);
	/**
	 * @Tarea devuelve True si un elemento dado est� en la lista.
	 * @Precondici�n la lista debe estar inicializada.
	 * @param x
	 * @return
	 */
	boolean existe(int x);
	/**
	 * @Tarea devuelve una cola con todos los elementos de la lista, en el orden que se encuentran.
	 * @Precondici�n La lista debe estar inicializada.
	 * @return
	 */
	ColaTDA valores();
	/**
	 * @Tarea devuelve True si la lista est� vac�a.
	 * @Precondici�n la lista debe estar inicializada.
	 * @return
	 */
	boolean listaVacia();


}
