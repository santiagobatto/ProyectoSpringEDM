package ar.edu.unju.edm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ar.edu.unju.edm.controler.CalculadoraControler;
import ar.edu.unju.edm.controler.CuentaController;

@SpringBootApplication
public class SegundoProyectoSprignEdm1Application {

	public static void main(String[] args) {
		SpringApplication.run(SegundoProyectoSprignEdm1Application.class, args);
		CalculadoraControler nuevoControlador = new CalculadoraControler();
		nuevoControlador.resolverSuma();
		
		CuentaController cuenta = new CuentaController();
		cuenta.operarConCuenta();
		
	}

}
