package clases;

public class Persona {
	private String nombre;
	private double altura;
	private int edad;
	
	public String toString() {
		return "//Persona --> nombre = " + nombre + ", altura = " + altura + ", edad = " + edad ;
	}
	
	public Persona(String nombre, double altura, int edad) {
		super();
		setNombre(nombre);
		setAltura(altura);
		setEdad(edad);
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		if (nombre.trim().length()<=1) {
			throw new IllegalArgumentException("Error, el nombre debe estar compuesto por más de un caracter "+"["+nombre+"]");
		}
		this.nombre = nombre;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		if (altura<0.1||altura>3) {
			throw new IllegalArgumentException("Error, la altura no puede ser ni menor que 0.1 ni mayor que 3 metros "+"["+altura+"]");
		}
		this.altura = altura;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		if (edad<0) {
			throw new IllegalArgumentException("Error, la edad de un ser humano no puede ser negativa "+"["+edad+"]");
		}
		this.edad = edad;
	}

	
	
	public static void main(String[] args) {
		Persona p1=new Persona("Juanito",1.7,23);
		Persona p2=new Persona("Pedro",1.3,7);
		Persona p3=new Persona("Juanjo",1.65,30);
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		if (p1.getAltura()<1.5) {
			System.out.println("Short ass mf");
		}
		
	}
	
	
}
