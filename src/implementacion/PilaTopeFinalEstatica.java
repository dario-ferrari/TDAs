package implementacion;
import interfaces.PilaTDA;

/**
 * @author Dario Ferrari
 * @Implementaci�n de Pila Est�tica con tope al FINAL (�ltimo elemento ingresado en la �LTIMA posici�n del
 * vector). Esta es la implementaci�n que dio la profesora.
 * POR ALGUNA RAZ�N EL PROGRAMA FUNCIONA MAL, Y FUNCIONA COMO UNA PILA CON TOPE AL INICIO, PERO EST� BIEN CODIFICADO.
 *
 */

public class PilaTopeFinalEstatica implements PilaTDA {
	
	private int vector[];
	//Contenedor de los datos (o sea, la lista).
	private int cant;
	//La variable "cant" tiene la �ltima POSICI�N desocupada del vector.
	
	public void inicializarPila() {
		vector=new int[100];
		//Se crea el vector, con espacio para 100 valores enteros dentro.
		cant=0;
	}
	
	public void apilar(int x) {
		vector[cant]=x;
		cant+=1;
	}

	public void desapilar() {
		cant-=1;
	}

	public int tope() {
		return vector[cant-1];
	}

	public boolean pilaVacia() {
		return cant==0;
	}

}
