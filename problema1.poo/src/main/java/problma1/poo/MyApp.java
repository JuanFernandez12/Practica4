package problma1.poo;

import problema1.calzado;

public class MyApp {
	
	static void run() {
		calzado x=new calzado(12345, "Cuero","marca", 100,"cafe");
		float costototal=x.costoxLote(15.0);
		System.out.println(x);
		System.out.println("El costo tota por lote es: "+costototal);

	}

	public static void main(String[] args) {
		run();
	}

}
