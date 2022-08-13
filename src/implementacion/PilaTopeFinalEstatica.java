package implementacion;
import interfaces.PilaTDA;

/**
 * @author Dario Ferrari
 * @Implementación de Pila Estática con tope al FINAL (último elemento ingresado en la ÚLTIMA posición del
 * vector). 
 *
 */

public class PilaTopeFinalEstatica implements PilaTDA {
	
	private int vector[];
	//Contenedor de los datos (o sea, la lista).
	private int cant;
	//La variable "cant" tiene la última POSICIÓN desocupada del vector.
	
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
