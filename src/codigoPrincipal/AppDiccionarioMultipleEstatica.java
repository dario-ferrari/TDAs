package codigoPrincipal;

import java.util.Scanner;

import implementacion.DiccionarioMultipleEstatico;
import interfaces.DiccionarioMultipleEstTDA;

public class AppDiccionarioMultipleEstatica {
	
	public static void main(String[] args) {
		DiccionarioMultipleEstTDA dc=new DiccionarioMultipleEstatico();
		dc.inicializarDiccionarioMultiple();
		System.out.println("Ingresar datos por teclado. Para finalizar ingrese un 0.");
		cargarDiccionario(dc);
		System.out.println("Diccionario cargado.");
		mostrarDiccionario(dc);
	}

	private static void cargarDiccionario(DiccionarioMultipleEstTDA dc) {
		Scanner teclado=new Scanner(System.in);
		int clave;
		int dato;
		System.out.println("Ingrese una clave: ");
		clave=teclado.nextInt();
		System.out.println("Ingrese un dato: ");
		dato=teclado.nextInt();
		while(clave!=0) {
			dc.agregar(clave,dato);
			System.out.println("Ingrese una clave: ");
			clave=teclado.nextInt();
			System.out.println("Ingrese un dato: ");
			dato=teclado.nextInt();
		}
	}

	private static void mostrarDiccionario(DiccionarioMultipleEstTDA dc) {
		Scanner teclado=new Scanner(System.in);
		int cl;
		System.out.print("Ingrese una clave para buscar (0 para cancelar): ");
		cl=teclado.nextInt();
		if(cl!=0) {
			int[] valores=dc.obtener(cl);
			if (valores==null) {
				System.out.println("La clave ingresada no existe.");
				System.out.println("Ingrese una clave para buscar (0 para cancelar): ");
				cl=teclado.nextInt();
			}
			else {
				int cont=0;
				int cont2=0;
				int cont3=0;
				int x=valores.length;
				while (x>0) {
					if (valores[cont]!=0) {
						cont2++;
					}
					cont++;
					x--;
				}
				while(cont2>0) {
					int v=valores[cont3];
					System.out.print(v + " - ");
					cont3++;
					cont2--;
				}							
			}
		}
	}
}