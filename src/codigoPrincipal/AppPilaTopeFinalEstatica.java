package codigoPrincipal;
import java.util.Scanner;
import implementacion.PilaTopeFinalEstatica;
import interfaces.PilaTDA;

/**
 * @author Dario Ferrari
 * Codificación de la Pila Estática con TOPE AL FINAL que dio la profesora.
 *
 */


public class AppPilaTopeFinalEstatica {

	public static void main(String[] args) {
		PilaTDA pl=new PilaTopeFinalEstatica();
		//Creo un objeto "pl" de tipo PilaTDA.
		pl.inicializarPila();
		//Invoco al método inicializarPila() de la clase "PilaTopeFinalEstatica" que básicamente crea un vector con capacidad para
		//100 números enteros.
		System.out.println("Ingresar datos por teclado. Para finalizar ingrese un 0.");
		cargarPilaEnteros(pl);
		//cargarPilaEnteros es un método que con un objeto Scanner le pide al usuario que ingrese números
		//por teclado, y luego los agrega al vector creado anteriormente usando el método "apilar" de la clase Pila.
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
			//Mientras que el número ingresado sea distinto a 0, agrega números al vector usando el método "apilar".
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
