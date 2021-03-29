package ar.edu.unju.edm.model;

public class Calculadora {
	
	private float a;
	private float b;
	
	public Calculadora() {
		// TODO Auto-generated constructor stub
	}

	public float sumar () {
		
		float suma;
		suma=a+b;
		return suma;
		
	}
	
	public float dividir () {
		
		float division;
		division=0;
		
		if (b==0) {
			System.out.println("El segundo numero no puede ser 0");
		}
		else {
			division=a/b;
		}
		return division;
	}
	
	public float getA() {
		return a;
	}

	public void setA(float numero) {
		this.a = numero;
	}

	public float getB() {
		return b;
	}

	public void setB(float b) {
		this.b = b;
	}

	@Override
	public String toString() {
		return "Calculadora [a=" + a + ", b=" + b + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Calculadora other = (Calculadora) obj;
		if (a != other.a)
			return false;
		if (b != other.b)
			return false;
		return true;
	}	
	
	

}
