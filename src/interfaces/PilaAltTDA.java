package interfaces;

/**
 * @author Dario Ferrari
 * @Pila es una estructura que permite almacenar una colecci�n de valores, eliminarlos
 * y recuperarlos, con la particularidad de que el elemento que se recupera o elimina 
 * es el �ltimo que ingres�.
 */

//Esta interfaz de pila es la que hice para el Ejercicio 2 de las Tareas en Teams. Y es usada por una Pila Est�tica
//con Tope al Inicio, pero con un c�digo distinto al de la pila est�tica con tope al inicio que dio la profesora.
//Esta interfaz no tiene los m�todos "tope" y "desapilar" separados, sino que junta ambos creando "topeSacar".

public interface PilaAltTDA {
	/**@Tarea inicializa la estructura de Pila.
	 * @Precondici�n ninguna.
	 */
	void inicializarPila();
	/**@Tarea Apilar agrega un elemento. 
	 * @Precondici�n la pila debe estar inicializada.
	 */
	void apilar(int x);
	/**@Tarea elimina el �ltimo elemento agregado a la pila. Junta los m�todos "tope" y "desapilar".
	 * @Precondici�n La estructura debe estar inicializada y no vac�a.
	 */
	int topeSacar();
	/**@Tarea Indica si la pila contiene elementos o no.
	 * @Precondici�n la pila debe estar inicializada.
	 */
	boolean pilaVacia();

}
