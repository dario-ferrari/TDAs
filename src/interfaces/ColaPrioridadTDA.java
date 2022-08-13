package interfaces;

/**
 * @author Dario Ferrari
 * @ColaConPrioridad es una estructura que permite almacenar una colección de valores,
 * tal que, el orden de salida está dado por su prioridad. El primero en salir o a eliminar
 * es el dato de mayor prioridad.  
 */

public interface ColaPrioridadTDA {
	/**
	 * @Tarea inicializa la estructura de Cola con Prioridad.
	 */
	void inicializarCola();
	/**
	 * @Tarea agrega un elemento a la cola y su prioridad.
	 * @Precondición la estructura debe estar inicializada.
	 */
	//X es el DATO, y P es la PRIORIDAD que se agregan al elemento (nodo).
	void acolarPrioridad(int x, int p);
	/**
	 * @Tarea elimina el primer elemento con la mayor prioridad.
	 * @Precondición la estructura debe contener datos.
	 */
	void desacolar();
	/**
	 * @Tarea obtiene el primer elemento a eliminar.
	 * @Precondición la estructura no debe estar vacía.
	 */
	int primero();
	/**
	 * @Tarea obtiene la prioridad del primer elemento a eliminar.
	 * @Precondición la estructura no debe estar vacía.
	 */
	int prioridad();
	/**
	 * @Tarea indica si la cola contiene elementos.
	 * @Precondición la estructura debe estar inicializada.
	 */
	boolean colaVacia();

}
