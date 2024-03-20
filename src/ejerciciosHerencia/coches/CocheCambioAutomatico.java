package ejerciciosHerencia.coches;

public class CocheCambioAutomatico extends Coche {

	public CocheCambioAutomatico(String matricula) {
		super(matricula);
		
	}
	
	public void frenar(int v) {
		setVelocidad(getVelocidad()-v);
		if (getVelocidad()<=10) {
			cambiarMarcha(1);
		}
		if (getVelocidad()>10&&getVelocidad()<=20) {
			cambiarMarcha(2);
		}
		if (getVelocidad()>20&&getVelocidad()<=30) {
			cambiarMarcha(3);
		}
		if (getVelocidad()>30) {
			cambiarMarcha(4);
		}
	}

	public void acelerar(int v) {
		setVelocidad(getVelocidad()+v);
		if (getVelocidad()<=10) {
			cambiarMarcha(1);
		}
		if (getVelocidad()>10&&getVelocidad()<=20) {
			cambiarMarcha(2);
		}
		if (getVelocidad()>20&&getVelocidad()<=30) {
			cambiarMarcha(3);
		}
		if (getVelocidad()>30) {
			cambiarMarcha(4);
		}
	}

	

}
