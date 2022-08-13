package codigoPrincipal;
import java.util.Scanner;
import implementacion.PilaTopeInicioEstaticaAlt;
import interfaces.PilaAltTDA;

/**
 * @author Dario Ferrari
 * Codificación de la Pila Estática con Tope Al Inicio alternativa hecha para tarea de Teams.
 *
 */

public class AppPilaTopeInicioEstaticaAlt {

	public static void main(String[] args) {
		PilaAltTDA pl=new PilaTopeInicioEstaticaAlt();
		pl.inicializarPila();
		System.out.println("Ingresar datos por teclado. Para finalizar ingrese un 0.");
		cargarPilaEnteros(pl);
		System.out.println("Pila cargada");
		mostrarPilaEnteros(pl);
	}
	
	public static void cargarPilaEnteros(PilaAltTDA p) {
		Scanner teclado = new Scanner(System.in);
		int dato;
		System.out.print("Ingrese: ");
		dato=teclado.nextInt();
		while (dato!=0) {
			p.apilar(dato);
			System.out.println("Ingrese: ");
			dato=teclado.nextInt();
		}
	}
	
	public static void mostrarPilaEnteros(PilaAltTDA p) {
		while (!p.pilaVacia()) {
			System.out.print(p.topeSacar() +" - ");
		}
		System.out.println();
	}

}