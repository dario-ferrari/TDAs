package implementacion;
import java.util.Random;
import interfaces.ConjuntoTDA;

public class Conjunto implements ConjuntoTDA {
	
	private int[] vector;
	private int cant;
	private Random posAzar;
	private final int posicionInferior=0;
	
	public void inicializarConjunto() {
		vector=new int[100];
		cant=0;
		posAzar=new Random(System.currentTimeMillis());
	}

	public void agregar(int x) {
		vector[cant]=x;
		cant++;
	}

	public void sacar(int x) {
		int i=cant-1;
		while (vector[i]!=x) {
			i--;
		}
		vector[i]=vector[cant-1];
		cant--;
	}

	public int elegir() {
		int i=posAzar.nextInt(cant-1-posicionInferior+1)+posicionInferior;
		return vector[i];
	}

	public boolean conjuntoVacio() {
		if (cant==0) {
			return true;
		}
		else{ 
			return false;
		}
	}

	public boolean pertenece(int x) {
		int b=cant;
		int c=0;
		while(b!=0) {
			if (vector[c]==x) {
				return true;
			}
		b--;
		c++;
		}
		return false;
	}
}
