package interfaces;

/**
 * @author Dario Ferrari
 * @ColaConPrioridad es una estructura que permite almacenar una colecci�n de valores,
 * tal que, el orden de salida est� dado por su prioridad. El primero en salir o a eliminar
 * es el dato de mayor prioridad.  
 */

public interface ColaPrioridadTDA {
	/**
	 * @Tarea inicializa la estructura de Cola con Prioridad.
	 */
	void inicializarCola();
	/**
	 * @Tarea agrega un elemento a la cola y su prioridad.
	 * @Precondici�n la estructura debe estar inicializada.
	 */
	//X es el DATO, y P es la PRIORIDAD que se agregan al elemento (nodo).
	void acolarPrioridad(int x, int p);
	/**
	 * @Tarea elimina el primer elemento con la mayor prioridad.
	 * @Precondici�n la estructura debe contener datos.
	 */
	void desacolar();
	/**
	 * @Tarea obtiene el primer elemento a eliminar.
	 * @Precondici�n la estructura no debe estar vac�a.
	 */
	int primero();
	/**
	 * @Tarea obtiene la prioridad del primer elemento a eliminar.
	 * @Precondici�n la estructura no debe estar vac�a.
	 */
	int prioridad();
	/**
	 * @Tarea indica si la cola contiene elementos.
	 * @Precondici�n la estructura debe estar inicializada.
	 */
	boolean colaVacia();

}
