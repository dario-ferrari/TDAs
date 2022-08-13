package implementacion;

import interfaces.PilaAltTDA;

/**
 * @author Dario Ferrari
 * @Implementación alternativa de Pila Estática con tope al inicio, que combina los métodos "tope" y "desapilar" en
 * "topeSacar".
 */

public class PilaTopeInicioEstaticaAlt implements PilaAltTDA {
	
	private int [] vector;
	private int cant;

	public void inicializarPila() {
		vector=new int[100];
		cant=0;
	}

	public void apilar(int x) {
		if(cant==0) {
			vector[0]=x;
			cant++;
		} else {
			int i=cant;
			while(i>0) {
				vector[i]=vector[i-1];
				i--;
			}
			vector[0]=x;
			cant++;
		}
	}
	
	public int topeSacar() {
		int auxiliarTope=vector[0];
		int i=0;
		while (i<cant-1) {
			vector[i]=vector[i+1];
			i++;
		}
		cant--;
		return auxiliarTope;
	}

	public boolean pilaVacia() {
		return cant==0;
	}

}
