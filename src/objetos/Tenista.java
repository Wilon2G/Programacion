package objetos;

import java.text.SimpleDateFormat;

public class Tenista extends Persona {
	private int ranking;
	private boolean diestro;

	
	
	
	public int getRanking() {
		return ranking;
	}




	public void setRanking(int ranking) {
		this.ranking = ranking;
	}




	public boolean isDiestro() {
		return diestro;
	}




	public void setDiestro(boolean diestro) {
		this.diestro = diestro;
	}




	public Tenista(String dni,String nombre, double altura, String fechaNacimiento, int ranking, boolean diestro) {
		super(dni,nombre, altura, fechaNacimiento);
		this.setRanking(ranking);
		this.setDiestro(diestro);
		
	}




	@Override
	public String toString() {
		SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/YYYY");
		return "Tenista [ranking= " + ranking + ", diestro= " + diestro + ", DNI= " + getDni() + ", Nombre= " + getNombre()
				+ ", Altura= " + getAltura() + ", FechaNacimiento= " + mostrarFechaNacimiento() + "]";
	}




	public static void main(String[] args) {
		Tenista t1=new Tenista("72275397j","pepito",1.3,"3/2/1812",12,true);
		System.out.println(t1);
		Persona p=new Persona("72275397j","jose",2,"25/06/2020");
		p=t1;
		Persona p2=new Tenista("72275397j","pepito",1.3,"3/2/1812",12,true);
		p2=t1;
		t1=null;
		t1=(Tenista)p2; //downCasting
		
	}

}
