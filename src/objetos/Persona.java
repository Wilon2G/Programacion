package objetos;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Persona {
	private String nombre;
	private double altura;
	private Date fechaNacimiento;
	private String dni;
	
	
	public String toString() {
		return "//Persona --> DNI = "+dni+" nombre = " + nombre.toUpperCase() + ", altura = " + altura + ", fecha nacimiento = " + mostrarFechaNacimiento() ;
	}
	
	public Persona(String dni,String nombre, double altura, String fechaNacimiento) {
		super();
		setNombre(nombre);
		setAltura(altura);
		setFechaNacimiento(fechaNacimiento);
		setDni(dni);
	}
	
	
	
	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		if (dni==null) {
			throw new IllegalArgumentException("Error, debe introducir un DNI o NIE");
		}
		
		if (validarDniNie(dni)==null) {
			throw new IllegalArgumentException("Error, formato de DNI o NIE incorrecto");
		}
		this.dni = validarDniNie(dni);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		if (nombre==null) {
			throw new IllegalArgumentException("Error, se debe introducir un nombre");
		}
		if (nombre.trim().length()<=1) {
			throw new IllegalArgumentException("Error, el nombre debe estar compuesto por más de un caracter "+"["+nombre+"]");
		}
		this.nombre = nombre;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		if (altura<0) {
			throw new IllegalArgumentException("Error, la altura no puede ser menor que cero "+"["+altura+"]");
		}
		this.altura = altura;
	}

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}
	public String mostrarFechaNacimiento() {
		SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/YYYY");
		return sdf.format(fechaNacimiento);
	}

	public void setFechaNacimiento(String fechaNacimientoString) {
		if (fechaNacimientoString==null) {
			throw new IllegalArgumentException("Error, se debe introducir una fecha de nacimiento");
		}
		SimpleDateFormat sdf= new SimpleDateFormat("dd/MM/yyyy");
		try {
			setFechaNacimiento(sdf.parse(fechaNacimientoString));
			
		} catch (ParseException e) {
			throw new IllegalArgumentException("Error, formato de fecha incorrecto, debe ser dd/mm/yyyy");
		}
		
	}
	public void setFechaNacimiento(Date fechaNacimientoDate) {
		if (fechaNacimientoDate==null) {
			throw new IllegalArgumentException("Error, se debe introducir una fecha de nacimiento");
		}
		if (fechaNacimientoDate.getTime()>System.currentTimeMillis()) {
			throw new IllegalArgumentException("Error, la fecha de nacimiento debe ser anterior a la fecha actual");
		}
		
		this.fechaNacimiento = fechaNacimientoDate;
		
		
	}

	
	
	public static void main(String[] args) {
		Persona p=new Persona("72275397j","jose",2,"25/06/2020");
		Tenista t= new Tenista("72275397j", "Nadal", 2, "25/06/2020", 1, false);
		System.out.println(p);
		Date d1=new Date();
		if (t instanceof Persona) {
			System.out.println("tenista es persona");
		}
		int n=7;
		long l=7;
		n=(int)l; //Casting!!!
		
	}
	
	public static String validarDniNie(String dniNie) {
		// Devuelve el dni con 0's a la izquierda(hasta 8) y letra mayúscula si el dni
		// es válido.
		// Devuelve el nie con letras mayúsculas si el nie es válido.
		// null si el dni o nie no es válido
	
		char[] letras = { 'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H',
				'L', 'C', 'K', 'E' };
	
		if (dniNie == null)
			return null;
	
		String normalizado = dniNie.trim().toUpperCase(); // Quita espacios en blanco y convierte a mayúsculas
	
		String numero;
		if (normalizado.matches("[0-9]{1,8}[A-Z]")) {// dni
			// Rellenamos con ceros por la izquierda
			while (normalizado.length() < 9)
				normalizado = "0" + normalizado;
			numero = normalizado.substring(0, 8);
		} else {
			if (normalizado.matches("[XYZ][0-9]{7}[A-Z]")) {// nie
				numero = normalizado.substring(1, 8);
				//Obtiene 0, 1 ó 2 según X, Y o Z
				String prefijo="";
				switch (normalizado.charAt(0)) {//Analiza primera letra del nie
				case 'X':
					prefijo="0";
					break;
				case 'Y':
					prefijo="1";
					break;
				case 'Z':
					prefijo="2";
					break;
				}
				numero=prefijo+numero;
				
			} else { //No es un dni ni un nie
				return null;
			}
		}
	
	
		// letra final
		char letra = normalizado.charAt(normalizado.length() - 1);// La letra es el último carácter del dni
		// Obtiene letra del array a partir del número y compara con la letra final
		if (letra != letras[Integer.valueOf(numero) % 23])
			return null;
		return normalizado;
	}
	
	public static int calcularEdad(Date fechaNacimiento, Date fechaCalculo) {
		int año;
		GregorianCalendar gc1 =new GregorianCalendar();
		gc1.setTime(fechaNacimiento);
		GregorianCalendar gc2 =new GregorianCalendar();
		gc2.setTime(fechaCalculo);
		gc1.set(Calendar.HOUR, 0);
		gc1.set(Calendar.MINUTE, 0);
		gc1.set(Calendar.SECOND, 0);
		gc1.set(Calendar.MILLISECOND, 0);
		
		gc2.set(Calendar.HOUR, 0);
		gc2.set(Calendar.MINUTE, 0);
		gc2.set(Calendar.SECOND, 0);
		gc2.set(Calendar.MILLISECOND, 0);
		
		if (gc1.compareTo(gc2)<0) {
			throw new IllegalArgumentException("Error, la fecha de nacimiento debe ser mayor o igual a la fecha actual");
		}
		año=gc2.get(Calendar.YEAR)-gc1.get(Calendar.YEAR);
		if (gc2.get(Calendar.MONTH)<gc1.get(Calendar.MONTH)) {
			año--;
		}
		if (gc2.get(Calendar.MONTH)==gc1.get(Calendar.MONTH)) {
			if (gc2.get(Calendar.DAY_OF_MONTH)<gc1.get(Calendar.DAY_OF_MONTH)) {
				año--;
			}
		}
		
		return año;
	}
	
}
