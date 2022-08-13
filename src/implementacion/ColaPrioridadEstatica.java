package implementacion;

import interfaces.ColaPrioridadTDA;

public class ColaPrioridadEstatica implements ColaPrioridadTDA {
	
	private int[]prior;
	private int[]valor;
	
	int cant;
	//Cant indica la primera posición disponible.
	
	public void inicializarCola() {
		prior=new int[100];
		//Creo vector prioridad.
		valor=new int[100];
		//Creo vector valor.
		cant=0;
	}

	public void acolarPrioridad(int x, int p) {
		//Verifica si la prioridad de la que me enviaron es más chica que la del último elemento.
		//Para que en el momento de insertar tenga el espacio para asignar los valores de prioridad y valor.
		int i=cant-1;
		while(i>=0 && p<=prior[i]) { //"p" es la prioridad que me llega.
			prior[i+1]=prior[i];
			valor[i+1]=valor[i];
			i--;
		}
		prior[i+1]=p;
		valor[i+1]=x;
		cant++;
	}

	public void desacolar() {
		cant--;
	}

	public int primero() {
		return valor[cant-1];
	}

	public int prioridad() {
		return prior[cant-1];
	}

	public boolean colaVacia() {
		return cant==0;
	}
}