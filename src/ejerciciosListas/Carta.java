package ejerciciosListas;

public class Carta {
	String palo;
	String tipo;
	
	public String getPalo() {
		return palo;
	}
	public void setPalo(String p) {
		
		this.palo = comprobarPalo(p);
		
	}
	
	private String comprobarPalo(String p) {
		if (p.equalsIgnoreCase("Oros")) {
			return "Oros";
		}
		if (p.equalsIgnoreCase("Copas")) {
			return "Copas";
		}
		if (p.equalsIgnoreCase("Espadas")) {
			return "Espadas";
		}
		if (p.equalsIgnoreCase("Bastos")) {
			return "Bastos";
		}
		else {
			throw new IllegalArgumentException("Error, Palo no reconocido "+p);
		}
	}
	private String comprobarTipo(String t) {
		if (t.equalsIgnoreCase("As")||t.equals("1")) {
			return "As";
		}
		if (t.equalsIgnoreCase("Dos")) {
			return "Dos";
		}
		if (t.equalsIgnoreCase("Tres")) {
			return "Tres";
		}
		if (t.equalsIgnoreCase("Cuatro")) {
			return "Cuatro";
		}
		if (t.equalsIgnoreCase("Cinco")) {
			return "Cinco";
		}
		if (t.equalsIgnoreCase("Seis")) {
			return "Seis";
		}
		if (t.equalsIgnoreCase("Siete")) {
			return "Siete";
		}
		if (t.equalsIgnoreCase("Sota")) {
			return "Sota";
		}
		if (t.equalsIgnoreCase("Caballo")) {
			return "Caballo";
		}
		if (t.equalsIgnoreCase("Rey")) {
			return "Rey";
		}
		else {
			throw new IllegalArgumentException("Error, Palo no reconocido "+t);
		}
		
	}
	
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = comprobarTipo(tipo);
	}
	
	
	public String toString() {
		return "El "+tipo+" de "+palo;
	}
	
	public Carta(String p, String t) {
		setTipo(t);
		setPalo(p);
	}
	public Carta(int palo, int tipo) {
		setTipo(String.valueOf(tipo));
		setPalo(String.valueOf(palo));
	}
	
	
	
	
}
