package codigoPrincipal;

import java.util.Scanner;

import implementacion.DiccionarioMultipleDinamico;
import interfaces.ColaTDA;
import interfaces.DiccionarioMultipleDinTDA;

public class AppDiccionarioMultipleDinamico {

	public static void main(String[] args) {
		DiccionarioMultipleDinTDA dc=new DiccionarioMultipleDinamico();
		dc.inicializarDiccionarioMultiple();
		System.out.println("Ingresar datos por teclado. Para finalizar ingrese un 0.");
		cargarDiccionario(dc);
		System.out.println("Diccionario cargado.");
		mostrarDiccionario(dc);
	}

	private static void cargarDiccionario(DiccionarioMultipleDinTDA dc) {
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

	private static void mostrarDiccionario(DiccionarioMultipleDinTDA dc) {
		Scanner teclado=new Scanner(System.in);
		int cl;
		System.out.print("Ingrese una clave para buscar (0 para cancelar): ");
		cl=teclado.nextInt();
		if(cl!=0) {
			ColaTDA valores=dc.obtener(cl);
			if (valores==null) {
				System.out.println("La clave ingresada no existe.");
				System.out.println("Ingrese una clave para buscar (0 para cancelar): ");
				cl=teclado.nextInt();
			}
			else {
				while(!valores.colaVacia()) {
					System.out.print(valores.primero()+" - ");
					valores.desacolar();
				}
			}
		}

	}

}
