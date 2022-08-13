package interfaces;

/**
 * @ArbolDeB�squedaBinaria es una colecci�n de elementos ordenados en forma jer�rquica (todos n�meros enteros). 
 * Entre dos elementos vinculados se define la relaci�n padre-hijo. Cada elemento
 * tiene s�lo un padre, excepto el elemento ra�z del �rbol que no tiene padre.
 * @author Dario Ferrari.
 *
 */

public interface ABBTDA2 {
	/**
	 * @Tarea permite inicializar el �rbol.
	 */
	void inicializarABB();
	/**
	 * @Tarea devuelve el valor de la ra�z.
	 * @Precondici�n el �rbol no puede estar vac�o.
	 * @return
	 */
	int raiz();
	/**
	 * @Tarea devuelve la referencia al sub�rbol izquierdo. No elimina los elementos del sub�rbol.
	 * @Precondici�n el �rbol no puede estar vac�o.
	 * @return
	 */
	ABBTDA hijoIzquierdo();
	/**
	 * @Tarea devuelve la referencia al sub�rbol derecho. No elimina los elementos del sub�rbol.
	 * @Precondici�n el �rbol no puede estar vac�o.
	 * @return
	 */
	ABBTDA hijoDerecho();
	/**
	 * @Tarea agrega un valor suministrado.
	 * @Precondici�n el �rbol debe estar inicializado y NO debe existir el valor.
	 * @param x
	 */
	void agregar(int x);
	/**
	 * @Tarea elimina un valor suministrado X.
	 * @Precondici�n el valor debe existir.
	 * @param x
	 */
	void eliminar(int x);
	/**
	 * @Tarea Devuelve TRUE si el �rbol NO contiene elementos.
	 * @Precondici�n el �rbol debe estar inicializado.
	 * @return
	 */
	boolean arbolVacio();
	/**
	 * @Tarea devuelve TRUE si el valor suministrado X pertenece al �rbol.
	 * @Precondici�n el �rbol debe estar inicializado.
	 * @param x
	 * @return
	 */

}
