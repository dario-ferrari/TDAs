package interfaces;

/**
 * 
 * @author Dario Ferrari
 * @DiccionarioMúltipleDinámico
 *
 */

public interface DiccionarioMultipleDinTDA {
	/**
	 * @Tarea Inicializa el diccionario.
	 */
	void inicializarDiccionarioMultiple();
	/**
	 * @Tarea Agrega un elemento X a una clave, ambos datos son suministrados.
	 * @Precondición El diccionario debe estar inicializado y el valor no debe existir para esa clave.
	 * @param clave
	 * @param x
	 */
	void agregar(int clave, int x);
	/**
	 * @Tarea Elimina una clave suministrada.
	 * @Precondición La clave debe existir.
	 * @param clave
	 */
	void eliminar(int clave);
	/**
	 * @Tarea Elimina un valor dado X asociado a una clave. Ambos datos son suministrados.
	 * @Precondición Tanto la clave como el valor deben existir.
	 * @param clave
	 * @param x
	 */
	void eliminarValor(int clave, int x);
	/**
	 * @Tarea Devuelve los valores asociados a una clave suministrada. No elimina los valores.
	 * @Precondición La clave debe existir.
	 * @param clave
	 * 
	 */
	ColaTDA obtener(int clave);
	/**
	 * @Tarea Devuelve el conjunto de claves del diccionario. No elimina las claves.
	 * @Precondición El diccionario debe estar inicializado.
	 * 
	 */
	ConjuntoTDA claves();
}
