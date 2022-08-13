package implementacion;

public class EjercicioDeClase implements interfaces.EjercicioDeClaseTDA {
	
	private int vector[];
	private int cant;
	
	public void inicializar() {
		vector=new int[20];
		cant=0;
	}
	
	public void agregar(int x) {
		vector[cant]=x;
		cant++;
	}
		
	public int devolverSuma(int []x) {
		int i=0;
		int c=0;
		int contador=0;
		while (i<cant) {
			i=x[contador];
			c=i+c;
			contador++;
		}
		return c;
	}

}
