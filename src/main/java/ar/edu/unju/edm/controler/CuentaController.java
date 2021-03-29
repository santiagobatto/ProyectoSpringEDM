package ar.edu.unju.edm.controler;

import ar.edu.unju.edm.model.Cuenta;

public class CuentaController {

	public void operarConCuenta() {
		//una instancia de la clase cuenta
		Cuenta nuevaCuenta = new Cuenta();
		
		int numCuenta = 1;
		int dni  = 44812542;
		int saldo = 0;
		
		//una instancia de la clase Cuenta con valores asignados a sus atributos
		Cuenta otraCuenta = new Cuenta (numCuenta, dni, saldo);
		
		System.out.println("valor de nombre de nuevaCuenta: "+nuevaCuenta.getNombre());
	
		System.out.println("valor de dni de otraCuenta: "+otraCuenta.getDni());
		
		System.out.println("valor de saldo de la cuenta:"+otraCuenta.getSaldo());
		
		otraCuenta.depositar(1000);
		otraCuenta.depositar(5000);
		
		System.out.println("valor de saldo de la cuenta:"+otraCuenta.getSaldo());
		
		otraCuenta.extraer(9000);
		
		if (otraCuenta.getSaldo()<0) {
			System.out.println("saldo insuficiente, no se puede hacer la operacion");
			otraCuenta.depositar(9000);
		}
		
		System.out.println("valor de saldo de la cuenta:"+otraCuenta.getSaldo());
	}
	
}
