package app.poo.ito;

import java.time.LocalDate;
import clase.ito.poo.CuentaBancaria;

public class MyApp {
	
	static void run() {
		CuentaBancaria A=new CuentaBancaria(89393L, "LuciaMendoza",15000, LocalDate.of(2021, 2, 18));
		System.out.println(A);
		System.out.println("Cantidad a depositar: "+A.deposito(16000));
		System.out.println(A);
	}

	public static void main(String[] args) {	
		run();
	}
}
