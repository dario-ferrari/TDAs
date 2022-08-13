package interfaces;

/**
 * @author Dario Ferrari
 * @Cola es una estructura que permite almacenar una colección de valores,
 * tal que el primero que entra es el primero que sale.  
 */

public interface ColaTDA {
	//@Tarea inicializa la estructura de Cola.
	void inicializarCola();
	/**
	 * @Tarea agrega un elemento a la cola.
	 * @Precondición la estructura debe estar inicializada.
	 */
	void acolar(int x);
	/**
	 * @Tarea elimina el primer elemento que haya sido agregado.
	 * @Precondición la estructura debe contener datos.
	 */
	void desacolar();
	/**
	 * @Tarea obtiene el primer elemento a eliminar.
	 * @Precondición la estructura no debe estar vacía.
	 */
	int primero();
	/**
	 * @Tarea indica si la cola contiene elementos.
	 * @Precondición la estructura debe estar inicializada.
	 */
	boolean colaVacia();

}
