package interfaces;

/**
 * @author Dario Ferrari
 * @Pila es una estructura que permite almacenar una colecci�n de valores, eliminarlos
 * y recuperarlos, con la particularidad de que el elemento que se recupera o elimina 
 * es el �ltimo que ingres�.
 */

public interface PilaTDA {
	/**@Tarea inicializa la estructura de Pila.
	 * @Precondici�n ninguna.
	 */
	void inicializarPila();
	/**@Tarea Apilar agrega un elemento. 
	 * @Precondici�n la pila debe estar inicializada.
	 */
	void apilar(int x);
	/**@Tarea Elimina el �ltimo elemento ingresado.
	 * @Precondici�n La estructura NO tiene que estar vac�a.
	 */
	void desapilar();
	/**@Tarea Obtiene el �ltimo elemento ingresado a la pila.
	 * @Precondici�n La pila NO debe estar vac�a.
	 */
	int tope();
	/**@Tarea Indica si la pila contiene elementos o no.
	 * @Precondici�n la pila debe estar inicializada.
	 */
	boolean pilaVacia();
	
}
