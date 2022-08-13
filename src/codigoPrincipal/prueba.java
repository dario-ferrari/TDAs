package codigoPrincipal;

import implementacion.EjercicioDeClase;
import interfaces.EjercicioDeClaseTDA;

public class prueba {
	public static void main(String[] args) {
		EjercicioDeClaseTDA coso;
		coso=new EjercicioDeClase();
		coso.inicializar();
		coso.agregar(2);
		coso.agregar(2);
		coso.agregar(2);
		System.out.println("La sumatoria total es: ");
	}

}