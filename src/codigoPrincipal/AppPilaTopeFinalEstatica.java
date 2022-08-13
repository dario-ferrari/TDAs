package codigoPrincipal;
import java.util.Scanner;
import implementacion.PilaTopeFinalEstatica;
import interfaces.PilaTDA;

/**
 * @author Dario Ferrari
 * Codificaci�n de la Pila Est�tica con TOPE AL FINAL que dio la profesora.
 *
 */


public class AppPilaTopeFinalEstatica {

	public static void main(String[] args) {
		PilaTDA pl=new PilaTopeFinalEstatica();
		//Creo un objeto "pl" de tipo PilaTDA.
		pl.inicializarPila();
		//Invoco al m�todo inicializarPila() de la clase "PilaTopeFinalEstatica" que b�sicamente crea un vector con capacidad para
		//100 n�meros enteros.
		System.out.println("Ingresar datos por teclado. Para finalizar ingrese un 0.");
		cargarPilaEnteros(pl);
		//cargarPilaEnteros es un m�todo que con un objeto Scanner le pide al usuario que ingrese n�meros
		//por teclado, y luego los agrega al vector creado anteriormente usando el m�todo "apilar" de la clase Pila.
		System.out.println("Pila cargada");
		mostrarPilaEnteros(pl);
	}
	
	public static void cargarPilaEnteros(PilaTDA p) {
		Scanner teclado = new Scanner(System.in);
		//Creo un objeto "teclado" de tipo Scanner, que recibe datos ingresados por el teclado.
		int dato;
		System.out.print("Dato? ");
		dato=teclado.nextInt();
		while (dato!=0) {
			p.apilar(dato);
			//Mientras que el n�mero ingresado sea distinto a 0, agrega n�meros al vector usando el m�todo "apilar".
			System.out.println("Dato? ");
			dato=teclado.nextInt();
		}
	}
	
	public static void mostrarPilaEnteros(PilaTDA p) {
		while (!p.pilaVacia()) {
			System.out.print(p.tope()+" - ");
			p.desapilar();
		}
		System.out.println();
	}

}
