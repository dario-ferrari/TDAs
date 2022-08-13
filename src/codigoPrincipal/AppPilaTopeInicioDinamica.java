package codigoPrincipal;

import java.util.Scanner;

import implementacion.PilaTopeInicioDinamica;
import interfaces.PilaTDA;

public class AppPilaTopeInicioDinamica {

	public static void main(String[] args) {
		PilaTDA pl=new PilaTopeInicioDinamica();
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
