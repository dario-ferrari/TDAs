package interfaces;

/**
 * @author Dario Ferrari
 * @Pila es una estructura que permite almacenar una colección de valores, eliminarlos
 * y recuperarlos, con la particularidad de que el elemento que se recupera o elimina 
 * es el último que ingresó.
 */

public interface PilaTDA {
	/**@Tarea inicializa la estructura de Pila.
	 * @Precondición ninguna.
	 */
	void inicializarPila();
	/**@Tarea Apilar agrega un elemento. 
	 * @Precondición la pila debe estar inicializada.
	 */
	void apilar(int x);
	/**@Tarea Elimina el último elemento ingresado.
	 * @Precondición La estructura NO tiene que estar vacía.
	 */
	void desapilar();
	/**@Tarea Obtiene el último elemento ingresado a la pila.
	 * @Precondición La pila NO debe estar vacía.
	 */
	int tope();
	/**@Tarea Indica si la pila contiene elementos o no.
	 * @Precondición la pila debe estar inicializada.
	 */
	boolean pilaVacia();
	
}
