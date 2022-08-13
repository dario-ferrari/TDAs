package codigoPrincipal;

import java.util.Scanner;

import implementacion.PilaTopeFinalDinamica;
import interfaces.PilaTDA;

//IMPORTANTE: Este main imprime a la pila al rev�s de como es, porque el m�todo "tope" devuelve la �ltima
//posici�n de la pila. Si quisiera imprimirla en el orden que tiene que estar, podr�a hacer otro m�todo que sea
//"primero" y devuelva el nodo inicio. 
//En el main de la otra pila (Tope al Inicio) imprime exactamente igual que en este main, pero b�sicamente porque
//en la implementaci�n de esa pila, el "tope" devuelve el elemento de la posici�n 0 de la pila (el cual es el
//�ltimo, o sea el tope.

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
		System.out.println("Ingrese un n�mero entero: ");
		dato=teclado.nextInt();
		while (dato!=0) {
			pl.apilar(dato);
			System.out.println("Ingrese un n�mero entero: ");
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
