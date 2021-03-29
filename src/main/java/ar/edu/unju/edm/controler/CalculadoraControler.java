package ar.edu.unju.edm.controler;

import ar.edu.unju.edm.model.Calculadora;

public class CalculadoraControler {
	
	public void resolverSuma() {
	float a=10;
	float b=5;
	
	Calculadora nuevaCalculadora=new Calculadora();
	
	nuevaCalculadora.setA(a);
	nuevaCalculadora.setB(b);
	
	System.out.println("El resultado de la suma es: "+nuevaCalculadora.sumar());
	System.out.println("El resultado de la division es: "+nuevaCalculadora.dividir());

	
	}
}
