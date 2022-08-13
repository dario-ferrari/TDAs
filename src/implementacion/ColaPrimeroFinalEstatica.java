package implementacion;

import interfaces.ColaTDA;

public class ColaPrimeroFinalEstatica implements ColaTDA {
	
	private int vector[];
	private int cant;

	public void inicializarCola() {
		vector=new int[101];
		cant=0;
	}

	public void acolar(int x) {
		if (cant==0) {
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

	public void desacolar() {
		cant--;
	}

	public int primero() {
		return vector[cant-1];
	}

	public boolean colaVacia() {
		return cant==0;
	}

}
