package ejerciciosHerencia.coches;

public final class MatriculaInvalida extends RuntimeException {
	
	public MatriculaInvalida() {
		super("Matricula Inválida, el coche no se va a crear");
	}

	

}
