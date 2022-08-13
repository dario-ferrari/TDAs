package interfaces;

/**
 * 
 * @author DarioFerrari
 * @DiccionarioSimple es una colección de pares asociados (clave y valor), las claves son
 * ÚNICAS. No puede existir una clave sin un valor asociado.
 */

public interface DiccionarioSimpleTDA {
	/**
	 * @Tarea Inicializa el diccionario.
	 */
	void inicializarDiccionarioSimple();
	
	/**
	 * @Tarea Agrega un elemento X a una clave suministrada.
	 * @Precondición El diccionario debe estar inicializado, y NO debe existir la clave.
	 */
	void agregar(int clave, int x);
	
	/**
	 * @Tarea Elimina una clave suministrada.
	 * @Precondición La clave debe existir.
	 */
	void eliminar(int clave);
	
	/**
	 * @Tarea Devuelve el valor asociado a la clave suministrada. No elimina el valor.
	 * @Precondición La clave debe existir.
	 */
	int obtener(int clave);
	
	/**
	 * @Tarea Devuelve el conjunto de claves del diccionario. No elimina las claves.
	 * @Precondición El diccionario debe estar inicializado.
	 */
	ConjuntoTDA claves();

}
