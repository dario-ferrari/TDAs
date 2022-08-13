package interfaces;

/**
 * 
 * @author Dario Ferrari
 * @DiccionarioM�ltipleDin�mico
 *
 */

public interface DiccionarioMultipleDinTDA {
	/**
	 * @Tarea Inicializa el diccionario.
	 */
	void inicializarDiccionarioMultiple();
	/**
	 * @Tarea Agrega un elemento X a una clave, ambos datos son suministrados.
	 * @Precondici�n El diccionario debe estar inicializado y el valor no debe existir para esa clave.
	 * @param clave
	 * @param x
	 */
	void agregar(int clave, int x);
	/**
	 * @Tarea Elimina una clave suministrada.
	 * @Precondici�n La clave debe existir.
	 * @param clave
	 */
	void eliminar(int clave);
	/**
	 * @Tarea Elimina un valor dado X asociado a una clave. Ambos datos son suministrados.
	 * @Precondici�n Tanto la clave como el valor deben existir.
	 * @param clave
	 * @param x
	 */
	void eliminarValor(int clave, int x);
	/**
	 * @Tarea Devuelve los valores asociados a una clave suministrada. No elimina los valores.
	 * @Precondici�n La clave debe existir.
	 * @param clave
	 * 
	 */
	ColaTDA obtener(int clave);
	/**
	 * @Tarea Devuelve el conjunto de claves del diccionario. No elimina las claves.
	 * @Precondici�n El diccionario debe estar inicializado.
	 * 
	 */
	ConjuntoTDA claves();
}
