package codigoPrincipal;

import java.util.Scanner;

import implementacion.DiccionarioSimpleEstatico;
import interfaces.DiccionarioSimpleTDA;

public class AppDiccionarioSimpleEstatico {

	public static void main(String[] args) {
		DiccionarioSimpleTDA dc=new DiccionarioSimpleEstatico();
		dc.inicializarDiccionarioSimple();
		System.out.println("Ingresar datos por teclado. Para finalizar ingrese un 0.");
		cargarDC(dc);
		System.out.println("Diccionario cargado.");
		mostrarDC(dc);
	}


	private static void cargarDC(DiccionarioSimpleTDA dc) {
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


	private static void mostrarDC(DiccionarioSimpleTDA dc) {
		Scanner tecl=new Scanner(System.in);
		int cl;
		System.out.println("Ingrese una clave para buscar (0 para cancelar): ");
		cl=tecl.nextInt();
		while(cl!=0) {
			int valor=dc.obtener(cl);
			if (valor==0) {
				System.out.println("La clave ingresada no existe.");
				System.out.println("Ingrese una clave para buscar (0 para cancelar): ");
				cl=tecl.nextInt();
			}
			else {
				System.out.println("El valor asociado a la clave es: ");
				System.out.println(valor);
				System.out.println("Ingrese una clave para buscar (0 para cancelar): ");
				cl=tecl.nextInt();
			}
		}
	}

}
