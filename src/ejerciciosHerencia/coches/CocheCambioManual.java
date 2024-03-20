package ejerciciosHerencia.coches;

public class CocheCambioManual extends Coche {

	public CocheCambioManual(String matricula) {
		super(matricula);
		
	}

	public void cambiarMarcha(int m) {
		if (marcha>MAX) {
			throw new IllegalArgumentException("Error, la marcha no puede ser superior a 4, su marcha: "+marcha);
		}
		setMarcha(m);
	}
	
	

}
