package objetos;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class Futbolista extends Persona{
	private int goles;
	private List<String> equipos;

	
	
	
	
	public Futbolista(String dni,String nombre, double altura, String fechaNacimiento, int goles) {
		super(dni,nombre, altura, fechaNacimiento);
		
		this.setGoles(goles);
		this.setEquipos(new ArrayList<String>());
	}




	@Override
	public String toString() {
		
		return "Futbolista [goles= " + goles + ", equipos= " + equipos + ", DNI= " + getDni() + ", Nombre= " + getNombre() + ", Altura= "
				+ getAltura() + ", FechaNacimiento= " + mostrarFechaNacimiento() + "]";
	}






	public int getGoles() {
		return goles;
	}





	public void setGoles(int goles) {
		if (goles<0) {
			throw new IllegalArgumentException("Error, los goles: "+goles+" no pueden ser negativos");
		}
		this.goles = goles;
	}





	public List<String> getEquipos() {
		return equipos;
	}





	public void setEquipos(List<String> equipos) {
		this.equipos = equipos;
	}





	public static void main(String[] args) {
		Futbolista f= new Futbolista("72275397j","pepe",2,"2/1/2001",5);
		Persona p=new Persona("72275397j","jose",2,"25/06/2020");
		Tenista t=new Tenista("72275397j","pepito",1.3,"3/2/1812",12,true);
		List <Persona> al= new ArrayList<Persona>();
		al.add(p);
		al.add(f);
		al.add(t);
		for (Persona persona : al) {
			if (persona instanceof Tenista) {
				Tenista t2=(Tenista)persona;
				System.out.println("Tenista, ránking: "+t2.getRanking());
			}
			else if (persona instanceof Futbolista) {
				Futbolista f2=(Futbolista)persona;
				System.out.println("Futbolista, goles: "+f2.getGoles());
			}
			else {
				System.out.println("Persona, dni: "+persona.getDni());
			}
		}
		System.out.println("==========================================");
		for (Persona persona : al) {
			if (persona.getClass().equals(Tenista.class)) {
				Tenista t2=(Tenista)persona;
				System.out.println("Tenista, ránking: "+t2.getRanking());
			}
			if (persona.getClass().equals(Futbolista.class)) {
				Futbolista f2=(Futbolista)persona;
				System.out.println("Futbolista, goles: "+f2.getGoles());
			}
			if (persona.getClass().equals(Persona.class)) {
				System.out.println("Persona, dni: "+persona.getDni());

			}
			
		}
	}

}
