package codigoPrincipal;

import java.util.Scanner;

import implementacion.PilaTopeFinalDinamica;
import interfaces.PilaTDA;

//IMPORTANTE: Este main imprime a la pila al revés de como es, porque el método "tope" devuelve la última
//posición de la pila. Si quisiera imprimirla en el orden que tiene que estar, podría hacer otro método que sea
//"primero" y devuelva el nodo inicio. 
//En el main de la otra pila (Tope al Inicio) imprime exactamente igual que en este main, pero básicamente porque
//en la implementación de esa pila, el "tope" devuelve el elemento de la posición 0 de la pila (el cual es el
//último, o sea el tope.

public class AppPilaTopeFinalDinamica {

	public static void main(String[] args) {
		PilaTDA pl=new PilaTopeFinalDinamica();
		pl.inicializarPila();
		System.out.println("Ingresar datos por teclado. Para finalizar ingrese un 0.");
		cargarEnteros(pl);
		System.out.println("Pila cargada");
		mostrarPila(pl);
	}

	private static void cargarEnteros(PilaTDA pl) {
		Scanner teclado=new Scanner(System.in);
		int dato;
		System.out.println("Ingrese un número entero: ");
		dato=teclado.nextInt();
		while (dato!=0) {
			pl.apilar(dato);
			System.out.println("Ingrese un número entero: ");
			dato=teclado.nextInt();
		}
	}

	private static void mostrarPila(PilaTDA pl) {
		while (!pl.pilaVacia()) {
			System.out.print(pl.tope()+" - ");
			pl.desapilar();
		}
		System.out.println();
	}

}
