package codigoPrincipal;

import implementacion.ArbolABB;
import interfaces.ABBTDA;

public class AppArbolABB {

	public static void main(String[] args) {
		
		ABBTDA arbol=new ArbolABB();
		ABBTDA arbolDestino=new ArbolABB();
		
		arbol.inicializarABB();
		arbolDestino.inicializarABB();
		
		arbol.agregar(10);
		arbol.agregar(18);
		arbol.agregar(7);
		arbol.agregar(15);
		arbol.agregar(4);
		
		mostrarOrden(arbol);
		System.out.println();
		mostrarEnPreorden(arbol);
		copiarArbol(arbol, arbolDestino);
		System.out.println();
		System.out.println("Copia del primer árbol: ");
		mostrarOrden(arbolDestino);
		System.out.println();
		mostrarEnPreorden(arbolDestino);
		System.out.println();
		System.out.println("Post Orden: ");
		mostrarEnPostorden(arbol);
		
		//arbol.eliminar(10);
		//arbol.eliminar(7);
		System.out.println();
		System.out.println("Árbol vacío: ");
		vaciarArbol(arbol);
		mostrarOrden(arbol);
	}
	
	public static void mostrarOrden(ABBTDA a) {
		if (!a.arbolVacio()) {
			//Muestro los menores:
			mostrarOrden(a.hijoIzquierdo());
			//Muestro la raíz:
			System.out.println(a.raiz());
			//Muestro los mayores:
			mostrarOrden(a.hijoDerecho());
		}
	}
	
	public static void mostrarEnPreorden(ABBTDA a) {
		if (!a.arbolVacio()) {
			System.out.println(a.raiz());
			mostrarEnPreorden(a.hijoIzquierdo());
			mostrarEnPreorden(a.hijoDerecho());
		}
	}
	
	public static void copiarArbol(ABBTDA a, ABBTDA b) {
		if(!a.arbolVacio()) {
			b.agregar(a.raiz());
			copiarArbol(a.hijoIzquierdo(),b);
			copiarArbol(a.hijoDerecho(),b);
		}	
	}
	
	public static void mostrarEnPostorden(ABBTDA a) {
		if (!a.arbolVacio()) {
			mostrarEnPostorden(a.hijoIzquierdo());
			mostrarEnPostorden(a.hijoDerecho());
			System.out.println(a.raiz());
		}
	}
	
	public static void vaciarArbol(ABBTDA a) {
		if(!a.arbolVacio()) {
			vaciarArbol(a.hijoIzquierdo());
			vaciarArbol(a.hijoDerecho());
			a.eliminar(a.raiz());
		}
	}
	
}
