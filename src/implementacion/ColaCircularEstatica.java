package implementacion;

import interfaces.ColaTDA;

public class ColaCircularEstatica implements ColaTDA {
	
	private int vector[];
	private int poner, sacar;

	public void inicializarCola() {
		
		vector=new int[101];
		poner=0;
		sacar=0;

	}

	public void acolar(int x) {
		vector[poner]=x;
		poner++;
		if(poner==101) {
			poner=0;
		}
	}

	public void desacolar() {
		sacar++;
		if(sacar==101) {
			sacar=0;
		}
	}

	public int primero() {
		return vector[0];
	}

	public boolean colaVacia() {
		return vector.length==0;
	}

}
