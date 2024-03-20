package ejerciciosHerencia.coches;

public class Coche {
	private String matricula;
	
	public static final int MAX=4;
	private static int contador=0;
	private int velocidad=0;
	int marcha=0;
	private int numBastidor=0;
	
	

	public Coche(String matricula) {
		super();
		setMatricula(matricula);
		contador++;
		numBastidor=contador;
		velocidad=0;
		marcha=0;
	}

	public int getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}

	public int getMarcha() {
		return marcha;
	}

	public void setMarcha(int marcha) {
		
		this.marcha = marcha;
	}

	public int getNumBastidor() {
		return numBastidor;
	}

	public void setNumBastidor(int numBastidor) {
		this.numBastidor = numBastidor;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		String mat=validarMatricula(matricula);
		if (mat==null)
			throw new MatriculaInvalida();
		this.matricula = matricula;
	}

	
	
	
	
	public static int getContador() {
		return contador;
	}

	public static void setContador(int contador) {
		Coche.contador = contador;
	}

	public static String validarMatricula(String mat) {
		// Devuelve mat con letras mayusculas sin espacio ni guión
		// null si matrícula no es válida
	
		if (mat == null)
			return null;
	
		String normalizado = mat.trim().toUpperCase(); // Quita espacios en blanco y convierte a mayúsculas
	
		if (!normalizado.matches("[0-9]{4}[ -]?[B-DF-HJ-NP-TV-Z]{3}")) 
			return null;
		//Quitamos espacio o guion que pueda haber
		normalizado=normalizado.replaceAll("[ -]", "");
		return normalizado;
	}



	void cambiarMarcha(int m) {
		setMarcha(m);
		
	}

	public void frenar(int v) {
		setVelocidad(getVelocidad()-v);
		
	}

	public void acelerar(int v) {
		setVelocidad(getVelocidad()+v);
	}
	

}
