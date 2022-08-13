package interfaces;

/**
 * @author Dario Ferrari
 * @Pila es una estructura que permite almacenar una colección de valores, eliminarlos
 * y recuperarlos, con la particularidad de que el elemento que se recupera o elimina 
 * es el último que ingresó.
 */

//Esta interfaz no tiene los métodos "tope" y "desapilar" separados, sino que junta ambos creando "topeSacar".

public interface PilaAltTDA {
	/**@Tarea inicializa la estructura de Pila.
	 * @Precondición ninguna.
	 */
	void inicializarPila();
	/**@Tarea Apilar agrega un elemento. 
	 * @Precondición la pila debe estar inicializada.
	 */
	void apilar(int x);
	/**@Tarea elimina el último elemento agregado a la pila. Junta los métodos "tope" y "desapilar".
	 * @Precondición La estructura debe estar inicializada y no vacía.
	 */
	int topeSacar();
	/**@Tarea Indica si la pila contiene elementos o no.
	 * @Precondición la pila debe estar inicializada.
	 */
	boolean pilaVacia();

}
