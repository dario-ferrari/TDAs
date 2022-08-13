package implementacion;

import interfaces.ColaTDA;

public class ColaPrimeroInicioEstatica implements ColaTDA {
	
	private int vector[];
	private int cant;

	public void inicializarCola() {
		
		vector=new int[101];
		cant=0;
		
	}

	public void acolar(int x) {
		
		vector[cant]=x;
		cant++;
		
	}

	public void desacolar() {
		
		int i=0;
		while(i<cant) {
			vector[i]=vector[i+1];
			i++;
		}
		cant--;

	}

	public int primero() {
		return vector[0];
	}

	public boolean colaVacia() {
		return cant==0;
	}

}
