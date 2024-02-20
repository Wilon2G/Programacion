package algoritmos;

import utilidades.Entrada;

public class Funcion {

	public static void main(String[] args) {
		double b,a,resultado,t;
		saludar("Pepe",2); //llamada a una función con parametros reales, tales parámetros deben ir en el orden específico en el que se definen
		System.out.println("temperatura celsius?");
		t=Entrada.entero();
		System.out.println(convertirFahrenheit(t)+" Fahrenheit");
		
		System.out.println("Temperatura fahrenheit?");
		t=Entrada.real();
		System.out.println(convertirCelsius(t)+" Celsius");
		
		nada();
		
		System.out.println("Introduzca números");
		a=Entrada.real();
		b=Entrada.real();
		resultado =sumar(a,b);
		System.out.println("la suma es "+resultado);
		System.out.println("la división es "+dividir(a,b) );
		System.out.println("La resta es "+restar(a,b));
		System.out.println("La multiplicación es "+multiplicar(a,b));
		
		

		System.out.println("El area del triangulo es: "+area(b,a));
		
	}

	private static double convertirCelsius(double t) {
		return (t-32)*10/18;
	}

	private static double area(double base,double altura) {
		return base*altura/2;
	}
	private static double dividir(double n1, double n2) {
		return n1/n2;
	}
	private static double restar(double n1, double n2) {
		return n1-n2;
	}
	private static double multiplicar(double n1,double n2) {
		return n1*n2;
	}
	private static double sumar(double n1, double n2) {
		//saludar("jose",5);
		return n1+n2;
	}

	private static void saludar(String nombre, int veces) { //definición de una función con parámetros formales
		while (veces>0) {
			System.out.println("Hola "+nombre);
			veces--;
		}
	}             
	private static double convertirFahrenheit(double t) {
		return (18*t/10)+32;
	}
	
	private static void nada() {}

	

	
	
	
	
	
	
	
	
	
}


//	System.out.println(t+" Grados celsisus son:");
//System.out.println((8*t/10)+" Grados Reamur");
	//System.out.println((18*t/10)+32+" Grados Fahrenheit");
//	System.out.println((t+273)+" Grados Kelvin");
	//System.out.println("");










