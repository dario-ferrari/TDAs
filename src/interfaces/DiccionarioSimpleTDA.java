package interfaces;

/**
 * 
 * @author DarioFerrari
 * @DiccionarioSimple es una colecci�n de pares asociados (clave y valor), las claves son
 * �NICAS. No puede existir una clave sin un valor asociado.
 */

public interface DiccionarioSimpleTDA {
	/**
	 * @Tarea Inicializa el diccionario.
	 */
	void inicializarDiccionarioSimple();
	
	/**
	 * @Tarea Agrega un elemento X a una clave suministrada.
	 * @Precondici�n El diccionario debe estar inicializado, y NO debe existir la clave.
	 */
	void agregar(int clave, int x);
	
	/**
	 * @Tarea Elimina una clave suministrada.
	 * @Precondici�n La clave debe existir.
	 */
	void eliminar(int clave);
	
	/**
	 * @Tarea Devuelve el valor asociado a la clave suministrada. No elimina el valor.
	 * @Precondici�n La clave debe existir.
	 */
	int obtener(int clave);
	
	/**
	 * @Tarea Devuelve el conjunto de claves del diccionario. No elimina las claves.
	 * @Precondici�n El diccionario debe estar inicializado.
	 */
	ConjuntoTDA claves();

}
