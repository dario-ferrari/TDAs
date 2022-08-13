package implementacion;

import interfaces.ConjuntoTDA;
import interfaces.DiccionarioSimpleTDA;

/**
 * 
 * @author Dario Ferrari
 * @DiccionarioSimple
 *
 */

public class DiccionarioSimpleEstatico implements DiccionarioSimpleTDA {
	
	private class Elemento {
		int clave, dato;
	}
	
	private Elemento[]vector;
	private int cant;
	private ConjuntoTDA listaClaves=new Conjunto();
	
	public ConjuntoTDA claves() {
		return listaClaves;
	}
	
	public void inicializarDiccionarioSimple() {
		vector=new Elemento[100];
		cant=0;
		listaClaves.inicializarConjunto();
	}

	public void agregar(int clave, int x) {
		Elemento nuevo=new Elemento();
		nuevo.clave=clave;
		nuevo.dato=x;
		if(listaClaves.pertenece(clave)==false) {
			listaClaves.agregar(clave);
			vector[cant]=nuevo;
			cant++;
		}
		else {
			vector[cant]=nuevo;
			cant++;
		}
	}

	public void eliminar(int clave) {
		if (listaClaves.pertenece(clave)==true) {
			int cont=0;
			int cont2=cant;
			while (cont2>0) {
				Elemento i=vector[cont];
				int cl=i.clave;
				if (cl==clave) {
					vector[cant]=i;
					int cont3=cont;
					int cont4=cont;
					while (cont3<cant) {
						vector[cont4]=vector[cont4+1];
						cont3++;
						cont4++;
					}
				}
				cont++;
				cont2--;
			}
			cant--;
			listaClaves.sacar(clave);
		}
	}

	public int obtener(int clave) {
		if (listaClaves.pertenece(clave)==false) {
			return 0;
		}
		int cont=0;
		while (vector[cont].clave!=clave) {
			cont++;
		}
		int dt=vector[cont].dato;
		return dt;
	}
		
}