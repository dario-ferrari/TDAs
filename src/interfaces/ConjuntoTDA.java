package interfaces;

/**
 * 
 * @author Dario Ferrari
 * @Conjunto es una estructura de datos �nicos que pueden no estar ordenados. El elemento se obtiene al azar.
 *
 */

public interface ConjuntoTDA {
	/**
	 * @Tarea Inicializa el conjunto.
	 */
	void inicializarConjunto();
	/**
	 * @Tarea agrega un elemento X al conjunto.
	 * @Precondici�n El conjunto debe estar inicializado, y el elemento no debe existir.
	 * @Importante los elementos de un conjunto son �NICOS, no pueden haber 2 elementos iguales en un mismo conjunto.
	 */
	void agregar(int x);
	/**
	 * @Tarea Elimina un elemento X del conjunto.
	 * @Precondici�n El elemento a eliminar debe pertenecer al conjunto.
	 */
	void sacar(int x);
	/**
	 * @Tarea Devuelve un valor aleatorio del conjunto (el elemento no se elimina).
	 * @Precondici�n El conjunto NO debe estar vac�o.
	 */
	int elegir();
	/**
	 * @Tarea Devuelve True si el conjunto est� vac�o.
	 * @Precondici�n El conjunto debe estar inicializado.
	 */
	boolean conjuntoVacio();
	/**
	 * @Tarea Devuelve True si el valor X que recibe la funci�n como par�metro, se encuentra en el conjunto.
	 * @Precondici�n El conjunto debe estar inicializado.
	 */
	boolean pertenece(int x);

}
