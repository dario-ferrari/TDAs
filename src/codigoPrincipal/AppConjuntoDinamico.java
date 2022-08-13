package codigoPrincipal;

import java.util.Scanner;

import implementacion.ConjuntoDinamico;
import interfaces.ConjuntoTDA;

public class AppConjuntoDinamico {

	public static void main(String[] args) {
		ConjuntoTDA cj=new ConjuntoDinamico();
		cj.inicializarConjunto();
		System.out.println("Ingresar datos por teclado. Para finalizar ingrese un 0.");
		cargarConjuntoEnteros(cj);
		System.out.println("Conjunto Cargado");
		mostrarConjuntoEnteros(cj);
	}

	private static void cargarConjuntoEnteros(ConjuntoTDA cj) {
		Scanner teclado=new Scanner(System.in);
		int dato;
		System.out.print("Ingrese un número: ");
		dato=teclado.nextInt();
		while (dato!=0) {
			if(!cj.pertenece(dato))
				//Acá agrego un número si NO EXISTE dentro del conjunto. Ya que en el conjunto los elementos son únicos
				//e irrepetibles.
				cj.agregar(dato);
			System.out.print("Ingrese un número: ");
			dato=teclado.nextInt();
		}
	}
	

	private static void mostrarConjuntoEnteros(ConjuntoTDA cj) {
		int x;
		while(!cj.conjuntoVacio()) {
			x=cj.elegir();
			System.out.print(x + " - ");
			cj.sacar(x);
		}
		System.out.println("");
	}

}
